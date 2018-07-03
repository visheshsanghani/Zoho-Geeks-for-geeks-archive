package Set_1;

public class array_and_threshold_value_Set12_Q3 {

	public static void main(String[] args) {
		int[] arr= {5,8,10,13,6,2};
		int res=0,add=0;
		for(int i=0;i<arr.length;i++){
			add=arr[i]/3;
			if(arr[i]%3!=0)
				add++;
			res+=add;
		}
		System.out.println(res);
	}

}
