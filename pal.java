package Project2;

public class pal {

	static  boolean palindrome(String s) {
		boolean ispalindrome = false;
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			ispalindrome = true;
		}
		return ispalindrome;
	}
	public static void main(String[]args) {
		String[] s = {"Java","test","rotator","mom","lava"};
		boolean palin;
		for(int i=0;i<s.length;i++) {
			palin = palindrome(s[i]);
			if(palin) {
				System.out.println(s[i]);
			}
		}
		
	}
}
