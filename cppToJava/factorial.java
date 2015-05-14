import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int fact = s.nextInt();
		System.out.println(factorial(fact));
	}
	public int factorial(int f){
		if(f == 1)
			return 1;
		else{
			return f*factorial(f-1);
		}
	}
}