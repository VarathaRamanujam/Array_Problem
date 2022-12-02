package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Array_Basic_Max_Min {

	public static void main(String[] args) {
		Array_Basic_Max_Min obj = new Array_Basic_Max_Min();
		//obj.Array_Basic_Max();
		//obj.Array_Basic_Min();
		//obj.Array_Basic_Avg();
//		obj.Array_Basic_Max_char();
//		obj.Array_Basic_Min_char();
		obj.Hacker_Max_Min();
	}

	private void Hacker_Max_Min() {
		List arr = new ArrayList();
		arr.add(256741038);
		arr.add(623958417);
		arr.add(467905213);
		arr.add(714532089);
		arr.add(938071625);
		System.out.println(arr.get(0));
		
		  Long ls[] = new Long[arr.size()];   
		    for(int i=0;i<arr.size();i++){
		        long sum=0;
		        for(int j=0;j<arr.size();j++){
		            if(i!=j)
		             sum=sum+(int)arr.get(j);
		        }ls[i]=sum;
		    }
		   
		 //   2744467344
		   for(int i=0;i<ls.length;i++){
		       for(int j=0;j<ls.length;j++){  
		            if(ls[i]<ls[j]  && i!=j){
		              Long temp =ls[i];
		              ls[i]=ls[j];
		              ls[j]=temp;
		           }
		       }
		   }
		    //   for(int i=0;i<ls.length;i++)
		    // System.out.println(ls[i]);
		    
		     System.out.println(ls[0]+" "+ls[ls.length-1]);
		    
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
