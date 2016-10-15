package fcu.iecs.oop;
import java.util.Scanner;
public class KeyboardScanner {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int i;
		float f;
		String name;
		
		System.out.print("Enter a integer: ");
		i=scn.nextInt();
		
		System.out.print("Enter a float point number: ");
		f=scn.nextFloat();
		
		System.out.print("Enter your name: ");
		name=scn.next();
		
		System.out.printf("Hi %s, the multiplication of %d and %.5f is %e.",name,i,f,i*f);
		
		scn.close();
	}

}
