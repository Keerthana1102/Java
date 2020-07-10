package myFirstJavaProject;
import java.util.*;

public class MinutesConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long year_minutes = 365 * 24 * 60;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the number of minutes: ");
		
		long minutes = sc.nextLong();
		
		long years = (long) (minutes / year_minutes);
		long days = (long) (minutes / (60 * 24)) % 365;
		
		System.out.println(minutes + " is approximately " + years + " years and " + days + " days");

	}

}
