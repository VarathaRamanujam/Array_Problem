package Arrays;

public class Pattern_printing {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			for(int j1=4;j1>=i;j1--) {
				System.out.print("  ");
				}
			int a=i;
			for(int j2=1;j2<=i;j2++) {
				System.out.print(a+" ");
				a++;
			   }
			a-=2;
			for(int j2=1;j2<i;j2++) {
				System.out.print(a+" ");
				a--;
			   }
			
			System.out.println();
			}
		}
		
		
	}



