package singraul.basic.logic;

import java.util.HashSet;
import java.util.Set;

public class ObjectCountDemo1 {

	public static void main(String[] args) {
		
		Set<Employee>   empMap1= new HashSet <Employee>();
		
		empMap1.add(new Employee(10, "devendra", 2000000));
		empMap1.add(new Employee(10, "devendra", 2000000));
		empMap1.add(new Employee(10, "devendra", 2000000));
		
		System.out.println("size1 "+empMap1.size());	// 1
		empMap1.clear();
		System.out.println("size2 "+empMap1.size()); // 0
		
		empMap1.add(new Employee(10, "devendra", 2000000));
		empMap1.add(new Employee(10, "devendra", 2000000));
		empMap1.add(new Employee(20, "devendra", 2000000));
		empMap1.add(new Employee(10, "kumar", 2000000));
		empMap1.add(new Employee(10, "devendra", 2000002));
		System.out.println("size2 "+empMap1.size()); //4	

	}

}

class Employee{
	private long empId;
	private String empName;
	private double salary;
	
	
	public Employee(long empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (empId ^ (empId >>> 32));
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	
	
}

