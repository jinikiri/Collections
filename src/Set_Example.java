import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;


public class Set_Example {

	public static void main(String[] args) {
		
		Set<Integer> animals=new HashSet<>();
		animals.add(10);
		animals.add(20);
		animals.add(40);
		animals.add(30);
		System.out.println(animals+"--animals ");
		
		Set<Integer> dogs=new HashSet<>();
		dogs.add(100);
		dogs.add(100);
		dogs.add(30);
		System.out.println(dogs+"--dogs ");
       
        dogs.retainAll(animals);
		System.out.println(dogs+"-- Retain Dogs and Animals");
		dogs.addAll(animals);
		System.out.println(dogs+"-- Union Dogs and Animals");
		
		
		
		

	}

}
