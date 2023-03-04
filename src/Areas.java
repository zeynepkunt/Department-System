import java.util.Scanner;
//Creating an abstract Areas class to ease using methods
public abstract class Areas{
    //declare and initialize variables
    private final int totalClassroomNumber=25;
    private final int totalLectureOfficeNumber=32;
    private final int totalStaffOfficeNumber=86;
    String[] notSmokelessAreas = new String[]{"Social","Garden"};
    //creating a scanner for get input from user
    Scanner scan = new Scanner(System.in);

    //creating an empty constructor to use in testing and some objects
    public Areas(){


    }

    //creating a constructor with parameters for this class
    public Areas(String[] smokelessAreas) {
        super();
        this.notSmokelessAreas = smokelessAreas;
    }

    //creating calculateArea method to use it in subclasses
    public abstract double calculateArea();

    //creating isClear method to check is the area is clear or not if it is not it is checking the cleaning staff if it is available or not
    public abstract void isClear(boolean isClear);
    //creating a toString method to show details of this class
    public String showAreas(){//extra method
        return "There are lecturer offices, staff offices, classrooms and social areas in this area.\n"
                +"Total Lecturer Offices: "+ totalLectureOfficeNumber
                +"\nTotal Staff Offices: " + totalStaffOfficeNumber
                +"\nTotal Classrooms: "+totalClassroomNumber;
    }
    //creating isSmokingArea method to use it in subclasses
    public abstract boolean isSmokingArea();
    //getter-setters methods for encapsulation and access and update the value of a private variable
    public int getTotalClassroomNumber() {
        return totalClassroomNumber;
    }

    public int getTotalLectureOfficeNumber() {
        return totalLectureOfficeNumber;
    }

    public int getTotalStaffOfficeNumber() {
        return totalStaffOfficeNumber;
    }


}
