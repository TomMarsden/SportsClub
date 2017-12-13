
/**
 * 
 */
public class Event
{
    String name;
    int tickets = 0;
    
    public int compareTo(Event E){
        return name.compareTo(E.getName());
    }
    
    public Event(String name, int tickets){
        this.name = name;
        this.tickets = tickets;
    }
    
    public String getName(){
        return name;
    }
    
    public int getTickets(){
        return tickets;
    }
}
