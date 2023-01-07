package singraul.collection.framework;

import java.util.HashMap;

public class HashMapDemo4 {

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

class TeacherTest {
	private int id;
	private String name;

	
	public TeacherTest(int id, String name) {
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeacherTest other = (TeacherTest) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	

}