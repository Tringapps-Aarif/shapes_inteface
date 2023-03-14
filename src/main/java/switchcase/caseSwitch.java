package switchcase;

import calculation.Circle;
import calculation.Rectangle;
import calculation.Triangle;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class caseSwitch {

    final Logger print = Logger.getLogger("shape");
   final Scanner sc = new Scanner(System.in);
    private int choice = 0;

    public void operations()
    {
        while (choice != 4) {

            print.info("Enter your choice \n 1.Triangle \n 2.Rectangle \n 3.Circle \n 4.Exit ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    print.info("\n Enter the Base Value : ");
                    double base = sc.nextDouble();
                    print.info(" Enter the Lenth value : ");
                    float height = sc.nextFloat();
                    print.info("\n Enter side 1 and side 2: ");
                    print.info("\n Side1 : ");
                    double side1 = sc.nextDouble();
                    print.info("\n Side2 : ");
                    double side2 = sc.nextDouble();
                    Triangle tri = new Triangle(side1, side2, base);
                    print.info("Traingle created successfully ");
                    print.log(Level.INFO, () -> ("Area of Triangle: " + tri.areaTriangle(base, height)));
                    print.log(Level.INFO, () -> ("Perimeter of Triangle:" + tri.perimeterTriangle(side1, side2, base)));
                }
                case 2 -> {
                    print.info("\n Enter the Length Value : ");
                    double length = sc.nextDouble();
                    print.info(" Enter the Width Value : ");
                    double width = sc.nextDouble();
                    Rectangle rect = new Rectangle(length, width);
                    print.info("Rectangle created successfully ");
                    print.log(Level.INFO, () -> ("Area of Rectangle:" + rect.areaRectangle(length, width)));
                    print.log(Level.INFO, () -> ("Perimeter of Rectangle:" + rect.perimeterRectangle(length, width)));
                }
                case 3 -> {
                    print.info("\n Enter the Radius Value : ");
                    double radius = sc.nextDouble();
                    Circle cir = new Circle(radius);
                    print.info("Circle created successfully ");
                    print.log(Level.INFO, () -> ("Area of Circle:" + cir.areaCir(radius)));
                    print.log(Level.INFO, () -> ("Perimeter of Circle:" + cir.perimeterCir(radius)));
                }
                case 4 -> System.exit(0);
                default -> print.info("\n Invalid Choice");
            }
        }
    }
}
