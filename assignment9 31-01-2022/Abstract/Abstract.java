package javaclass;

abstract class Start
{
	abstract void print();
}
class text1 extends Start
{
	public void print()
	{
		System.out.println("First");
    }
}
class text2 extends text1
{
	public void print()
	{
		System.out.println("Second");
	}
}
class text3 extends text2
{
	public void print()
	{
		System.out.println("Third");
	}
}
public class Abstract extends Start
{
 public static void main(String args[])
 {
	   Start m=new text1 ();
	   Start m1=new text3();
	   Start m2=new text2();
	    m.print(); 
	    m1.print();
	    m2.print();
	    m.print();
	    m1.print();
	    m1.print();
 }
 }
