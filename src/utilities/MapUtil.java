package utilities;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapUtil {
//	public static Map<Integer, Integer> sortByValue(Map<Integer, Integer> mp) {
//		
//		List<Map.Entry<Integer, Integer>> tmpList = new LinkedList<>(mp.entrySet());
//		
//		Collections.sort(tmpList, new Comparator<Map.Entry<Integer, Integer>>() {
//
//			@Override
//			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
//				// TODO Auto-generated method stub
//				return o2.getValue().compareTo(o1.getValue());
//			}
//			
//		});
//		
//		HashMap<Integer, Integer> resultMap = new LinkedHashMap<>();
//		for(Map.Entry<Integer, Integer> entry : tmpList) {
//			resultMap.put(entry.getKey(), entry.getValue());
//		}
//		
//		return resultMap;
//	}
	
	public static <K,V extends Comparable<? super V>> Map<K,V> sortByValue(Map<K,V> mp) {
		List<Map.Entry<K, V>> tmpList = new LinkedList<>(mp.entrySet());
		Collections.sort(tmpList, new Comparator<Map.Entry<K, V>>() {

			@Override
			public int compare(Entry<K, V> arg0, Entry<K, V> arg1) {
				// TODO Auto-generated method stub
				return arg1.getValue().compareTo(arg0.getValue());
			}
			
		});
		
		HashMap<K,V> resultMap = new LinkedHashMap<>();
		for(Map.Entry<K, V> entry : tmpList) {
			resultMap.put(entry.getKey(), entry.getValue());
		}
		return resultMap;
	}
}
