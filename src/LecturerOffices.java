import java.util.Arrays;
import java.util.Scanner;
//declaration of class LecturerOffices
public class LecturerOffices extends Areas{
    //declare and initialize variables
    private Lecturers lecturer;
    private String lecturerOfficeAddress;
    private int width;
    private int height;

    //creating an empty constructor to use in testing and some objects
    public LecturerOffices(){

    }

    //Overriding and using calculateArea method from superclass to calculate area size for StaffOffices
    @Override
    public double calculateArea() {
        return width*height;
    }

    //creating a constructor with parameters for this class
    public LecturerOffices(Lecturers lecturer, String lecturerOfficeAddress,int height,int width){
        super();
        this.width=width;
        this.height=height;
        this.lecturerOfficeAddress=lecturerOfficeAddress;
    }

    //Creating a Secretary object to use in lecturerIsAvailable method
    Secretary secretary=new Secretary();
    //Creating a lecturerIsAvailable method to check lecturers are available or not and print them
    public void lecturerIsAvailable(){
        for (int i=0;i<secretary.totalLecturers.length;i++){
            if(secretary.totalLecturers[i]==null){
                System.out.println("There is no Lecturer");
                i=secretary.totalLecturers.length;
            }
            else{
                boolean available= secretary.totalLecturers[i].isAvailable();
                if (available){
                    System.out.println(secretary.totalLecturers[i].getTitleName()+" "+ secretary.totalLecturers[i].getLecturerName()+" is available.\nYou can visit.");
                }
                else{
                    System.out.println("Sorry, "+ secretary.totalLecturers[i].getTitleName()+" "+ secretary.totalLecturers[i].getLecturerName()+" is not available");
                }
            }
        }

    }

    //creating a scanner for get input from user
    Scanner scan = new Scanner(System.in);

    //Creating a toString method to show details of this class
    public String LecturerOfficesDetail(){
        return lecturer.getTitleName()+" "+lecturer.getLecturerName()+"'s office address is: "+lecturerOfficeAddress;
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
    public String getLecturerOfficeAddress() {
        return lecturerOfficeAddress;
    }

    public void setLecturerOfficeAddress(String lecturerOfficeAddress) { this.lecturerOfficeAddress = lecturerOfficeAddress;}

    public int getWidth() { return width; }

    public void setWidth(int width) { this.width = width; }

    public int getHeight() { return height; }

    public void setHeight(int height) { this.height = height; }

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
