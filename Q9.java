package SelfEvaluationLab01;
//Q 9 wap to print  fabonaci series of given number

import java.util.*;

public class Q9 {
	int  a,b,c;
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter Number a  ");
		a= sc.nextInt();
		System.out.println("enter Number b  ");
		b= sc.nextInt();
	}
	 void Fabonacci() {
		 for (int i=1;i<=10;i++) {
			 System.out.println("  "+a);
			 c=a+b;
				a=b;
				b=c;
		 }
		
		
	}
	

	public static void main(String[] args) {
		Q9 x= new Q9();
		x.input();
		x.Fabonacci();
	}

}
