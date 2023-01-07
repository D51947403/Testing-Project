package singraul.collection.framework;

import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {

       HashMap<StudentTest, StudentTest>  map= new HashMap<StudentTest, StudentTest> ();
       StudentTest e1= new StudentTest(1,"Devendra");
       StudentTest e2= new StudentTest(2,"Kumar");
       StudentTest e3= new StudentTest(1,"Devendra");// same content 
       
       map.put(e1, e1);
       map.put(e1, e1);
       map.put(e2, e2);
       map.put(e2, e2);
       map.put(e3, e3);
       map.put(e3, e3);
       // size is as per content 
       System.out.println(map.size()); // 2
	}

}


class StudentTest {
	private int id;
	private String name;
	
	
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
	public StudentTest(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		StudentTest other = (StudentTest) obj;
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