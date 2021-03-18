/* driver class for the SoccerPlayer class */

public class SoccerTester{

  public static void main(String[] args){

    SoccerPlayer Julian = new SoccerPlayer("Julian");
    SoccerPlayer Emma = new SoccerPlayer("Emma");
    
    Julian.assist();
    Emma.score();

    Julian.assist();
    Emma.score();

    Emma.score();
    Julian.score();

    System.out.println(Emma.toString());
    System.out.println(Julian.toString());

  }
}