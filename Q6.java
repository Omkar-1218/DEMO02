package SelfEvaluationLab01;
//Q 6  write a program  to ask name and code (String) of security staff .
//if code =="COOLCOOL" then print "welcome user" else Ask him to reenter code .
//and maximum chance to enter code is 3.After third attempt print "GoBack".

import java.util.*;

public class Q6 {
	String name,Password, code="COOLCOOL";
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name = ");
		name= sc.next();
		System.out.println("Enter Password = ");
		Password= sc.next();
	}
	void Check() {
		
		for (int i=1;i<=3;i++);
		
		if (Password==code) 	System.out.println("Welcome User");
		else 			System.out.println("Go Back");
		
	}
	
			

	public static void main(String[] args) {
		Q6 x= new Q6();
		x.input();
		x.Check();
		
	

	}

}
