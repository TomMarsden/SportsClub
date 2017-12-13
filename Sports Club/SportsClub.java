import java.io.*;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
/**
 * 
 */
public class SportsClub
{   
    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(System.in);
        Boolean finished = false;
        String uInput = null;
        // int inputErrors = 0;
        SortedArrayList<Event> eventList = new SortedArrayList<Event>();
        SortedArrayList<Client> clientList = new SortedArrayList<Client>();
        SortedArrayList<Integer> ticket = new SortedArrayList<Integer>();
        HashMap<String,Integer> eventsTickets = new HashMap<String,Integer>();
        
        Scanner inFile = new Scanner(new FileReader("H:\\Computer Science Stuff\\CSC8001\\Assignment 2\\input.txt"));
        String name = null;
        String[] names = new String[2];
        String surname = null;
        String forename = null;
        int clientNo = 0;
        int eventNo = 0;
        
        clientNo = Integer.parseInt(inFile.nextLine());
        
        for(int i = 0; i < clientNo; i++){
            eventsTickets.put(inFile.nextLine(),Integer.parseInt(inFile.nextLine()));
        }
        
        
        System.out.println("Welcome! To the sports club management system.");
        do{
            System.out.println("\nPlease select one of the following options:\n");
            System.out.println("-----------------------------------------------\n");
            System.out.println("e - Display all event information.\nc - Display all client information.");
            System.out.println("b - Purchase Tickets for an event. \nr - Return a ticket for an event.");
            System.out.println("f - Exit the program.");
            
            while(s.hasNextInt()){
                System.out.println("The input you have entered is a number. Please enter one of the options provided.");
                s.next();
                // inputErrors++;
               
                /** If the user inputs an invalid entry 4 times, then the program reminds them of the options.
                 * if(inputErrors>3){
                 *     System.out.println("\nIt seems you are having some trouble. Please choose one of the following options:\n");
                 *     System.out.println("-----------------------------------------------\n");
                 *     System.out.println("e - Display all event information.\nc - Display all client information.");
                 *     System.out.println("b - Purchase tickets for an event. \nr - Return a ticket for an event.");
                 *     System.out.println("f - Exit the program.\n");
                 *     inputErrors = 0;
                 *  }
                */
            }
            
            while(!s.hasNext("[ecbrfp]")){
                System.out.println("The input you have entered is not an option. Please enter one of the options provided!");
                s.next();
                // inputErrors++;
                
                /** If the user inputs an invalid entry 4 times, then the program reminds them of the options.
                 * if(inputErrors>3){
                 *     System.out.println("\nIt seems you are having some trouble. Please choose one of the following options:\n");
                 *     System.out.println("-----------------------------------------------\n");
                 *     System.out.println("e - Display all event information.\nc - Display all client information.");
                 *     System.out.println("b - Purchase tickets for an event. \nr - Return a ticket for an event.");
                 *     System.out.println("f - Exit the program.\n");
                 *     inputErrors = 0;
                 *  }
                */
            }
            
            uInput = s.next();
            
            if(uInput.equals("e")){
                System.out.println("WIP!");
            }
            else if(uInput.equals("c")){
                System.out.println("WIP!");
            }
            else if(uInput.equals("b")){
                System.out.println("WIP!");
            }
            else if(uInput.equals("r")){
                System.out.println("WIP!");
            }
            else if(uInput.equals("f")){
                System.out.println("Thank you for using the Sports Club Management Program. Goodbye!");
                finished = true;
            } else if(uInput.equals("p")){
                System.out.println(clientNo);
                for(int i = 0; i<eventsTickets.size(); i++){
                    System.out.println(eventsTickets.get(i));
                }
            }
            
        }while(!finished);
        
    }
    
}

