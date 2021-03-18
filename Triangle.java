/* uses the Point class
this class is more challenging than the others 
mathematically and in terms of computational theory, so proceed with caution
 */

public class Triangle{
  /* a triangle consists of three points / vertices */
  private Point vertex1;
  private Point vertex2;
  private Point vertex3;
  /* three side lengths that can be calculated from vertices */
  private double side1; /* side from vertex2 to vertex3 */
  private double side2; /* side from vertex1 to vertex3 */
  private double side3; /* side from vertex1 to vertex2 */

  /* input the x and y coordinats of each vertex */
  public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
    vertex1 = new Point(x1,y1);
    vertex2 = new Point(x2,y2);
    vertex3 = new Point(x3,y3);
    side3 = vertex1.distanceTo(vertex2);
    side2 = vertex1.distanceTo(vertex3);
    side1 = vertex2.distanceTo(vertex3);
  }

  public double getSide1(){
    return(side1);
  }

  public double getSide2(){
    return(side2);
  }

  public double getSide3(){
    return(side3);
  }

  public double findArea(){ /* implements Heron's formula */

    double perimeter = side1 + side2 + side3;
    double s = perimeter / 2; //semi-perimeter
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

  }

}
