package calculation;


interface CalculationCir {
   double perimeterCir(double radius);

    double areaCir(double radius);

}
interface CalculationTriangle {
    double perimeterTriangle(double side1, double side2, double base);

    double areaTriangle(double base, float height);

}
interface CalculationRectangle{
    double perimeterRectangle(double length, double width);

    double areaRectangle(double length, double width);
}




