import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashMapsPractice {

	public static void main(String[] args) {
	
		HashMap<String,Integer> numbers=new HashMap<>();
		//Adding surnames
		numbers.put("srikanth_jinikiri", 1743);
		numbers.put("venkatesh_Gaddam", 1968);
		numbers.put("prateja_Bakki", 1490);
		numbers.putIfAbsent("sri", 1912); //If key is not present then insert
		System.out.println(numbers);
		
		System.out.println("\n");
		numbers.replace("srikanth", 1744);
		System.out.println(numbers+" : sriaknth value replace with 1743 to 1744");
		
		System.out.println("\n");
		int k=numbers.get("prateja");    //get value with using prateja key
		System.out.println("Get Method : "+k);
		
		System.out.println("\n");
		System.out.println("Kays   : "+numbers.keySet());
		System.out.println("Values : "+numbers.values());
		System.out.println("Keys/Values Mapping: "+numbers.entrySet());
		
		System.out.println("\n");
		System.out.println("Contains Key If Prateja: "+numbers.containsKey("prateja"));
		System.out.println("Contains Value If 1743 : "+numbers.containsValue(1743));
		
		
		HashMap<String,Integer> other=new HashMap<>();
		other.put("srikanth",123);
		other.put("mounika", 99);
		
		System.out.println("\n");
		System.out.println("numbers : "+numbers);
		System.out.println("other   : "+other);
		other.putAll(numbers);
		System.out.println("After Put All other with numbers : "+other);
		
		numbers.replaceAll((key,value) -> value*10);
		System.out.println(numbers);
		
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>(2,0.6f);
		lhm.put("srikanth", 123);
		lhm.put("sds", 121);
		lhm.put("venky", 112);
		System.out.println(lhm);
		

		
	}

}
