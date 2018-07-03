package Train_Round_3;

import java.util.Scanner;

public class Railway_problem {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Trains trains=new Trains();
		int n=1;
		while(n!=0){
		System.out.println("Enter the value");
		System.out.println("1. Check avilabilty");
		System.out.println("2. Book Ticket");
		System.out.println("3. Display my seat");
		System.out.println("4. Cancel the ticket");
		System.out.println("5. exit");
		n=scanner.nextInt();		
		switch(n){
		case 1:
			trains.checkavilabilty();
			break;
		case 2:
			trains.Book();
			break;
		case 3:
			trains.displaytheseat();
			break;
		case 4:
			trains.cancel();
			break;
		
		case 5:
			n=0;
		}
		}
		scanner.close();

}
}
