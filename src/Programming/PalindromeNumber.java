package Programming;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 404, reverseNum = 0, r;

	    int num1 = num;
	    
	    while (num != 0) {
	      r = num % 10;
	      reverseNum = reverseNum * 10 + r;
	      num /= 10;
	    }
	    
	    
	    if (num1 == reverseNum) {
	      System.out.println(num1 + " is Palindrome.");
	    }
	    else {
	      System.out.println(num1 + " is not Palindrome.");
	    }
	  }

}
