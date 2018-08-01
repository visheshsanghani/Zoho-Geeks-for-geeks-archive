package Set_1;

public class unbalanced_paranthesis_Set2_Q2 {

	public static void main(String[] args) {
		String buffer="(a)()";
		int open=0;
		int[] check=new int[buffer.length()];
		char[] input=buffer.toCharArray();
		for(int i=0;i<input.length;i++){
			if(input[i]=='('){
				check[open]=i;
				open++;
			}
			else if(input[i]==')'){
				if(open!=0){
				open--;
			}else{
				check[open]=i;
				open++;
			}
			
		}
	}
		for(int iteration=0;iteration<input.length;iteration++){
		     int flag=0;
		     for(int j=0;j<open;j++)
		     if(iteration==check[j])
		     flag=1;
		     if(flag==0)
		    	 System.out.print(input[iteration]);


}
}
}