import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	//1
	public static void swap(ArrayList<String> list, int num1, int num2){ 
		String exchange = list.get(num1);
		list.set(num1,list.get(num2));
		list.set(num2,exchange);
	}

	//2
	public static ArrayList<Double> createArrayList(double[] arr){
		ArrayList<Double> arrL = new ArrayList<>();
		for (int i = 0; i < arr.length; i++){
			arrL.add(arr[i]);
			
		}
			return arrL;
	}	

	//3
	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < names.length; i++){
			map.put(names[i],ages[i]);
		}
		return map;
	}


	//4
	public static HashMap<String, Integer> increaseAge(HashMap<String, Integer> map2, String naME){
			if (map2.containsKey(naME)){
			map2.put(naME, map2.get(naME)+1);

			}
			return map2;
		}
	
	
}
	
