package Arrays;
import java.math.*;
public class Array_Solved_UsingFormula {

	public static void main(String[] args) {
		Array_Solved_UsingFormula obj = new Array_Solved_UsingFormula();
		//obj.Array_Solved_UsingFormula_1();   // root of (x2-x1)'2 + (y2-y1)'2
		//obj.Array_Solved_UsingFormula_2();  // a'2 + b'2 + 2ab
		//obj.Array_Solved_UsingFormula_3(); // SI = p*r*t/100;
		obj.Array_Solved_UsingFormula_4();//  Compound Interest = P * [(1 + i)n – 1]
	}

	
	   private void Array_Solved_UsingFormula_4() {
		   double principle=100000; // initial amount 
		   float rate_of_interest= (7/100f)+1; // interest
		   double n=10; //no. of year , month , days 
		   System.out.println(rate_of_interest);
		   double calc = 1;
		  // double calc =  Math.pow(0.07+1, 10);
		   for(int i=1;i<=n;i++)
			   calc*=rate_of_interest;
		   System.out.println("Compound Interest : "+(calc-1)*principle);
	}


	private  void Array_Solved_UsingFormula_3() {
			//find % : 12/100 * amount = answer
			// answer/amount=(percentage)
		int principle=10000; // initial amount 
		int rate_of_interest=8;
		int time=1;  // no. of years
		System.out.println("Simple Interest : "+((principle*rate_of_interest*time)/100));
		
		   
	}


	private void Array_Solved_UsingFormula_2() {
		double a=10;
		double b=79;
		a = Math.pow(a, 2);
		b= Math.pow(b, 2);
		System.out.println("a'2 + b'2 + 2ab : "+ (a+b+(2*a*b)));
	}

	private void Array_Solved_UsingFormula_1() {
		int ls[]= {9,5,3,7};
		double x1=ls[1]-ls[0];
		 x1= Math.pow(x1, 2);
		int y1 =ls[3]-ls[2];
		 y1=(int) Math.pow(y1, 2);		
		double ans=x1+y1;		
		System.out.println("Distance Between Two Origin : "+Math.sqrt(ans));
//		int avg=0;
//		//System.out.println(9.2/0.95);
//		for(int i=0;i<ls.length;i++)
//			avg+=ls[i];
//		
//		avg =avg/ls.length;
//		int j=0;
//		//System.out.println(avg);
//		for(int i=0;i<ls.length;i++) {
//			if(avg>ls[i]) {
//				ls[j]=ls[i];
//				
//			}
//			else
//				ls[j]=0;
//			j++;
//		}
//		for(int i=0;i<ls.length;i++)
//			if(ls[i]>0)
//			System.out.println(ls[i]);
		
	}

}
