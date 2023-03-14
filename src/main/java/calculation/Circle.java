package calculation;

 public class Circle implements CalculationCir{
protected double radius;

  public Circle(double radius) {
        this.radius = radius;
    }



    public double perimeterCir(double radius) {
        return 2 * 3.14 * radius;
    }


    public double areaCir(double radius) {
        return radius * radius * 3.14;
    }


    }



