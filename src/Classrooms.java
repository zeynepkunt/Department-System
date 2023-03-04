import java.util.Arrays;
import java.util.Scanner;
//declaration of class Classrooms
public class Classrooms extends Areas{
    //declare and initialize variables
    private int width;
    private int height;
    private int classId;
    private int[] Section;
    private int quota;
    private String classroomsAddress;
    //creating an empty constructor to use in testing and some objects
    public Classrooms(){

    }
    //creating a constructor with parameters for this class
    public Classrooms(int width, int height, int classId, int[] section, int quota, String classroomsAddress) {
        this.width = width;
        this.height = height;
        this.classId = classId;
        Section = section;
        this.quota = quota;
        this.classroomsAddress = classroomsAddress;
    }
    //Overriding and using calculateArea method from superclass to calculate area size for classrooms
    @Override
    public double calculateArea() {
        return width*height;
    }
    //Creating a toString method to show details of this class
    public String ClassroomDetails(){

        return "Classroom id is: "+classId+"\nClassroom quota is: "+quota+"\nAddress is: "+classroomsAddress;
    }
    //creating a scanner for get input from user
    Scanner scan = new Scanner(System.in);
    //Overriding and using isSmokingArea method from superclass to check this area is one of the smokelessAreas or not
    @Override
    public boolean isSmokingArea() {
        System.out.printf("Is smoking area: ");
        String className = this.getClass().getName();
        return Arrays.asList(notSmokelessAreas).contains(className);
    }

    //getter-setters methods for encapsulation and access and update the value of a private variable
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int[] getSection() {
        return Section;
    }

    public void setSection(int[] section) {
        Section = section;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public String getClassroomsAddress() {
        return classroomsAddress;
    }

    public void setClassroomsAddress(String classroomsAddress) {
        this.classroomsAddress = classroomsAddress;
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
