package singraul.collection.framework;

import java.util.HashMap;

public class HashMapDemo3 {

	public static void main(String[] args) {

       HashMap  map= new HashMap ();
       ProductTest e1= new ProductTest(1,"Devendra");
       ProductTest e2= new ProductTest(2,"Kumar");
       ProductTest e3= new ProductTest(1,"Devendra");// same content 
       
       map.put(e1, e1);
       map.put(e1, e1);
       map.put(e2, e2);
       map.put(e2, e2);
       map.put(e3, e3);
       map.put(e3, e3);
       
       System.out.println(map.size()); // 3
	}

}


class ProductTest {
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
	public ProductTest(int id, String name) {
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

}