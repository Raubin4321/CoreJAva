package Programming;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int f1 = 0;
		int f2 = 1;
		System.out.println("Fibonacci serires till the number " + n + " are :");
		for (int i = 1; i<=n; i++) {
			System.out.println(f1);
			int f3 = f1+f2;
			f1=f2;
			f2=f3;
			
		}

	}

}
