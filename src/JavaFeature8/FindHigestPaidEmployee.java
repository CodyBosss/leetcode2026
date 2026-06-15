package JavaFeature8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindHigestPaidEmployee {
	int id;
	String name;
	double salary;
	
	public FindHigestPaidEmployee(int id, String name, double salary) {
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
		return id+"..."+name+"..."+salary;
	}
	
	public static void main(String [] args) {
		List<FindHigestPaidEmployee> emp = Arrays.asList(
				new FindHigestPaidEmployee(1, "Sudhir", 50000),
		        new FindHigestPaidEmployee(2, "Rahul", 70000),
		        new FindHigestPaidEmployee(3, "Amit", 40000),
		        new FindHigestPaidEmployee(4, "Neha", 60000));
		
		FindHigestPaidEmployee highestPaidEmp = emp.stream()
				.max(Comparator.comparing(FindHigestPaidEmployee::getSalary))
				.orElse(null);
		System.out.println(highestPaidEmp);
	}

}
