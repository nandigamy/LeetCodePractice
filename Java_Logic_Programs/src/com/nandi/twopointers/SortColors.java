package com.nandi.twopointers;

import java.util.Arrays;

public class SortColors {

	
	public static int[] sortColors(int[] nums) {

		int n = nums.length;

		int i = 0;
		int j = 0;
		while (j < n) {

			if (nums[j] == 0) {

				swap(nums, i, j);
				i++;
			}
			j++;
		}
		
		//System.out.println("i value  "+ i + " " + nums[i]);
		int k= i;
	
		
		while (k < n) {

			if (nums[k] == 1) {

				swap(nums, i, k);
				i++;
			}
			k++;
		}
		
		

		return nums;
	}
	
	public static int[] sortColors2( int[] colors) {
		
		int low=0;
		int mid=0;
		int high= colors.length-1;
		while(mid<=high) {
			
			if(colors[mid]==0) {
				
				swap(colors, low, mid);
				low++;
				mid++;
				
			} else if(colors[mid]==1) {
				mid++;
				
			}else {
				swap(colors,mid, high);
				high--;
			}
			
		}
		
		
		
		return colors;
		
		
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {

		int[] result = sortColors2(new int[] {  0 ,1,0,2,1,2});

		System.out.println(Arrays.toString(result));

	}

}
