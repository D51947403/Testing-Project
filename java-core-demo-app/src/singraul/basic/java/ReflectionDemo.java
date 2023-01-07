package singraul.basic.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * https://www.geeksforgeeks.org/reflection-in-java/
 * @author 2106725
 *
 */
public class ReflectionDemo {

	public static void main(String[] args) {

		ReflectionTest  obj1 =new ReflectionTest();
		ReflectionTest  obj2 =new ReflectionTest("Kumar");
       
		  Class cls =obj2.getClass();
		  
		System.out.println(obj1.getClass().getName());
		System.out.println(obj1.getClass().getConstructors());
		System.out.println(obj1.getClass().getMethods());
		
		Method[]  methods = cls.getMethods();
		
		for(Method m : methods) {
			System.out.println(m.getName());
		}
		
		Constructor[] constractors = cls.getConstructors();
		
		for(Constructor c : constractors) {
			System.out.println(c.getName());
		}
		
		try {
			Method m2= cls.getDeclaredMethod("method2", int.class);
			try {
				m2.invoke(obj2, 24);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		Method m3;
		try {
			m3 = cls.getDeclaredMethod("method3");
			m3.setAccessible(true);
			try {
				m3.invoke(obj2);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
class ReflectionTest{
	
	private String str ;
	private int num;
	public ReflectionTest() {
		System.out.println(" Default Constrauctor");
		this.str ="Devendra";
	
	}
	public ReflectionTest(String x) {
		System.out.println(" Argument Constrauctor "+x);
		this.num=20;
	}
	
	public void method1() {
		System.out.println("method1 String "+str);
	}
	
	public void method2(int y) {
		System.out.println(" method2 y "+y);
	}
	
	private void method3() {
		System.out.println(" method3 num "+this.num);
	}
	
}