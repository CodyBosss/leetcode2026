package JavaFeature8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmpByDept {
	
	int id;
	String name;
	String Dept;

	public CountEmpByDept(int id, String name, String Dept) {
		this.id = id;
		this.name = name;
		this.Dept = Dept;
	}

	public String getDept() {
		return Dept;
	}

	public String toString() {
		return id + "..." + name + "..." + Dept;
	}

	public static void main(String[] args) {
		List<CountEmpByDept> emp = Arrays.asList(
				new CountEmpByDept(1, "Sudhir", "Developer"),
				new CountEmpByDept(2, "Ronny", "HR"), 
				new CountEmpByDept(3, "Bala", "IT"),
				new CountEmpByDept(4, "Rahul", "IT"));			

		Map<String, Long> list = emp.stream()
				.collect(Collectors.groupingBy(CountEmpByDept::getDept, Collectors.counting()));
		System.out.println(list);
	}

}
