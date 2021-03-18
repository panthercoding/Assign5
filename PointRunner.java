/* driver class for Point */

public class PointRunner{

  public static void main(String[] args){

    Point p1 = new Point(); //(0,0)
    Point p2 = new Point(5,6);
    
    System.out.println("Distance: " + p1.distanceTo(p2));

  }

}