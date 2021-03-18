public class TriangleRunner{

  public static void main(String[] args){
    
    //creates triangle at (0,0), (1,1), and (-3,-4)
    Triangle t1 = new Triangle(0,0,1,1,-3,-4);
    System.out.println("Area: " + t1.findArea());

  }

}