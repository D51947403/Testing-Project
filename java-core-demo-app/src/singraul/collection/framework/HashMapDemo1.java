package singraul.collection.framework;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {

       HashMap  map= new HashMap ();
       EmployeeTest e1= new EmployeeTest(1,"Devendra");
       EmployeeTest e2= new EmployeeTest(2,"Kumar");
       EmployeeTest e3= new EmployeeTest(1,"Devendra");// same content 
       
       map.put(e1, e1);
       map.put(e1, e1);
       map.put(e2, e2);
       map.put(e2, e2);
       map.put(e3, e3);
       map.put(e3, e3);
       
       System.out.println(map.size()); //3
	}

}

class EmployeeTest {
	private int id;
	private String name;

	
	public EmployeeTest(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
	return 1;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

}