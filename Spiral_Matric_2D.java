package Arrays;

public class Spiral_Matric_2D {

	public static void main(String[] args) {
		Spiral_Matric_2D obj = new Spiral_Matric_2D();
		obj.Spiral_Matric_2D();
	}

	private void Spiral_Matric_2D() {
		int a[][ ] = new int[4][4];
		int count=1;
		int i=0;
		int j=0;
		
		for(int k=0;k<a.length;k++) {
		for(int l=k;l<a.length;l++) {
			a[i][l]=count;
			count++;
			j=l-1;
		}
		for(int l=i+1;l<a.length-i;l++) {
			a[j][l]=count;
			//j=l;
			count++;
		}i++;
		for(int l=j;l>a[l].length-i;l--) {
			a[j][l]=count;
			count++;
		}i--;
		for(int l=j;l>a[l].length-j;l--) {
			a[i][l]=count;
		}j--;
	}
		
		for(int k=0;k<a.length;k++) {
			for(int l=0;l<a[k].length;l++) {
				System.out.print(a[k][l]+"  ");
			}System.out.println();
		}
		
	}

}
