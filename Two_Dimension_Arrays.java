package Arrays;

import java.util.Scanner;

public class Two_Dimension_Arrays {

	public static void main(String[] args) {
		Two_Dimension_Arrays obj = new Two_Dimension_Arrays();
		//obj.Two_Dimension_Arrays_Transpose();
		//obj.Two_Dimension_Arrays_Addition();
		//obj.Two_Dimension_Arrays_Subtraction();
		//obj.Two_Dimension_Arrays_Multiple();
		//obj.Basic_Array_prb_Diagonal_Diff();
	}
	private void Basic_Array_prb_Diagonal_Diff() {
		int ls_1[][] = {{4,5,2,3},{4,5,12,6},{4,5,2,3},{4,2,56,3}};
		int x_1=0;
		int x_2=0;
		for(int i=0;i<ls_1.length;i++) {
			for(int j=0;j<ls_1.length;j++) {
				if(i==j) {
					x_1+=ls_1[i][j];
				}
				if(i+j==ls_1.length-1) {
					x_2+=ls_1[i][j];
				}
			}
		}System.out.println("Difference is : "+(x_2-x_1));
		//System.out.println(x_1);	
	}

private void Two_Dimension_Arrays_Multiple() {
//	int arr[][]= {{23,56,6},{5,33,5},{2,5,7}};
//	int ls[][]={{23,56,6},{5,33,5},{2,5,7}};
//	int add[][]=new int [3][3];
	int arr [][]=new int[2][3];
	int ls[][]=new int [2][3];
	int add[][]=new int [2][3];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++)
			{
			System.out.print("Enter a array element list_1 : ");
	           arr[i][j]=sc.nextInt();
	           System.out.print("Enter a array element list_2 : ");
	           ls[i][j]=sc.nextInt();
			}System.out.println();
    }
	
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
//	int arr[][]= {{23,56,6},{5,33,5},{2,5,7}};
//	int ls[][]={{23,56,6},{5,33,5},{2,5,7}};
//	int add[][]=new int [3][3];
	int arr [][]=new int[2][3];
	int ls[][]=new int [2][3];
	int add[][]=new int [2][3];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++)
			{
			System.out.print("Enter a array element list_1 : ");
	           arr[i][j]=sc.nextInt();
	           System.out.print("Enter a array element list_2 : ");
	           ls[i][j]=sc.nextInt();
			}System.out.println();
    }
	
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
//		int arr[][]= {{23,56,6},{5,33,5},{2,5,7}};
		
		
		int arr [][]=new int[2][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				{System.out.print("Enter a array element : ");
		           arr[i][j]=sc.nextInt();
				}System.out.println();
	    }
		int ls[][]=new int[arr.length][3];
		
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
