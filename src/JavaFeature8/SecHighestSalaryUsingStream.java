package JavaFeature8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecHighestSalaryUsingStream {

	int id;
	String name;
	double salary;

	public SecHighestSalaryUsingStream(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String toString() {
		return id + "..." + name + "..." + salary;
	}

	public static void main(String[] args) {
		List<SecHighestSalaryUsingStream> emp = Arrays.asList(new SecHighestSalaryUsingStream(1, "Sudhir", 50000),
				new SecHighestSalaryUsingStream(2, "Rahul", 70000), new SecHighestSalaryUsingStream(3, "Amit", 40000),
				new SecHighestSalaryUsingStream(4, "Neha", 60000));
		
		//Using this approach we can get id, name and salary.
		SecHighestSalaryUsingStream secHigest = emp.stream()
				.sorted(Comparator.comparing(SecHighestSalaryUsingStream::getSalary)
				.reversed()).skip(1)
				.findFirst()
				.orElse(null);
		System.out.println(secHigest);
		
		//Using this approach we can get only salary.
//		double res = emp.stream().map(SecHighestSalaryUsingStream::getSalary)
//				.distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(null);
//		System.out.println(res);

	}

}
