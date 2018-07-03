package Set_1;

public class Convert_From_Roman_Number_Set14_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check("XLVII");
	}
	public static void check(String Roman){
		char[] roman=new char[Roman.length()];
		int i;
		for(i=roman.length-1;i>=0;i--){
			roman[i]=Roman.charAt(i);
		}
		i=0;
		int number=0;
		while(i<roman.length){
			
			if(i+1<roman.length&&convert(roman[i+1])>convert(roman[i])){
				number=number+convert(roman[i+1])-convert(roman[i]);
				i+=2;
				}
			
	else{
				number=number+convert(roman[i]);
				i=i+1;
			}
		}
		System.out.println(number);
	}
	public static int convert(char roman){
		
		switch (roman)
		{
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		}
		return 0;
	}
}
