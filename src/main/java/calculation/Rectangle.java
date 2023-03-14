package calculation;

 public class Rectangle implements CalculationRectangle{
    protected double length;
    protected double width;
    public Rectangle(double length, double width) {
         this.length = length;
         this.width = width;
     }

     public double perimeterRectangle(double length, double width) {
         return  2 * (length + width);
     }

     public double areaRectangle(double length, double width) {
         return length * width;
     }
 }
