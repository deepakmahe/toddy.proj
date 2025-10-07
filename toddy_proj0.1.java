import java.util.*;

class Event {
    private int eventId;
    private String eventName;
    private String eventDate;
    private String location;

    public Event(int id, String name, String date, String location) {
        this.eventId = id;
        this.eventName = name;
        this.eventDate = date;
        this.location = location;
    }

    public int getEventId() { return eventId; }
    public String getEventName() { return eventName; }
    public String getEventDate() { return eventDate; }
    public String getLocation() { return location; }
}

class TournamentManager
{
    static int i=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Team tm[]=new Team[10];
        while (true) {
            System.out.println("\n--- Tournament Management---");
            System.out.println("1. Add Team");
            System.out.println("2. List Teams");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter team id:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Team Name: ");
                    String name = sc.nextLine();
                    tm[i]=new Team(id,name);
                    i++;
                    break;

                case 2:
                    int j=0;
                   
                    while(tm[j]!=null)
                      {
                       tm[j].display();
                       j++;
                      }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
        
           }    
            
        }
    }
}
class Team
{
    private int id;
    private String name;
    public Team(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
     {
	System.out.println("-->Team Name: "+name+"\n-->Team Id: "+id+"\n");
     }
}