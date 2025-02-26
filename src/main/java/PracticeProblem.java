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
	public static 



}
