package Arrays;

import java.util.Scanner;

public class Basic_Array_prb {
	Scanner sc= new Scanner(System.in);
	int count =0;
	int sumOfEven =0;
	int sumOfOdd=0;
	int Diff_Data=0;
	int sumOfEvenIndex=0;
	int sumOfOddIndex=0;
	int Diff_Index=0;
	
	{
		System.out.print("Enter the Array length : ");
	 count = sc.nextInt();
	 sc.close();
	
	}
	
	int [] ls = new int[count];
	public static void main(String[] args) {		
		Basic_Array_prb obj = new Basic_Array_prb();
		obj.Basic_Array_prb_Creation();
		obj.Basic_Array_prb_Sum_Of_Even_And_Odd();
		System.out.println(obj.Basic_Array_prb_Diff_Of_Even_Odd());
		obj.Basic_Array_prb_Index_Odd_Even();
		System.out.println(obj.Basic_Array_prb_Diff_Index()+"  ");
		
	}

	private int Basic_Array_prb_Diff_Index() {
		Diff_Index=sumOfEvenIndex-sumOfOddIndex;
	return Diff_Index;	
	}

	private void Basic_Array_prb_Index_Odd_Even() {
		for (int i=0;i<ls.length;i++) {
			//System.out.print( ls[i]);
		if(i%2==0) {
			sumOfEvenIndex=ls[i]+sumOfEvenIndex;
			
		}else
			sumOfOddIndex=ls[i]+sumOfOddIndex;
		}
	}

	private int  Basic_Array_prb_Diff_Of_Even_Odd() {
	Diff_Data=sumOfEven-sumOfOdd;
	return Diff_Data;
	}

	private void Basic_Array_prb_Sum_Of_Even_And_Odd() {
		for (int i=0;i<ls.length;i++) {
		if(ls[i]%2==0) {
		   sumOfEven=ls[i]+sumOfEven;
			
		}else
		   sumOfOdd=ls[i]+sumOfOdd;
		int a = sc.nextInt();
		}
	}

	private void  Basic_Array_prb_Creation() {
	for (int i=0;i<ls.length;i++) {
		System.out.print("Enter the Array Elements : ");
		ls[i]=sc.nextInt();
	}
	}

}
