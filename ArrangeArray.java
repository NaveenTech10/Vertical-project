package Project2;

import java.util.Arrays;

public class ArrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] numbers = {9,-1,2,-3,5,-4,7,3};

	        int left = 0; // Pointer for the left side (negative numbers)
	        int right = numbers.length - 1; // Pointer for the right side (positive numbers)

	        while (left <= right) {
	            if (numbers[left] < 0 && numbers[right] >= 0) {
	                // Swap the elements if the left element is negative and the right element is positive
	                int temp = numbers[left];
	                numbers[left] = numbers[right];
	                numbers[right] = temp;
	                left++;
	                right--;
	            } else {
	                // Move the pointers inward if the elements are already in the correct side
	                if (numbers[left] >= 0) {
	                    left++;
	                }
	                if (numbers[right] < 0) {
	                    right--;
	                }
	            }
	        }

	            System.out.print(Arrays.toString(numbers) + " ");
	
	    }

}
