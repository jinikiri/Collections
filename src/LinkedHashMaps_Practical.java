import java.util.LinkedHashMap;

public class LinkedHashMaps_Practical {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>(2,0.6f);
		//Adding surname
		lhm.put("srikanth_jinikiri", 123);
		lhm.put("Raghupathi", 121);
		System.out.println(lhm);
		

	}

}
