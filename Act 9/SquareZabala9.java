class ShapeZ{
    int value = 10;
    int area = value*value;
    int parameters = 4*value;
    protected String val = "Every Shape its own formula for area and perimeter";
    void displayType(){
        System.out.println("SUPERCLASS: "+val);
    }
    void Perameters(){
        System.out.println("The value Shape side is:\t"+value);
        System.out.println("Superclass Perimeter:\t"+parameters);
    }
    void Area(){
        System.out.println("The value Shape side is:\t"+value);
        System.out.println("Superclass Area:\t"+area);
    }
}

public class SquareZabala9 extends ShapeZ{
    int value = 15;
    int area = value*value;
    int parameters = 4*value;

    @Override
    void displayType(){
        super.displayType();
        System.out.println(
            "SUBCLASS: The square formula for area is (state the formula), while the formula of perimeter is: (state the formula)"
        );
    }
    @Override
    void Area(){
        super.Area();
        System.out.println("The value Square side is:\t"+value);
        System.out.println("Superclass Area:\t"+area);

    }
    @Override
    void Perameters(){
        super.Perameters();
        System.out.println("The value Square side is:\t"+value);
        System.out.println("Subclass Perimeter:\t"+parameters);
    }
}