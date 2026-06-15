package JavaFeature8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupOfEmployee {

	int id;
	String name;
	String Dept;

	public GroupOfEmployee(int id, String name, String Dept) {
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
		List<GroupOfEmployee> emp = Arrays.asList(new GroupOfEmployee(1, "Sudhir", "Developer"),
				new GroupOfEmployee(2, "Ronny", "HR"), new GroupOfEmployee(3, "Bala", "IT"));

		Map<String, List<GroupOfEmployee>> list = emp.stream().collect(Collectors.groupingBy(GroupOfEmployee::getDept));
		System.out.println(list);
	}
}
