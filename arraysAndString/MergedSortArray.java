package arraysAndString;

import java.util.Arrays;

public class MergedSortArray {

    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 0, 0, 0};
//        int[] arr2 = {2, 5, 6};

//        int[] arr1 = {0};
//        int[] arr2 = {1};

        int[] arr1 = {0, 0, 3, 0, 0, 0, 0, 0, 0};
        int[] arr2 = {-1, 1, 1, 1, 2, 3};

        // 122000
        // 356
        mergeArrays(arr1, arr2, 3, 6);
        System.out.println(Arrays.toString(arr1));
    }

    public static void mergeArrays(int[] nums1, int[] nums2, int m, int n) {
        if (n == 0)
            return;
        int i = m - 1;
        int j = n - 1;
        int k = m +n -1;

        while (i>=0 && j>=0) {
            if (nums1[i] < nums2[j]) {
                nums1[k--] = nums2[j--];
            }
            else {
                nums1[k--] = nums1[i--];
            }
        }
        while (j>=0) {
            nums1[k--] = nums2[j--];
        }
    }

//    public static void mergeArrays(int[] nums1, int[] nums2, int m, int n) {
//        if (n == 0) {
//            return;
//        }
//        int i = m - 1,
//            j = n - 1,
//            k = m + n - 1;
//        while (i >= 0 && j >= 0) {
//            if (nums1[i] > nums2[j]) {
//                nums1[k--] = nums1[i--];
//            } else {
//                nums1[k--] = nums2[j--];
//            }
//        }
//        while (j >= 0) {
//            nums1[k--] = nums2[j--];
//        }
//    }
}
