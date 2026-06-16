package JavaFeature8;

@FunctionalInterface
interface X{
	void print();
}

@FunctionalInterface
interface Y extends X{
//	void display();
	
}

public class CanWeUseTwoMethodsInFunctionalInterface implements Y {
	public void print() {
		System.out.println("print method");
	}
	public static void main(String [] args) {
		B a = () -> System.out.println("print method");
		a.print();
	}
}
