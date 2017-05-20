/**
 * 
 */
package byFreq;

import utilities.MapUtil;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author User
 *
 */
public class SortByFreq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
//		Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}
		int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
//		int[] arr = {3, 4, 3, 4, 2, 1, 3, 4, 2, 4};
		
		// sorting the input in descending order
//		Integer[] intArr = new Integer[arr.length];
//		int i = 0;
//		for (int a : arr) intArr[i++] = Integer.valueOf(a);
		
//		Arrays.sort(intArr, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2.compareTo(o1);
//			}
//		});
		
//		for(Integer o : intArr) System.out.print(o.toString());
		
//		// count each int
//		HashMap<Integer, Integer> intMap = new HashMap<>();
//		for(Integer ii : intArr) {
//			if(intMap.containsKey(ii)) {
//				intMap.put(ii, intMap.get(ii) +1);
//			}
//			else {
//				intMap.put(ii, 1);
//			}
//		}
		
		// count each int
				HashMap<Integer, Integer> intMap = new HashMap<>();
				int i = 0;
				for(int i1 : arr) {
					Integer tmpInt = new Integer(i1);
					if(intMap.containsKey(tmpInt)) {
						intMap.put(tmpInt, intMap.get(tmpInt) +1);
					}
					else {
						intMap.put(tmpInt, 1);
					}
				}
		
		System.out.println(intMap);
		
		// sort according to frequency
		HashMap<Integer, Integer> sortedMap = new HashMap<>();
		sortedMap = (HashMap<Integer, Integer>) MapUtil.sortByValue(intMap);
		
		System.out.println(sortedMap);
		
		for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
			int loop = 0;
			while (loop++ < entry.getValue().intValue()) {
				System.out.printf("%s", entry.getKey());
			}
		}
		
	}

}