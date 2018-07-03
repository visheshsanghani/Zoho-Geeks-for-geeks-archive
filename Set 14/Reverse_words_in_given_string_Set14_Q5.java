package Set_1;

import java.util.Scanner;

public class Reverse_words_in_given_string_Set14_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		char[] chararray=new char[50];
		String string = scanner.nextLine();
		//StringBuffer string1=new StringBuffer(string);
		chararray=string.toCharArray();
		int i=chararray.length-1 , first=0, last=0;
		while(i>=0){
			last=i;
			while(chararray[i]!=' '&&i!=0){
				i--;
				first=i;
			}
			if(i==0){
			System.out.print(chararray[i]);
			}
			for(int t=first+1;t<=last;t++){
				System.out.print(chararray[t]);
			}
			System.out.print(" ");
			i--;
		}
	scanner.close();
	}

}
