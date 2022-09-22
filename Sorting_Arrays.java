package Arrays;

public class Sorting_Arrays {

	public static void main(String[] args) {
		Sorting_Arrays obj = new Sorting_Arrays();

//		obj.Sorting_Arrays_Desending();
//		obj.Reverse_Printing();
//		obj.Sorting_Arrays_Asending_char();
//		obj.Sorting_Arrays_Desending_char();
		obj.Sorting_Arrays_Insertion();
		obj.Sorting_Arrays_Bubble();
		obj.Sorting_Arrays_Selection();
	}

private void Sorting_Arrays_Selection() {
	int ls[]= {6,5,6,74,45,3,45,5,42,78,1,0};
    int ls_1[]=new int [ls.length];
    int min=0;

	for(int i=0;i<ls.length;i++) {
       min=i;
	     for(int j=i+1;j<ls.length;j++) {
		
		   if(  ls[min]>ls[j] ) {
			   int temp=ls[j];
			   ls[j]= ls[min];
			   ls[min]=temp;			 
		}  
		}
	}
	
	for(int i=0;i<ls.length;i++) {
		System.out.print(ls[i]+" ");	
	}
    System.out.println();
}

private void Sorting_Arrays_Insertion() {
	int ls[]= {6,5,6,744,45,3,45,5,42,78};

	for(int i=1;i<ls.length;i++) {	
//		for(int j=i-1;j>=0;j--) {
//			if(ls[j]>ls[i]) {
//				int temp=ls[i];
//				ls[i]=ls[j];
//				ls[j]=temp;
//			}else
//				break;
//			i--;
//		}
		int key=ls[i];
		int j=i-1;
		while( j>=0 && ls[j]>key ) {  //original
			ls[i]=ls[j];
			i--;//6
		j--;	
		}ls[i]=key;
		
	}
	for(int i=0;i<ls.length;i++) {
		System.out.print(ls[i]+" ");	
	}
    System.out.println();
}
	
	

private void Sorting_Arrays_Desending_char() {
char ls[] = {'Z','x','t','f','B','A','C'};	
		int temp=0;
		for (int i=0;i<ls.length;i++) {
			for (int j=i+1;j<ls.length;j++) {				
			if((ls[i]  < ls[j]) ) {
				temp=ls[j];
				ls[j]=ls[i];
				ls[i]=(char) temp;
		         }
				}
		}
		for(int i=0;i<ls.length;i++) {
			System.out.print(ls[i]+" ");	
		}
System.out.println();
	}

	private void Sorting_Arrays_Asending_char() {
    char ls[] = {'Z','x','t','f','B','A'};
		
		int temp=0;
		for (int i=0;i<ls.length;i++) {
			for (int j=i+1;j<ls.length;j++) {
				
			if((ls[i]  > ls[j]) ) {
				temp=ls[j];
				ls[j]=ls[i];
				ls[i]=(char) temp;
		         }
				}
		}
		for(int i=0;i<ls.length;i++) {
			System.out.print(ls[i]+" ");	
		}
System.out.println();
	}

	private void Reverse_Printing() {
		int ls[]= {5,6,744,45,3,45,5,42,78};
		for(int i=ls.length-1;i>=0;i--) {
			System.out.print(ls[i]+" ");
		}
		
	}

private void Sorting_Arrays_Desending() {
int ls[] = {45,57,64,7,8,899,54,10,1,3,01,};
		
		int temp=0;
		for (int i=0;i<ls.length;i++) {
			for (int j=0;j<ls.length-1;j++) {
				
			if((ls[j]  < ls[j+1]) ) {
				temp=ls[j];
				ls[j]=ls[j+1];
				ls[j+1]=temp;
		         }
				}
		}
		for(int i=0;i<ls.length;i++) {
			System.out.print(ls[i]+" ");	
		}
System.out.println();
}
	

	private void Sorting_Arrays_Bubble() {
		int ls[] = {45,57,64,7,8,899,54,10,1,3,01};
		
		int temp=0;
		for (int i=0;i<ls.length;i++) {
			for (int j=0;j<ls.length-1;j++) {
				
			if((ls[j]  > ls[j+1]) ) {
				temp=ls[j];
				ls[j]=ls[j+1];
				ls[j+1]=temp;
		         }
				}
		}
		for(int i=0;i<ls.length;i++) {
			System.out.print(ls[i]+" ");	
		}
System.out.println();
}
}
