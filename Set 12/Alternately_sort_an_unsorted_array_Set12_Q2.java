package Set_1;

import java.util.Arrays;

public class Alternately_sort_an_unsorted_array_Set12_Q2 {

	public static void main(String[] args) {
		int[] array={5,2,8,7,4,3,9};
		//2,3,4,5,7,8,9
		int[] res=new int[array.length];
		Arrays.sort(array);
		int j=array.length-1;
		int i=0,k=0;
		while(i<=j){
			res[k++]=array[j--];
			if(k!=array.length)
			res[k++]=array[i++];
		}
		System.out.println(Arrays.toString(res));

	}

}
