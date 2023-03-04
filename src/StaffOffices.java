import java.util.Arrays;
import java.util.Scanner;
//declaration of class StaffOffices
public class StaffOffices extends Areas{
    //declare and initialize variables
    private int officeID;
    private String staffOfficeAddress;
    private int width;
    private int height;
    private Staff staff;

    //creating an empty constructor to use in testing and some objects
    public StaffOffices(){

    }

    //Overriding and using calculateArea method from superclass to calculate area size for StaffOffices
    @Override
    public double calculateArea() {
        return height*width;
    }

    //creating a constructor with parameters for this class
    public StaffOffices( int officeID, String staffOfficeAddress, int width, int height) {
        this.officeID = officeID;
        this.staffOfficeAddress = staffOfficeAddress;
        this.width = width;
        this.height = height;
    }
    //creating a scanner for get input from user
    Scanner scan = new Scanner(System.in);

    /*Creating a IsAvailable method for check the Staff working today or not by using "staff.isAvailable(workingDays)" method
    to do this we want to specify the kind of staff,so we ask user to choose.
    */
    public void IsAvailable(){
        Integer[] workingDays=new Integer[]{0,1,2,3,4,5};
        int process = scan.nextInt();
        System.out.println("Choice kind of Staff\n1-TechnicalStaff\n2-CleaningStaff\n3-Secretary");
        switch (process) {
            case 1:
                staff=new TechnicalStaff(1,"dsf","dsf",50,15000,"Male","kjhjh","45645");
                staff.isAvailable(workingDays);
                break;
            case 2:
                staff=new CleaningStaff(5, "Ayşe", "Cleaning Staff", 40, 8500, "Female", "ayse@gmail.com", "05300000000");
                staff.isAvailable(workingDays);
                break;
            case 3:
                staff=new Secretary(3,40,"Ahmet","Secretary","Male",8500,"ahmet@gmail.com","05333333333");
                staff.isAvailable(workingDays);
                break;
            default:
                System.out.println("Wrong choice. Please try again.");
                break;
        }

    }
    //Creating a toString method to show details of this class
    public String staffOfficesDetail(){
        return "Staff office id: "+officeID+"\nStaff Office address :"+staffOfficeAddress;
    }
    /*Overriding and using isSmokingArea method from superclass to check this area is one of the smokelessAreas or not
    to do this we are creating a className variable to assign class name to it by using "this.getClass().getName()"
    method and converting our Array to a List to use ".contains" method to check is the name we get from "this.getClass().getName()"
    method in the smokelessAreas Array or not.
     */
    @Override
    public boolean isSmokingArea() {
        System.out.printf("Is smoking area: ");
        String className = this.getClass().getName();
        return Arrays.asList(notSmokelessAreas).contains(className);
    }
    //getter-setters methods for encapsulation and access and update the value of a private variable
    public int getOfficeID() {
        return officeID;
    }

    public String getStaffOfficeAddress() {
        return staffOfficeAddress;
    }

    public void setStaffOfficeAddress(String staffOfficeAddress) {
        this.staffOfficeAddress = staffOfficeAddress;
    }

    public void setOfficeID(int officeID) {
        this.officeID = officeID;
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
