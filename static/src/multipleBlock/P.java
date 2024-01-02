package multipleBlock;

public class P {
static {
	System.out.println("Static 1");
}
static {
	System.out.println("Static 2");
}
static{
	System.out.println("Static 3");
}

{
	System.out.println("Non Static 1");
	}
{
	System.out.println("Non Static 2");
	}
{
	System.out.println("Non static 3");
	}
	public static void main(String[] args) {
P p1=new P();
	}

}
