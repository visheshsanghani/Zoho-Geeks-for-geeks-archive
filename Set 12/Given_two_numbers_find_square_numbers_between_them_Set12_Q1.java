package Set_1;

public class Given_two_numbers_find_square_numbers_between_them_Set12_Q1 {

	public static void main(String[] args) {
		
		int a= 20;int b = 100;
		int start=(int) Math.sqrt((double)a);
		
		/*or by using
		start=sqrt(a);
		*/
		
		int end=0;
		while(end<b){
			end=start*start;
			if(end>a&&end<=b){
				System.out.println(end);
			}
			start++;
		}
		
	}
	/*public static double sqrt(int number) {
		double t;
	 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	*/
}
