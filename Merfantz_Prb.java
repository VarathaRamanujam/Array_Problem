package Merfantz;

import java.util.Iterator;

public class Merfantz_Prb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merfantz_Prb obj = new Merfantz_Prb();
		//obj.space_remover_in_lower_case();
		obj.space_remover_in_Upper_case();
	}

	private void space_remover_in_Upper_case() {
	
		String s0="The     Payilagam   Is Master    ";
		String s1="",s2="";
		
		for(int i=0;i<s0.length();i++)
			if(s0.charAt(i)!=' ')
				s1+=s0.charAt(i);
		
		for(int i=0;i<s1.length();i++)
			if(s1.charAt(i)>=65 && s1.charAt(i)<=90)
				s2+=" "+s1.charAt(i);
			else
				s2+=s1.charAt(i);
		
		String s3="";
		if(s2.startsWith(" "))
			for(int i=1;i<s2.length();i++)
				s3+=s2.charAt(i);
		
		System.out.println(s3);
		
		int count=0;
		for(char c:s3.toCharArray())
			count++;
		System.out.println(count);
		
	}

	private void space_remover_in_lower_case() {
	String s="the    payilagam is     master ";
	boolean check=true;
	String ss="";
	for(int i=0;i<s.length();i++) {
		
		if((s.charAt(i)>=97 && s.charAt(i)<=122) || (check==false)) {
			
			check=false;
		    ss+=s.charAt(i);
			if(s.charAt(i)==' ')
				check=true;
		}	
	}
	System.out.println(ss);
	
	}
	
	
	

}
