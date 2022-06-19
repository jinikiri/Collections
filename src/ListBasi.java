import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListBasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arry[]= {2,1,6,4,5};
		Arrays.sort(arry);
		for(int i:arry)
		{
			System.out.println(i);
		}
		List<String> arraylist=new ArrayList<>();
		arraylist.add("1123");
		arraylist.add("sriaknth");
		arraylist.add("java");
		Collections.swap(arraylist, 2, 0);
		System.out.println(arraylist);
		arraylist.remove(2);
		System.out.println(arraylist);
		boolean s=arraylist.contains("sriaknth");
		int k=arraylist.size();
		arraylist.add(1, "sd");
		
		System.out.println(arraylist);
		System.out.println(arraylist.size());
		System.out.println(arraylist.get(2));
		arraylist.set(2, "srikanthjinikiri");
	
		System.out.println(arraylist);
		System.out.println("Array CONVERSION---------------");
		String[] converted=new String[arraylist.size()];
		arraylist.toArray(converted);
		for(String i:converted)
		{
			System.out.println(i);
		}
		System.out.println("Array CONVERSION Completed---------------");
		System.out.println(arraylist);
		System.out.println("---------------");
		for(String i:arraylist)
		{
			System.out.println(i);
		}
		System.out.println("---------------");
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(2);
		arr.add(100);
		arr.add(30);
		arr.add(60);
		System.out.println(arr);
		arr.sort(Comparator.naturalOrder());
		System.out.println(arr);
		arr.sort(Comparator.reverseOrder());
		System.out.println(arr);
		System.out.println("Array to Array List---------------");
		String[] arr4= {"sri","kanth","jinikiri"};
		for(String  i:arr4)
		{
			System.out.println(i);
		}
	    ArrayList<String> languages = new ArrayList<>(Arrays.asList(arr4));
	    System.out.println(languages);


		
		
		
	}

}
