/* driver class for the Book class */

public class BookTester{

  public static void main(String[] args){

    Book HungerGames = new Book("Hunger Games","Suzanne Collins",99750);
    HungerGames.giveReview(9);

    Book MazeRunner = new Book("Maze Runner","James Dashner",100000);
    MazeRunner.giveReview(8);

  }

}