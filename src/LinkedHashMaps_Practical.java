import java.util.LinkedHashMap;

public class LinkedHashMaps_Practical {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>(2,0.6f);
		lhm.put("srikanth", 123);
		lhm.put("sds", 121);
		System.out.println(lhm);
		

	}

}
