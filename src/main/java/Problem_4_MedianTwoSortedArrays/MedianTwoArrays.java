package Problem_4_MedianTwoSortedArrays;

import java.util.Arrays;

public class MedianTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combinedArr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, combinedArr, 0, nums1.length);
        System.arraycopy(nums2, 0, combinedArr, nums1.length, nums2.length);

        Arrays.sort(combinedArr);

        return (combinedArr.length % 2 == 0) ?
                ((double) (combinedArr[combinedArr.length / 2] + combinedArr[combinedArr.length / 2 - 1]) /2) :
                ((double) combinedArr[combinedArr.length/2]);
    }
}
