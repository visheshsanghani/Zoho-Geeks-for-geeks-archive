package Set_1;

public class Column_Name_For_Given_Number_Set_14_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check(27);
		check(26);
        check(51);
        check(52);
        check(80);
        check(676);
        check(702);
        check(705);
	}
	public static void check(int number){
		int rem=0;
		StringBuilder string=new StringBuilder();
		while(number>0){
			rem=number%26;
			if(rem==0){
				string.append("Z");
				number=(number/26)-1;
			}
			else{
				string.append((char)((rem-1)+'A'));
				number=number/26;
			}
		}
		System.out.println(string.reverse());
	}
}
