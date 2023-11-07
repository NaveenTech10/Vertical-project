//SORT FIRST HALF IN ASCENDING AND SECOND HALF IN DESCENDING...
package Project2;

import java.util.Arrays;
import java.util.Scanner;

public class FirstSecondHalf {
	public static void main(String[] args) {
         int[]arr=new int[6];
		
		System.out.println("ENTER THE ARRAY ELEMENTS...");
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();	
		}
		
		System.out.println("THE ARRAY ELEMENTS ARE...");
		System.out.println(Arrays.toString(arr));
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n/2;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
		
				}
			}
			for(int j=n/2;j<n-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
		
	}