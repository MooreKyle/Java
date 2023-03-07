import java.util.Scanner;

//Class: mooreObjects
class mooreObjects {
    
    private double a;
    private double b;
    private double c;

    //Constructor: Default
    mooreObjects() {
        a = 0;
        b = 0;
        c = 0;
    }

    //Setters: For specifying coefficients for user
    mooreObjects(double newA, double newB, double newC) {
        a = newA;
        b = newB;
        c = newC;
    }

    //Getter Methods: Retrieves Coefficients
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    //getDiscriminant Method: Returns the discriminant from expression (b^2-4ac)
    public double getDiscriminant() {
        return (Math.pow(b, 2) - 4 * a * c);
    }

    //getRoot1 Method: Returns Root 1
    public double getRoot1() {
        return ((-b + Math.sqrt(getDiscriminant())) / (2 * a));
    }
    
    //getRoot2 Method: Returns Root 2
    public double getRoot2() {
        return ((-b - Math.sqrt(getDiscriminant())) / (2 * a));
    }
}