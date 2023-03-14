package calculation;

 public class Triangle implements CalculationTriangle {
   protected double side1;
   protected double side2;
   protected double base;
    public Triangle(double side1, double side2, double base) {

        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
    }
    public double areaTriangle(double base, float height) {

        return 0.5 * base * height;

    }

     public double perimeterTriangle(double side1, double side2, double base) {

        return side1 + side2 + base;

    }
}
