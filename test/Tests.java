package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Tests {

    public static void main(String args[]) {
        Map<String, Object> sample = new HashMap<>();
        sample.put("FileSizeInafoInQueue", "abc");
        sample.put("FileInfoaInQueue", "def");

        Map<String, Object> lookup = Optional
            .ofNullable(sample)
            .orElse(new HashMap<>());

        lookup.putIfAbsent("FileSizeInfoInQueue", "");
        lookup.putIfAbsent("FileInfoInQueue", "");
        System.out.println(lookup);

    }
}
