package Data_Structure;
import java.util.*;
public class Array_Data_Structure {
	static Scanner sc = new Scanner(System.in);
	static int a=0;

	static int len = sc.nextInt();
	static int ls[] = new int[len];


	public static void main(String[] args) {
		Array_Data_Structure obj = new Array_Data_Structure();
	   // System.out.print("Enter the Array Length : ");
		System.out.println();
		for (int i=0;i<len;i++) {
			System.out.print("Enter the element : ");
			ls[i]=sc.nextInt();
			if(i==len-1) {
				i=0;
				len=2*len;
			}
		}
		System.out.println();

		
		System.out.println("-------Options--------");
		System.out.println(" 0. Print_The_Array_In_Insection_Order ");
		System.out.println(" 1. Print_The_Array_In_Reverse_Order  ");
		System.out.println(" 2. Enter_The_Position_OR_Element_To_Access  ");
		System.out.println(" 3. Enter_The_Position_OR_Element_To_Modify  ");
		System.out.println(" 4. Enter_The_Position_OR_Element_To_Delete  ");
		System.out.println(" 5. Enter_The_Element_To_Add  ");
		System.out.println();
		System.out.print("Enter the Option : ");
		 a =sc.nextInt();
		
		
		switch(a) {		
		case 1: obj.Print_The_Array_In_Insection_Order();
		case 2: obj.Print_The_Array_In_Reverse_Order();
		case 3: obj.Access_The_Array();
		case 4: obj.Modify_The_Array();
		case 5: obj.Delete_The_Array();
		case 0: obj.Insert_The_Array();
		}
	}
	
	
	
private void Print_The_Array_In_Reverse_Order() {
	
	}
//	private void Increase_The_Position_Of_Array() {
//		
//	}

	private void Insert_The_Array() {
		

		
	}

	private void Delete_The_Array() {
		
	}

	private void Modify_The_Array() {
	
	}

	private void Access_The_Array() {
		
	}

	private void Print_The_Array_In_Insection_Order() {
	}

}
