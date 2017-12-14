import java.util.ArrayList;

/**
 * 
 */
public class Client implements Comparable<Client>
{
    String firstName;
    String surname;
    int ticketsBought = 0;
    ArrayList<String> eventList = new ArrayList<String>();
    
    public Client(String surname, String firstName, int ticketsBought){
        this.firstName = firstName;
        this.surname = surname;
        this.ticketsBought = ticketsBought;
    }

	@Override
	public int compareTo(Client C) {
		String name = surname + firstName;
		return name.compareTo(C.getSurname() + " " + C.getForename());
	}
    
   public String getForename(){
	   return firstName;
   }
   
   public String getSurname(){
	   return surname;
   }
   
   public String getName(){
	   String name = firstName + " " + surname;
	   return name;
   }
   
   public void addEvent(String event){
	   eventList.add(event);
   }
   
   public ArrayList<String> getTickets(){
	   return eventList;
   }
   
   public void removeEvent(String e){
	   for(int i = 0; i < eventList.size(); i++){
		   if(eventList.get(i).contains(e)){
			   eventList.remove(i);
		   }
	   }
   }
}