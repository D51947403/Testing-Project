package singraul.basic.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
	  List<Integer> numList = Arrays.asList(1, 10, 1, 2,6, 2, 3, 3, 10,10,2, 6, 3, 4, 5, 5);
	  
	  List<Integer> resList = new ArrayList<Integer>();
	  
	  Set<Integer> numSet= new LinkedHashSet<Integer>();
	   numSet.addAll(numList);
	   
	   resList.addAll(numSet);
	  
	   resList.stream().forEach(System.out::println);
	   
	   //using java 8
	  
	   List<Integer> newList =numList.stream().distinct().collect(Collectors.toList());
	   newList.stream().forEach(e -> System.out.print(e+" "));
	   
	   
	}

}
