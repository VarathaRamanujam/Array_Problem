package Arrays;

import java.util.List;

public class Array_Max_Min_Diff {
	public static void main(String[] args) {
		Array_Max_Min_Diff obj = new Array_Max_Min_Diff();
		obj.Array_Max_Min();
	}

	private void Array_Max_Min() {
		int ls[] = {8,4,9,3,2,1,5,6,23,10};
		int k=0;
		
		List[] in =new List[7];
		int list [ ] = new int [ls.length];
		for(int j=0;j<ls.length;j++) {
			int sum= 0;	
		for (int i=0;i<ls.length;i++) {		
			if(i!=j) {
				sum= sum+ls[i];
			}
		} //System.out.print(sum+" ");		
		list[k]=sum;
		k++;
	}
	
	
	for(int i=0;i<ls.length;i++) {
		System.out.print(list[i]+" ");
	}System.out.println();
	int temp=0;
	for (int i=0;i<ls.length;i++) {
		for(int j=0;j<ls.length-1;j++) {
			if(list[j]>list[j+1]) {
				temp=list[j];
				list[j]=list[j+1];
				list[j+1]=temp;				
			}	
		}
			}
	int Min=0,Max=0,Diff=0;
	Min=list[0];
	Max=list[ls.length-1];
	Diff=Max-Min;
	System.out.println("Min "+list[0]);
	System.out.println("Max "+list[ls.length-1]);
	System.out.println("Difference "+ Diff);	
	}
}
