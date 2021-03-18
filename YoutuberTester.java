public class YoutuberTester{
  public static void main(String[] args){

    Youtuber Mark = new Youtuber("Mark",10000);
    for (int day = 1; day <= 365; day++){ /* run for 365 days */
      Mark.setFollowers(Mark.getFollowers() + 100); /* 100 new followers per day */
    }
    System.out.println("Mark Followers: " + Mark.getFollowers());

  }
}