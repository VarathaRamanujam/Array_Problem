package Arrays;
import java.util.Arrays;
public class Array_Basic_Max_Min {

	public static void main(String[] args) {
		Array_Basic_Max_Min obj = new Array_Basic_Max_Min();
		//obj.Array_Basic_Max();
		//obj.Array_Basic_Min();
		//obj.Array_Basic_Avg();
		obj.Array_Basic_Max_char();
		obj.Array_Basic_Min_char();
	}

	private void Array_Basic_Min_char() {
		char ls[]= {'A','X','O','E','I'};
		char min=ls[0];
		for(int i=1;i<ls.length;i++) {
			if(min>ls[i])
				min=ls[i];
		}
		System.out.println("Minimum element of the list is : "+min);
	}

	private void Array_Basic_Max_char() {
		char ls[]= {'A','X','O','E','I'};
		char max=ls[0];
		for(int i=1;i<ls.length;i++) {
			if(max<ls[i])
				max=ls[i];
		}
		System.out.println("Maximum element of the list is : "+max);
	}

	private void Array_Basic_Avg() {
		int ls[]= {5,6,744,45,3,45,5,42,788,1};
		int avg=0;
		
		Arrays.sort(ls);
		for(int i=0;i<ls.length;i++) {
			avg+=ls[i];
		}
		System.out.println("Average element of the list is : "+avg/ls.length);
		for(int i=0;i<ls.length;i++) {
			System.out.print(ls[i]+" ");	
		}
	}

	private void Array_Basic_Min() {
		int ls[]= {5,6,744,45,3,45,5,42,788,1};
		int min=ls[0];
		for(int i=1;i<ls.length;i++) {
			if(min>ls[i])
				min=ls[i];
		}
		System.out.println("Minimum element of the list is : "+min);
	}
	

	private void Array_Basic_Max() {
		int ls[]= {5,6,744,45,3,45,5,42,788};
		int max=ls[0];
		for(int i=1;i<ls.length;i++) {
			if(max<ls[i])
				max=ls[i];
		}
		System.out.println("Maximum element of the list is : "+max);
	}

}
