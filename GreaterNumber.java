package Basic;

import java.util.Scanner;

public class GreaterNumber {
	int x,y;
	void Numbers() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 1st Number");
		x= s.nextInt();
		System.out.println("Enter 2nd Number");
		y= s.nextInt();
		
	}
	void Compare() {
		if(x>y) {
			System.out.println("X is greater than Y=    " +x);
		}
		else {
			System.out.println("Y is greater than X=    " +y);
		}
			
	}
	

	public static void main(String[] args) {
		GreaterNumber g= new GreaterNumber();
		g.Numbers();
		g.Compare();

	}

}
