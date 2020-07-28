package org.rahman;

public class Statement {
	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer("java");
		StringBuffer s2=new StringBuffer("java");
		
		int id1 = System.identityHashCode(s1);
		int id2 = System.identityHashCode(s2);
	System.out.println(id1);
	System.out.println(id2);
	
	StringBuffer co = s2.append(" selenium");
	
	System.out.println(co);
	
	int id3 = System.identityHashCode(co);
	System.out.println(id3);
	
	
	
	
	
	
	}
	
	
}	
	
	
	


