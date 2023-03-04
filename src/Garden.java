import java.util.Arrays;

//declaration of class Garden
public class Garden extends Social{
    final double pi = 3.14f;
    private int r;
    //creating a constructor with parameters for this class

    public Garden(int r){
        this.r=r;
    }

    /*Overriding and using isSmokingArea method to check the Area is smokeless area or not
    while doing that we are creating a local variable named className,and we are using ".getClass().getName()"
    method to access our class name and assign it to className and converting our Array to a List to use ".contains"
    method to check is the className we get from ".getClass().getName()" method in the smokelessAreas Array or not.
     */
    @Override
    public double calculateArea() {
        return pi*r*r;
    }
    @Override
    public boolean isSmokingArea() {
        System.out.printf("Is smoking area: ");
        String className = this.getClass().getName();
        return Arrays.asList(notSmokelessAreas).contains(className);
    }

    //Creating a toString method to show details of this class
    public String gardenDetail() {
        return "Garden area: " + calculateArea();
    }

    // getter setter method
    public void setR(int r) {
        if(r<0)r=0;
        else {
            this.r = r;}
    }
    public int getR() {
        return r;
    }

    /*Creating a isClear method to check the Cleaning Staff cleaning right now or not
    while doing that we are creating a Date object to use getHours() method for get hour of the day in int format
    and converting our Array to a List to use ".contains" method to check is the date we get from getHours() method in
    the cleaningHours Array or not.
    */
    @Override
    public void isClear(boolean isClear) {
        if(isClear){
            System.out.println("This place is pretty clean");
        }
        else{
            Integer[] workingDays={0,1,2,3,4,5};
            Integer[] cleaningHour={1,2,3,4,5,6,7};
            CleaningStaff cleaningStaff=new CleaningStaff(1,"M.O.","cleaning",
                    50,6000.0,"Male","asd@gmail.com","7635200");
            if(cleaningStaff.isAvailable(workingDays) && !cleaningStaff.isCleaning(cleaningHour)){
                System.out.println("This area will be cleared immediately");
            }
            else{
                System.out.println("Sorry, our cleaning staff is not available!");
            }
        }

    }
}
