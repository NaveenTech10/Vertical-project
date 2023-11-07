package Project2;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
public static void main(String[] args) {

	int[]arr=new int[5];
	
	System.out.println("ENTER THE ARRAY ELEMENTS...");
	Scanner input=new Scanner(System.in);
	
	for(int i=0;i<arr.length;i++) {
		arr[i]=input.nextInt();	
	}
	
	System.out.println("THE ARRAY ELEMENTS ARE...");
	System.out.println(Arrays.toString(arr));
	System.out.println("SORTED ARRAY IS :");
	int n=arr.length;
	for(int i=0;i<n;i++) {
		int flag=0;
		for(int j=0;j<n-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
			}
			}
		if(flag==0) {
			break;
		}
	}
	System.out.println(Arrays.toString(arr));
}
}