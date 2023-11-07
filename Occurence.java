package Project2;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {1,1,1,2,4,2};
for(int i=0;i<arr.length;i++) {
int count=1;
if(arr[i]==-1) {
	continue;
}

for(int j=i+1;j<arr.length;j++) {
	if(arr[i]==arr[j]) {
		count++;
		arr[j]=-1;
	}
}
if(count>0) {
	System.out.println("element "+arr[i]+"occurs"+count+"times");
}
if(count>1) {
	System.out.println("Duplicate element"+arr[i]);
}
}
	
}

}
