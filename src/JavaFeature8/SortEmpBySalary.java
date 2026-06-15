package JavaFeature8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmpBySalary {
	int id;
	String name;
	double salary;

	public SortEmpBySalary(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}
	public static void main(String [] args) {
		List<SortEmpBySalary> emp = Arrays.asList(
				new SortEmpBySalary(1,"Sudhir",50000),
				new SortEmpBySalary(2,"Ronny",70000),
				new SortEmpBySalary(3,"Bala",60000));
		emp.stream().sorted(Comparator.comparing(SortEmpBySalary::getSalary))
		.forEach(System.out::println);
	}
}
