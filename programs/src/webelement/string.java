package webelement;

import java.io.StringReader;

public class string {
	public static void main(String[] args) {
		/*String s1=new String("anj");
		String s2=new String("anj");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));*/
		
		/*StringBuffer sb1=new StringBuffer("sa");
		 sb1=new StringBuffer("SA");
		System.out.println(sb1.hashCode());*/
		//System.out.println(sb2.hashCode());
		//System.out.println(sb1==sb1);
		//System.out.println(sb1.toString().compareTo(sb2));
		
		/*String s1=new String("lokesh");
		System.out.println(s1.hashCode());
		String s2=new String("lokesh1");
		System.out.println(s2.hashCode());
		System.out.println(s2==s2);
		System.out.println(s1==s2);
	//	System.out.println(s1.equals(sb2));
		//System.out.println(s1==sb1);
		System.out.println(sb1.equals(s1));
		
		String s3="sas";
		String s5="sas";
		System.out.println(s3==s5);
		System.out.println(s3.equals(s5));
		
		StringBuilder s6=new StringBuilder("ff");
		StringBuilder s7=new StringBuilder("ffj");
		System.out.println(s6==s7);
		System.out.println(s6.equals(s7));
		
		StringBuffer ss=new StringBuffer("sa");
		StringBuffer ss1=new StringBuffer("sa");
		//System.out.println(s6==ss1);
		System.out.println(s6.equals(ss1));
		System.out.println(ss.hashCode());
		System.out.println(ss1.hashCode());*/
		
		
		String s1=new String("as as as");
		String s2=new String("as as as");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		
		
		String s3="as as as";
		String s4="as "+"as as";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
		
		 final String s5="as as";
		String s6=s5+" as";
		
		System.out.println(s3==s6);
		System.out.println(s3.equals(s6));
		
		
	}
	
	
}
