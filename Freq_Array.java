package Arrays;

import java.util.Arrays;

public class Freq_Array {

	public static void main(String[] args) {
		
		
		int ss[]= {2,1,7,5,7,1,3,2};
		int freq[]=new int[ss.length];
		
		for(int i=0;i<ss.length;i++) {
			boolean flag =true;
			int count=1;
			
			for(int j=i-1;j>=0;j--) {
				if(ss[i]==(ss[j]))
					flag=false;
			}
			
			if(flag ==true)
			{
				for(int j=0;j<ss.length;j++) {
					if(ss[i]==ss[j] && i!=j)
						count++;
				}
				freq[i]=count;
			}
		}
		//Arrays.sort(ss);
		for(int i = 0;i<ss.length;i++){
			if(freq[i]>=1)
			System.out.println(ss[i]+" "+freq[i]);
		}
			
		}

}
