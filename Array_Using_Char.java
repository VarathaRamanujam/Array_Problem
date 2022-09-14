package Arrays;

public class Array_Using_Char {

	public static void main(String[] args) {
		Array_Using_Char obj = new Array_Using_Char();
//		obj.Array_Using_Char_1();
//		obj.Array_Using_Char_2();
//		obj.Array_Using_Char_3();
//		obj.Array_Using_Char_4();///ACEGI.....
		obj.Array_Using_Char_5();///ADFIKNP

	}

	private void Array_Using_Char_5() {
		char ls[]=new char[19];
		int first ='A';
		int second='D';
		int diff =0;
		for (int i=0;i<ls.length;i++) {
			if(i%2==0) {
				if(first>=90) {
					first = second -28;			
					ls[i]=(char)first;
					first=second;
					second=first+2;
				}else {
				diff=2;
				ls[i]=(char)first;
				first=second;		
				second=diff+first;
				
				}
			}else
			if(first>=90) {
				first = second -27;			
				ls[i]=(char)first;
				first=second;
				second=first+3;
			}else {
				diff=3;
				ls[i]=(char)first;
				first=second;
				
				second=diff+first;
			}
		}
//			if(first>=90) {
//				first = second -28;			
//				ls[i]=(char)first;
//				second=first+2 ;
//				first=second;
//				second=first+2;
//			}else {
//			diff=second-first;
//			ls[i]=(char) first;
//			first=second;
//			second=diff+first;
//			}
			for(int i=0;i<ls.length;i++) {
				System.out.print(ls[i]+" ");
			}
		
	}

	private void Array_Using_Char_4() {
		char ls[]=new char[19];
		int first ='A';
		int second='C';
		int diff =0;
		for (int i=0;i<ls.length;i++) {
			if(first>=90) {
				first = second -28;			
				ls[i]=(char)first;
				second=first+2 ;
				first=second;
				second=first+2;
			}else {
			diff=second-first;
			ls[i]=(char) first;
			first=second;
			second=diff+first;
			}
		}
		for(int i=0;i<ls.length;i++) {
			System.out.print(ls[i]+" ");
		}
	}

	private void Array_Using_Char_3() {   // AMVZY ----->DOYBB
		char ls[] = {'A','M','V','Z','Y'};
		for (int i=0;i<ls.length;i++) {
			if(i%2==0) {
				if((ls[i]+2)>=90) {
					ls[i]=(char) ((ls[i]-23));
				}else
				ls[i]=(char) (ls[i]+3);
			}else {
			
			if(ls[i]>=90) {
				ls[i]=(char) ((ls[i]-24));
			}else
			ls[i]=(char) ((ls[i])+2);
			}
		}
		for(int i=0;i<ls.length;i++) {
			System.out.println(ls[i]);
		}
	}

	private void Array_Using_Char_2() {  //AMVZY ---->bnwaz
		char ls[] = {'A','M','V','Z','Y'};
		for (int i=0;i<ls.length;i++) {
			if(ls[i]>=90) {
				ls[i]=(char) ((ls[i]-25)+32);
			}else
			ls[i]=(char) ((ls[i]+32)+1);
		}
		for(int i=0;i<ls.length;i++) {
			System.out.println(ls[i]);
		}
		
	}
	

	private void Array_Using_Char_1() {  //AMVZY--->amvzy
		char ls[] = {'A','M','V','Z','Y'};
		for (int i=0;i<ls.length;i++) {
			if(ls[i]>90) {
				ls[i]=(char) ((ls[i]-26));
			}else
			ls[i]=(char) ((ls[i]+32));
		}
		for(int i=0;i<ls.length;i++) {
			System.out.println(ls[i]);
		}
		
	}

}
