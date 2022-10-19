package singraul.collection.framework;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
        ArrayList<String>  ar= new ArrayList<String>();
           ar.add("Devendra");
           ar.add("Kumar");
           ar.add("singraul");
           ar.add(3,"Mainahan");
           
      //     ar.stream().forEach(f -> System.out.println(f));
           
           ar.remove(3);
           ar.remove("Kumar");
           ar.stream().forEach(f -> System.out.println(f));
      
	}

}
