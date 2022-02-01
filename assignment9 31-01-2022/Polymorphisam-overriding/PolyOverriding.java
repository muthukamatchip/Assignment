package javaclass;

class Language
{
	public void input()
	{
		System.out.println("Java programming language");
	}
}
	
class Java extends Language
{
	public void input()
	{
		System.out.println("Common English Language");
	}
}

public class polymorphism {

	public static void main(String[] args)
	{
        Language mk =new Language ();
        Java mk1=new Java();
        mk.input();
        mk1.input();
	}

}
