package Set_1;

public class number_repeated_add_next_index_0_Set36_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={ 0, 2, 2, 2, 0, 6, 6, 0, 8};
		for(int i=0;i<a.length-1;i++){
			if(a[i]==a[i+1]){
				a[i]*=2;
				a[i+1]=0;
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==0){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}

}
