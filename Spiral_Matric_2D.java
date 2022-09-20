package Arrays;

public class Spiral_Matric_2D {

	public static void main(String[] args) {
		Spiral_Matric_2D obj = new Spiral_Matric_2D();
		obj.Spiral_Matric_2D();
	}

	private void Spiral_Matric_2D() {
		int a[][ ] = new int[10][10];
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
				System.out.print(a[k][l]+"    ");
			}System.out.println();
		}
		
	}

}
