package Set_1;

import java.util.Arrays;

public class number_of_occurrences_Set10_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={2,1,3,2,2,5,8,9,8,9};
		int present=arr[0];
		int count=1;
		Arrays.sort(arr);
		int i;
		for(i=1;i<arr.length;i++){
			if(present==arr[i]){
				count++;
			}
			else{
				System.out.println(arr[i-1]+" "+count);
				count=1;
				present=arr[i];
			}
		}
		System.out.print(arr[i-1]+" "+count);
		
	}

}
