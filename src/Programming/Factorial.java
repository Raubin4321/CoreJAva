package Programming;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10, f = 1;
        for(int i = 1; i <= num; ++i)
        {
            f = f * i;
            
        }
        System.out.println("Factorial of number "+ num +" is : "+ f);

	}

}
