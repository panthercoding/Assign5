public class Youtuber{
  private String name;
  private int followers;

  public Youtuber(String name, int followers){
    this.name = name; //constructor method
    this.followers = followers;
  }

  public int getFollowers(){
    return(followers); //accessor method
  }

  public void setFollowers(int updatedFollowers){
    followers = updatedFollowers; //mutator method
  }
}