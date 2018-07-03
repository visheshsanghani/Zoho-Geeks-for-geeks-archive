package Set_1;

public class two_sorted_arrays_Set10_Q1 {
public static void main(String[] args) {
	 int[] Array1= {1, 2, 3, 6, 9};
	 int[]  Array2= {2, 4, 5, 10};
	 int[] res=new int[Array1.length+Array2.length];
	 int i=0,j=0,k=0;
	 while(i<Array1.length&&j<Array2.length){
		 if(Array1[i]<Array2[j]){
			 res[k++]=Array1[i++];
		 }
		 else if(Array1[i]>Array2[j]){
			 res[k++]=Array2[j++];
		 }
		 else{
			 res[k++]=Array1[i++];
			 j++;
		 }
	 
	 while (i < Array1.length)
         res[k++] = Array1[i++];
  
     // Store remaining elements of second array
     while (j < Array2.length)
         res[k++] = Array2[j++];
	 }
	i=0;
	while(i<k){
		System.out.print(res[i++]+" ");
	}
}
}