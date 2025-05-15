package hashMap;

import java.util.HashMap;

public class RamsonNote {

    public static void main(String[] args) {
        String a = "aaab";
        String b = "ba";
        if (a == null || a == "") {
            return;
        }
        System.out.println(extracted(a, b));
    }

    private static boolean extracted(String a, String b) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : b.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : a.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }
}
