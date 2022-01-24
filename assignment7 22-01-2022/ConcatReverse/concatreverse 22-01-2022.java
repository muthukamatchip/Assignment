package javaclass;

public class Concatreverse {

	public static void main(String[] args) {
		String s1 ="muthu";
		int size= s1.length();
		System.out.println(size);
        for (int i=0; i<size; i++)
        {
        	System.out.print(s1.charAt(s1.length() -i-1)); 
        }
	}

}
