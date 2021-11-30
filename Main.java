package arrayLab;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] numbersGroup;
		numbersGroup=new int[16];
		numbersGroup[5]=10;
		System.out.println(Arrays.toString(numbersGroup));
		
		int[] numbers=new int[13];
		numbers [6]= 52;
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers[6]);
		
		int [] numbersA= {1,3,5,7,9};
		System.out.println(numbersA[2]);

	}

}
