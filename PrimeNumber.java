package javaMyCaptain;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		for(int i=2;i*i<num;i++) {
			if(num%i==0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println(num+" is a Prime Number");
		}
		else {
			System.out.println(num+" is not a Prime Number");
		}
		
	}

}
