import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i, j;
        double median;
        int newarr[] = new int[nums1.length + nums2.length];
        for (i = 0; i < nums1.length; i++) {
            newarr[i] = nums1[i];
        }
        for (j = 0; j < nums2.length; j++) {
            newarr[nums1.length + j] = nums2[j];
        }

        Arrays.sort(newarr);

        if (newarr.length % 2 == 0) {
            median = (newarr[newarr.length / 2 - 1] + newarr[newarr.length / 2]) / 2.0;
        } else {
            median = newarr[newarr.length / 2];
        }
        return median;
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     Solution s1 = new Solution();

    //     System.out.println("Enter the number of elements in array 1:");
    //     int n1 = sc.nextInt();
    //     int nums1[] = new int[n1];
    //     System.out.println("Enter the elements in array 1:");
    //     for (int i = 0; i < n1; i++) {
    //         nums1[i] = sc.nextInt();
    //     }

    //     System.out.println("Enter the number of elements in array 2:");
    //     int n2 = sc.nextInt();
    //     int nums2[] = new int[n2];
    //     System.out.println("Enter the elements in array 2:");
    //     for (int i = 0; i < n2; i++) {
    //         nums2[i] = sc.nextInt();
    //     }

    //     double median = s1.findMedianSortedArrays(nums1, nums2);
    //     System.out.println("The median is: " + median);
    // }
}
