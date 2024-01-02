package ImplicitAndExplicitTypecasting;

public class TypeCastingBytetoOthers {

	public static void main(String[] args) {
		// byte to other data type
		//implict typecasting happen automatically
		//explicit happens manually  by the programmer
		byte a=100;
		short b=a;
		int c=a;
		long l=a;
		double d=a;
		float f=a;
		char e=(char)a;//explicit type casting
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		System.out.println(e);
	}

}
