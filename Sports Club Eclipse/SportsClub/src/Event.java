import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class Event implements Comparable<Event>
{
    String name;
    int tickets = 0;
    
    @Override
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
    
    public void ticketBought(){
    	tickets = tickets-1;
    }
    
    public void ticketReturn(){
    	tickets = tickets+1;
    }
    
    public void soldOut(String c) throws IOException{
    	File file = new File(c+".txt");
    	file.createNewFile();
    	FileWriter fileWriter = new FileWriter(file);
    	fileWriter.write("Hello "+c+",");
    	fileWriter.write("\nWe are writing to let you know that the tickets for "+name+" have sold out. \nWe offer our sincerest apologies. \nKind Regards, \nSports Club Manager");
    	fileWriter.close();
    }
}