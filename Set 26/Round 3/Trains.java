package Train_Round_3;


import java.util.Arrays;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Trains {
	HashMap<Integer,Ticket> confirm_tickets=new HashMap<Integer,Ticket>();
	HashMap<Integer,Ticket> waiting_tickets=new HashMap<Integer,Ticket>();
	Scanner scanner=new Scanner(System.in);
	LinkedList<Integer> confirm;
	LinkedList<Integer> waiting;
	LinkedList<Integer> buffer=new LinkedList<Integer>();
	
	Ticket[] ticket;
	Ticket[] waiting_ticket;
	
	public Trains(){
		ticket=new Ticket[10];
		waiting_ticket=new Ticket[10];
		confirm=new LinkedList<Integer>(Arrays.asList(1));
		waiting=new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	}
	
	public int checkavilabilty(){
	if(confirm.isEmpty()){
		if(waiting.isEmpty()){
			System.out.println("Sorry no confirm_tickets Avialble");
			return 0;
		}
		else{
			System.out.println("Waiting List Ticket Avialble");
			return 2;
		}
	}
	else{
		System.out.println("confirm_tickets are avialble");
		System.out.println();
		return 1;
	}
	}
	
	public void Book(){
		if(checkavilabilty()==1){
			String name;
			System.out.println("Enter the Passenger Name :");
			name=scanner.nextLine();
			ticket[confirm.getFirst()]=new Ticket();
			ticket[confirm.getFirst()].setName(name);
			ticket[confirm.getFirst()].setSeat(confirm.getFirst());
			confirm_tickets.put(confirm.getFirst(),ticket[confirm.getFirst()]);
			confirm.removeFirst();
		}
		else if(checkavilabilty()==2){
			String name;
			System.out.println("Enter the Passenger Name :");
			name=scanner.nextLine();
			waiting_ticket[waiting.getFirst()]=new Ticket();
			waiting_ticket[waiting.getFirst()].setName(name);
			waiting_ticket[waiting.getFirst()].setSeat(waiting.getFirst());
			waiting_tickets.put(waiting.getFirst(),ticket[0]);
			buffer.add(waiting.getFirst());
			waiting.removeFirst();
		}
	}
	
	public void displaytheseat(){
		if(confirm_tickets!=null){
			//confirm_tickets.keySet().stream().forEach(System.out::println);	
			for(Ticket ticket: confirm_tickets.values()){
				System.out.println("Seat : "+ticket.getSeat());
				System.out.println("Name : "+ticket.getName());
				
			};		
	}
	
	}
	
	public void cancel() {
	System.out.println("Enter the seat number to be canceled");
	int n=scanner.nextInt();
	if(confirm_tickets.get(n)!=null){
		if(waiting.size()!=10){
		ticket[n]=waiting_ticket[buffer.getFirst()];
		confirm_tickets.put(n, ticket[n]);
		waiting_ticket[buffer.getFirst()]=null;
		waiting.add(buffer.getFirst());
		buffer.removeFirst();
		//confirm_tickets.remove(n);
		}
		else{
			ticket[n]=null;
			confirm.add(n);
			confirm_tickets.remove(n);
		}
		}
	}
}