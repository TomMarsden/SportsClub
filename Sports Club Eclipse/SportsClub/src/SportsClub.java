import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class SportsClub {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(System.in);
		Boolean finished = false;
		String uInput = null;
		String curClient = null;
		String curEvent = null;
		// int inputErrors = 0;
		SortedArrayList<Event> eventList = new SortedArrayList<Event>();
		SortedArrayList<Client> clientList = new SortedArrayList<Client>();
		SortedArrayList<Integer> ticket = new SortedArrayList<Integer>();

		Scanner inFile = new Scanner(new FileReader("H:\\Computer Science Stuff\\CSC8001\\Assignment 2\\input.txt"));
		int clientNo = 0;
		int eventNo = 0;

		eventNo = Integer.parseInt(inFile.nextLine());

		for (int i = 0; i < eventNo; i++) {
			Event e = new Event(inFile.nextLine(), Integer.parseInt(inFile.nextLine()));
			eventList.sortAdd(e);
		}

		clientNo = Integer.parseInt(inFile.nextLine());

		for (int i = 0; i < clientNo; i++) {
			String wholeName = inFile.nextLine();
			String[] names = wholeName.split("\\s+");
			String forename = names[0];
			String surname = names[1];
			Client c = new Client(surname, forename, 0);
			clientList.sortAdd(c);
		}

		inFile.close();

		System.out.println("Welcome! To the sports club management system.");
		while (!finished) {
			System.out.println("\nPlease select one of the following options:\n");
			System.out.println("-----------------------------------------------\n");
			System.out.println("e - Display all event information.\nc - Display all client information.");
			System.out.println("b - Purchase Tickets for an event. \nr - Return a ticket for an event.");
			System.out.println("f - Exit the program.");

			while (s.hasNextInt()) {
				System.out.println("The input you have entered is a number. Please enter one of the options provided.");
				s.next();
				// inputErrors++;

				/**
				 * If the user inputs an invalid entry 4 times, then the program
				 * reminds them of the options. if(inputErrors>3){
				 * System.out.println("\nIt seems you are having some trouble.
				 * Please choose one of the following options:\n");
				 * System.out.println("-----------------------------------------------\n");
				 * System.out.println("e - Display all event information.\nc -
				 * Display all client information."); System.out.println("b -
				 * Purchase tickets for an event. \nr - Return a ticket for an
				 * event."); System.out.println("f - Exit the program.\n");
				 * inputErrors = 0; }
				 */
			}

			while (!s.hasNext("[ecbrfp]")) {
				System.out.println(
						"The input you have entered is not an option. Please enter one of the options provided!");
				s.next();
				// inputErrors++;

				/**
				 * If the user inputs an invalid entry 4 times, then the program
				 * reminds them of the options. if(inputErrors>3){
				 * System.out.println("\nIt seems you are having some trouble.
				 * Please choose one of the following options:\n");
				 * System.out.println("-----------------------------------------------\n");
				 * System.out.println("e - Display all event information.\nc -
				 * Display all client information."); System.out.println("b -
				 * Purchase tickets for an event. \nr - Return a ticket for an
				 * event."); System.out.println("f - Exit the program.\n");
				 * inputErrors = 0; }
				 */
			}

			uInput = s.nextLine();

			if (uInput.equals("e")) {
				System.out.println("\nThe following is a list of all the events in our database:");
				for (int i = 0; i < eventList.size(); i++) {
					System.out.println("\nEvent: " + eventList.get(i).getName() + "\nTickets: " + eventList.get(i).getTickets());
				}
			} else if (uInput.equals("c")) {
				for (int i = 0; i < clientList.size(); i++) {
					System.out.println("Client: " + clientList.get(i).getForename() + " " + clientList.get(i).getSurname());
					ArrayList<String> ticketList = clientList.get(i).getTickets();
					System.out.println(" Tickets:");
					for(int j = 0; j < ticketList.size(); j++){
						System.out.println(" - "+ticketList.get(j));
					}
				}
			} else if (uInput.equals("b")) {
				boolean added = false;
				int counter = 1;
				System.out.println("\nPlease enter the name of the client who would like to book:");
				
				curClient = s.nextLine();
				for (int i = 0; i < clientList.size(); i++) {
					if (added) {
						break;
					}
					if(counter == clientList.size()){
						System.out.println("\nThat is not a registered customer.");
						break;
					}
					if (clientList.get(i).getName().contains(curClient)) {
						System.out.println("\nPlease enter the name of the event the client would like to attend.");
						curEvent = s.nextLine();
						for (int j = 0; j < eventList.size(); j++) {
							System.out.println(eventList.get(j).getName());
							if (eventList.get(j).getName().equals(curEvent)) {
								clientList.get(i).addEvent(curEvent);
								added = true;
								break;
							}
						}
					}else{ 
						counter = counter+1;
					}
				}

			} else if (uInput.equals("r")) {
				System.out.println("WIP!");

			} else if (uInput.equals("f")) {
				System.out.println("Thank you for using the Sports Club Management Program. Goodbye!");
				finished = true;
			}
		}
		s.close();
	}
}
