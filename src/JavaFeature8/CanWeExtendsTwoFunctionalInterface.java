package JavaFeature8;

@FunctionalInterface
interface A {
	void print();
}

@FunctionalInterface
interface B extends A {
	void print();
}

//using class
//public class CanWeExtendsTwoFunctionalInterface implements B{
//	public void print() {
//		System.out.println("print method");
//	}
//	public static void main(String [] args) {
//		B a = new CanWeExtendsTwoFunctionalInterface();
//		a.print();
//	}}

//using lambda expression
public class CanWeExtendsTwoFunctionalInterface implements B {
	public void print() {
		System.out.println("print method");
	}
	public static void main(String[] args) {
		B b = () -> System.out.println("print method");
		b.print();
	}
}
