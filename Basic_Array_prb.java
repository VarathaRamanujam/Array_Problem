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
	
//	{
//		System.out.print("Enter the Array length : ");
//	 count = sc.nextInt();
//	 sc.close();
//	
//	}
	
	int [] ls = new int[count];
	public static void main(String[] args) {		
		Basic_Array_prb obj = new Basic_Array_prb();
//		obj.Basic_Array_prb_Creation();
//		obj.Basic_Array_prb_Sum_Of_Even_And_Odd();
//		System.out.println(obj.Basic_Array_prb_Diff_Of_Even_Odd());
//		obj.Basic_Array_prb_Index_Odd_Even();
//		System.out.println(obj.Basic_Array_prb_Diff_Index()+"  ");
//		obj.Basic_Array_prb_Merge_WithoutDuplicate_OfTwo(); //
//		obj.Basic_Array_prb_AdditionOfTwo();               //
//		obj.Basic_Array_prb_SubtractionOfTwo();           //
//		obj.Basic_Array_prb_MultipleOfTwo();             //
//		obj.Basic_Array_prb_CommonOfTwo();              //
//		obj.Basic_Array_prb_MergeOfTwo();              //
		obj.Basic_Array_prb_AUB_OfTwo();              //

	}

	private void Basic_Array_prb_AUB_OfTwo() {
		int ls_1[] = {4,5,2,56,3};
		int ls_2[] = {4,5,12,987,4,2,2,4,12};
		int diff=ls_2.length-ls_1.length;
		int ls_3[] = new int[ls_1.length+ls_2.length];
		for(int i=0;i<ls_3.length;i++) {
		   if(i<ls_1.length) {
			   ls_3[i]=ls_1[i];
		   } else {
				int count=0;
				   for(int j=i-1;j>=0;j--) {			   
					   if(ls_3[j]==ls_2[i-ls_2.length+diff])  
						   count++;
					   
				   } if(count==0)
					   ls_3[i]=ls_2[i-ls_2.length+diff];  
				 
			}
		}

		for(int i=0;i<ls_3.length;i++) {
		if(ls_3[i]>0)
			System.out.print(ls_3[i]+" ");
		}
	}

	private void Basic_Array_prb_Merge_WithoutDuplicate_OfTwo() {
		int ls_1[] = {4,5,2,56,4};
		int ls_2[] = {4,5,12,987,4,2,2,4,12};
		int diff=ls_2.length-ls_1.length;
		int ls_3[] = new int[ls_1.length+ls_2.length];
		for(int i=0;i<ls_3.length;i++) {
		   if(i<ls_1.length) {
			   int count=0;
		   for(int j=i-1;j>=0;j--) {			   
			   if(ls_3[j]==ls_1[i])  
				   count++;
			   
		   } if(count==0)
			   ls_3[i]=ls_1[i];
		   }
		   else {
			int count=0;
			   for(int j=i-1;j>=0;j--) {			   
				   if(ls_3[j]==ls_2[i-ls_2.length+diff])  
					   count++;
				   
			   } if(count==0)
				   ls_3[i]=ls_2[i-ls_2.length+diff];  
			 
		}
		}
		
		
		
		for(int i=0;i<ls_3.length;i++) {
		if(ls_3[i]>0)
			System.out.print(ls_3[i]+" ");
		}
	}

	private void Basic_Array_prb_MergeOfTwo() {
		int ls_1[] = {4,5,2,56};
		int ls_2[] = {4,5,12,987};
		int ls_3[] = new int[ls_1.length+ls_2.length];
		for(int i=0;i<ls_3.length;i++) {
		   if(i<ls_1.length)
			   ls_3[i]=ls_1[i];
		   else
			   ls_3[i]=ls_2[(i-ls_2.length)];
		}
		
		
		
		for(int i=0;i<ls_3.length;i++) {
		
			System.out.print(ls_3[i]+" ");
		}
	}

	private void Basic_Array_prb_CommonOfTwo() {
		int ls_1[] = {4,5,2,56,7};
		int ls_2[] = {4,5,12,987,7,4};
		int count =0;
		for(int i=0;i<ls_1.length;i++) {
			for(int j=0;j<ls_2.length;j++) {
			if(ls_1[i]==ls_2[j]) 
				count++;
		}
		}
		int ls_3[] = new int[count];
		int index=0;
		for(int i=0;i<ls_1.length;i++) {
			for(int j=0;j<ls_2.length;j++) {
			if(ls_1[i]==ls_2[j]) { 
				ls_3[index]=ls_1[i];
				index++;
				break;
			}
		}
		}
		
		
		
		
		for(int i=0;i<ls_3.length;i++) {
		    if(ls_3[i]!=0)
			System.out.print(ls_3[i]+" ");
		}
	}

	private void Basic_Array_prb_MultipleOfTwo() {
		int ls_1[] = {4,5,2,56};
		int ls_2[] = {4,5,12,987};
		int ls_3[] = new int[ls_1.length];
		for(int i=0;i<ls_1.length;i++) {
			ls_3[i]=ls_2[i]*ls_1[i];
		}
		for(int i=0;i<ls_1.length;i++) {
			//ls_3[i]=ls_2[i]+ls_1[i];
			System.out.print(ls_3[i]+" ");
		}
	}

	private void Basic_Array_prb_SubtractionOfTwo() {
		int ls_1[] = {4,5,2,56};
		int ls_2[] = {41,45,12,987};
		int ls_3[] = new int[ls_1.length];
		for(int i=0;i<ls_1.length;i++) {
			if(ls_2[i]>ls_1[i])
			ls_3[i]=ls_2[i]-ls_1[i];
			else
				ls_3[i]=ls_1[i]-ls_2[i];
				
		}
		for(int i=0;i<ls_1.length;i++) {
			//ls_3[i]=ls_2[i]+ls_1[i];
			System.out.print(ls_3[i]+" ");
		}
	}

	private void Basic_Array_prb_AdditionOfTwo() {
		int ls_1[] = {4,5,2,56};
		int ls_2[] = {4,5,12,987};
		int ls_3[] = new int[ls_1.length];
		for(int i=0;i<ls_1.length;i++) {
			ls_3[i]=ls_2[i]+ls_1[i];
		}
		for(int i=0;i<ls_1.length;i++) {
			//ls_3[i]=ls_2[i]+ls_1[i];
			System.out.print(ls_3[i]+" ");
		}
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
