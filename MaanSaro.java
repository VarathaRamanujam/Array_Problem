package Hacker_Ranker;

import java.util.Scanner;

public class MaanSaro {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Deva obj= new Deva();
		System.out.print("Enter a Name: ");
		obj.name(sc.next());
		//obj.simpleInterest();
	}
	
	public void name(String s) {
		
		if(s.matches("[A-Za-z]+")) {
			System.out.println("valid");
			System.out.print("Enter Your Age :");
			age(sc.next());
		}else {
			
			System.out.println("Invalid Input");
			System.out.print("Enter a Name: ");
			name(sc.next());
		}
		
	}	
		
//		
//		boolean check=true;
//		for(int i=0;i<s.length();i++) {
//			if((s.charAt(i)>64 && s.charAt(i)<91) || (s.charAt(i)>=97 && s.charAt(i)<=122)) {
//				
//			}else {
//				check=false;
//			}
//		}	
//		if(check==true) {
//			System.out.println("valid name");
//			System.out.print("Enter Your Age :");
//			age(sc.next());
//		}else {
//			System.out.println("Invalid Input");
//			System.out.print("Enter a Name: ");
//			name(sc.next());
//		}	
//	}

	private void age(String i) {
		if(i.matches("[0-9]+")) {
			System.out.println("Valid Age");
			simpleInterest();
		
		}else {
			System.out.println("Invalid Input");
			System.out.print("Enter Your Age: ");
			age(sc.next());
		}
			
		
		
		
		
		
		
//	boolean check=true;
//	for(int j=0;j<i.length();j++) {
//		if(i.charAt(j)>='0'  && i.charAt(j)<='9')  {
//			
//		}
//		else 
//			check=false;	
//	}	
//		if(check==true) {
//			System.out.println("valid Age");
//			simpleInterest();
//		}else {
//			System.out.println("Invalid Input");
//			System.out.print("Enter Your Age: ");
//			age(sc.next());
//		}
	}
	
	private void simpleInterest() {
		System.out.print("Enter a Principle Amount :");
		int p = sc.nextInt();
		System.out.print("Enter a Number Of Year :");
		int n = sc.nextInt();
		System.out.print("Enter the Rate Of Interest % :");
		int r = sc.nextInt();
		int si=(p*n*r)/100;
		System.out.println(si);
		
	}
	

}
