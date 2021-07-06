package week1.day1;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 11, 4, 6, 7 };

		Arrays.sort(nums);
        
		//int secondLast = nums[nums.length - 2];
		System.out.println(nums[nums.length-2]);

	}

}
