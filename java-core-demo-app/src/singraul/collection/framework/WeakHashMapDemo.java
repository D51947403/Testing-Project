package singraul.collection.framework;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
         // strong memory reference for key object 
		System.out.println("===HashMap===");
		Temp t = new Temp();
		HashMap hm = new HashMap();
		hm.put(t, "hashMap");
		System.out.println(hm);
		t = null;
		System.gc();
		Thread.sleep(4000);
		System.out.println("after gc "+hm);

		// weak memory reference for key object 
		System.out.println("===WeakHashMap===");
		Temp temp = new Temp();
		WeakHashMap whm = new WeakHashMap();
		whm.put(temp, "hashMap");
		System.out.println(whm);
		temp = null;
		System.gc();
		Thread.sleep(4000);
		System.out.println("after gc "+whm);

	}

}

class Temp {

	public String toString() {
		return "temp";
	}

	public void finalize() {
		System.out.println("finalize method invoked...!");
	}
}