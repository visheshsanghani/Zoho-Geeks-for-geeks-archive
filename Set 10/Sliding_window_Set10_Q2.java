package Set_1;

public class Sliding_window_Set10_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3,2,7,6,5,1,2,3,4};
		int k=3,j=0,max=0;
		for(int i=0;i<arr.length-2;i++){
			while(j<k){
				if(arr[i+j]>max){
					max=arr[i+j];
					}
				j++;
			}
			System.out.print(max+" ");
			j=0;
			max=0;
		}
	}

}
