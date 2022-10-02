package Arrays;

import java.util.Scanner;

public class Two_Dimension_Arrays {

	public static void main(String[] args) {
		Two_Dimension_Arrays obj = new Two_Dimension_Arrays();
		//obj.Two_Dimension_Arrays_Transpose();
		//obj.Two_Dimension_Arrays_Addition();
		//obj.Two_Dimension_Arrays_Subtraction();
		obj.Two_Dimension_Arrays_Multiple();
	}
private void Two_Dimension_Arrays_Multiple() {
	int arr[][]= {{23,56,6},{5,33,5},{2,5,7}};
	int ls[][]={{23,56,6},{5,33,5},{2,5,7}};
	int add[][]=new int [3][3];
//	int arr [][]=new int[2][3];
//	int ls[][]=new int [2][3];
//	int add[][]=new int [2][3];
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[i].length;j++)
//			{
//			System.out.print("Enter a array element list_1 : ");
//	           arr[i][j]=sc.nextInt();
//	           System.out.print("Enter a array element list_2 : ");
//	           ls[i][j]=sc.nextInt();
//			}System.out.println();
//    }
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			add[i][j]=ls[i][j]*arr[j][i]; // Transpose.....			      
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
	          System.out.print( add[i][j]+"  ");
		}
   System.out.println();
	}
	}
private void Two_Dimension_Arrays_Subtraction() {
	int arr[][]= {{23,56,6},{5,33,5},{2,5,7}};
	int ls[][]={{23,56,6},{5,33,5},{2,5,7}};
	int add[][]=new int [3][3];
//	int arr [][]=new int[2][3];
//	int ls[][]=new int [2][3];
//	int add[][]=new int [2][3];
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[i].length;j++)
//			{
//			System.out.print("Enter a array element list_1 : ");
//	           arr[i][j]=sc.nextInt();
//	           System.out.print("Enter a array element list_2 : ");
//	           ls[i][j]=sc.nextInt();
//			}System.out.println();
//    }
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			add[i][j]=ls[i][j]-arr[j][i]; // Transpose.....			      
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
	          System.out.print( add[i][j]+"  ");
		}
   System.out.println();
	}
	}
private void Two_Dimension_Arrays_Addition() {
	int arr[][]= {{23,56,6},{5,33,5},{2,5,7}};
	int ls[][]={{23,56,6},{5,33,5},{2,5,7}};
	int add[][]=new int [3][3];
//	int arr [][]=new int[2][3];
//	int ls[][]=new int [2][3];
//	int add[][]=new int [2][3];
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[i].length;j++)
//			{
//			System.out.print("Enter a array element list_1 : ");
//	           arr[i][j]=sc.nextInt();
//	           System.out.print("Enter a array element list_2 : ");
//	           ls[i][j]=sc.nextInt();
//			}System.out.println();
//    }
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			add[i][j]=ls[i][j]+arr[j][i]; // Transpose.....			      
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
	          System.out.print( add[i][j]+"  ");
		}
   System.out.println();
	}
	}
	
Scanner sc =new Scanner (System.in);
	private void Two_Dimension_Arrays_Transpose() {
		int arr[][]= {{23,56,6},{5,33,5},{2,5,7}};
		int ls[][]=new int[arr.length][3];
		
//		int arr [][]=new int[2][3];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++)
//				{System.out.print("Enter a array element : ");
//		           arr[i][j]=sc.nextInt();
//				}System.out.println();
//	    }
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				ls[i][j]=arr[j][i]; // Transpose.....			      
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
		          System.out.print( ls[i][j]+"  ");
			}
	   System.out.println();
		}
		}

}
