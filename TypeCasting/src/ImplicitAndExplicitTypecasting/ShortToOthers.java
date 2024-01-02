package ImplicitAndExplicitTypecasting;

public class ShortToOthers {

	public static void main(String[] args) {
		//implict typecasting happen automatically
				//explicit happens manually  by the programmer
				short a=100;
				byte b=(byte)a;//explicit typecasting
				int c=a;
				long l=a;
				double d=a;
				float f=a;
				char e=(char)a;//explicit typecasting
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(l);
				System.out.println(d);
				System.out.println(f);
				System.out.println(e);
	}

}
