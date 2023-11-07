//Duplicate elements in array.
package Project2;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,1,2,2,4};
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			System.out.println(arr[i]);
			break;
		}
	}
}
	}

}
