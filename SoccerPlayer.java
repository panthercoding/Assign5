public class SoccerPlayer{
 private String name;
 private int goals = 0; //default for new player
 private int assists = 0; //default for new player
 
 public SoccerPlayer(String playerName){
   name = playerName; /* constructor method */
 }
 
 public void score(){ /* score a goal (mutator) */
   goals++; /* increase the number of goals */
 }
 public void assist(){ /* gains an assist (mutator) */
   assists++; /* increase the number of assists */
 }
 
 public String getName(){
   return(name); /* accessor method */
 }
 public int getGoals(){
   return(goals); /* accessor method */
 }
 public int getAssists(){
   return(assists); /* accessor method */
 }
 
 public String toString(){ /* presents Player information */
   return(name + ": "+ goals + " goals, " + assists + " assists");
 }
}
