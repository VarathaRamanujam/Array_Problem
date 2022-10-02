package Arrays;

public class Spiral_Matric_2D {

	public static void main(String[] args) {
		Spiral_Matric_2D obj = new Spiral_Matric_2D();
		//Spiral_Matric_2D obj1 = new Spiral_Matric_2D();
		//obj.Spiral_Matric_2D();
		
		
		//System.out.println(" "+(5+7));
		obj.Spiral_Matric_2D_Char();
		
	}

	private void Spiral_Matric_2D_Char() {		
		char a[][ ] = new char[5][5];
		char count='A';
		int rowmin=0;
		int rowmax=a.length-1;
		int colmin=0;
		int colmax=a.length-1;
		//int loop = a.length*a.length;
		//System.out.println(loop);
		//System.out.println(count+1);
		while(count<90) {
			
		for(int col=colmin;col<=colmax;col++) {
			a[rowmin][col]=count;
			//System.out.println(count);
			count=(char) (count+1);
			//System.out.println(count);
		}
		for(int row=rowmin+1;row<=rowmax;row++) {
			a[row][colmax]=count;
			//System.out.println(count);
			count=(char) (count+1);
			
		}
		for(int col=colmax-1;col>=colmin;col--) {
			a[rowmax][col]=count;
			//System.out.println(count);
			count=(char) (count+1);
		}
		for(int row=rowmax-1;row>=rowmin+1;row--) {
			a[row][colmin]=count;
			//System.out.println(count);
			count=(char) (count+1);
		}
		//System.out.println(count);
		colmin++;
		rowmin++;
		colmax--;
		rowmax--;
	}
		//System.out.println(count+1);		
		for(int k=0;k<a.length;k++) {
			for(int l=0;l<a[k].length;l++) {
				System.out.print(a[k][l]+"\t");
			}System.out.println();
		}
		
	}
	

	private void Spiral_Matric_2D() {
		int a[][ ] = new int[5][5];
		int count=1;
		int rowmin=0;
		int rowmax=a.length-1;
		int colmin=0;
		int colmax=a.length-1;
		int loop = a.length*a.length;
		//System.out.println(loop);
	while(count<=loop) {
			
		for(int col=colmin;col<=colmax;col++) {
			a[rowmin][col]=count;
			count++;			
		}
		for(int row=rowmin+1;row<=rowmax;row++) {
			a[row][colmax]=count;
			count++;
		}
		for(int col=colmax-1;col>=colmin;col--) {
			a[rowmax][col]=count;
			count++;
		}
		for(int row=rowmax-1;row>=rowmin+1;row--) {
			a[row][colmin]=count;
			count++;
		}
		//System.out.println(count);
		colmin++;
		rowmin++;
		colmax--;
		rowmax--;
	}
		
		
		
		for(int k=0;k<a.length;k++) {
			for(int l=0;l<a[k].length;l++) {
				System.out.print(a[k][l]+"\t");
			}System.out.println();
		}
		
	}

}
