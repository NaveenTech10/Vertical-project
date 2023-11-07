package Project2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[][] a= new int[4][4];
		System.out.println("Enter array with 4 rows and 4 columns");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = s.nextInt();
			}
	}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}	
	}

}
