import java.util.Scanner;
//Creating an abstract Social class that extends abstract Areas class to achieve double abstraction.
public abstract class Social extends Areas{

    //creating an empty constructor to use in testing and some objects
    public Social() {

    }
    @Override
    public abstract void isClear(boolean clear);

    //Overriding and using calculateArea method to calculate area.
    @Override
    public abstract double calculateArea();
    //creating a scanner for get input from user
    Scanner scan = new Scanner(System.in);
    //creating abstract isSmokingArea method to use it in subclasses
    @Override
    public abstract boolean isSmokingArea();

}
