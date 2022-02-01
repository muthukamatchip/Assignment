package javaclass;


class Asterisk
{
    Asterisk( )
    {
    	System.out.println("******");
    }
}

class Hash
{
	Hash(int a)
	{
		System.out.println("#####");
	}
}


public class PolyOverloding {

	public static void main(String[] args) {
		Hash mm = new Hash(1);
		Asterisk mm1=new Asterisk();

	}

}
