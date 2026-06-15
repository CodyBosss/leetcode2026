package JavaFeature8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThreeGreaterValues {
	
	int id;
	String name;
	int salary;
	
	public ThreeGreaterValues(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return id+"-"+name+"-"+salary;
	}
	
	public static void main(String [] args) {
		List<ThreeGreaterValues> emp = new ArrayList<>();
		emp.add(new ThreeGreaterValues(1,"Sudhir",50000));
		emp.add(new ThreeGreaterValues(2,"Ronny",90000));
		emp.add(new ThreeGreaterValues(3,"Bala",10000));
		emp.add(new ThreeGreaterValues(4,"Sandy",40000));
		emp.add(new ThreeGreaterValues(5,"Rahul",30000));
		
		//for finding thr three greater values;
		List<ThreeGreaterValues> fthreesal = emp.stream().sorted((e1,e2)->e2.getSalary()-e1.getSalary())
				.limit(3).toList();
		System.out.println(fthreesal);
		
	}

}
