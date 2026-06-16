package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Test {

	int id;
	String name;
	double sal;

	Test(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public double getSal() {
		return sal;
	}

	public String toString() {
		return id + "..." + name + "..." + sal;
	}

	public static void main(String[] args) {
		List<Test> list = Arrays.asList(
				new Test(1, "Sudhir", 50000), 
				new Test(2, "Ronny", 70000),
				new Test(3, "Bala", 60000), 
				new Test(4, "Rahul", 40000), 
				new Test(5, "Supro", 80000),
				new Test(6, "Chinti", 30000));
		
		List<Test> res = list.stream()
				.sorted(Comparator.comparing(Test::getSal).reversed())
				.limit(3)
				.toList();
		
		System.out.println(res);
	}
}
