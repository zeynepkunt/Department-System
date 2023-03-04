//declaration of class Undergraduate
public class Undergraduate extends Students {
    //declare and initialize variables
    private int discontinuityDays; // extra attributes use it lecturer class
    private int beginYear; // extra attributes will use it headofthedepartment class

    //Creating a Secretary object to use in searchStudent method
    Secretary secretary = new Secretary();

    //creating a constructor with parameters for this class
    public Undergraduate(int studentIdentificationNumber, int year, String studentName, String gender, int studentID,double studentBalance,
                         int beginYear) {
        super(studentIdentificationNumber, year, studentName, gender, studentID,studentBalance);
        this.beginYear = beginYear;
    }
    //overloading constructor Graduate
    public Undergraduate(int studentID) {
        super(studentID);
    }

    //Creating a toString method to show details of this class
    public String undergraduateDetails() { // extra method
        return "Discontinuity Days = " + discontinuityDays + " \nBegin Year = " + beginYear;
    }
    //creating an Action method using switch statement to easily access other methods. Works like a menu.
    public void Action() { // extra method
        System.out.println("1-) Students' Works");
        System.out.println("2-) Student Details");
        System.out.println("3-) Exit the program.");
        System.out.print("Select the action you want to do: ");
        int process = scan.nextInt();
        switch (process) {
            case 1:
                super.Action();
                break;
            case 2:
                System.out.println(studentDetails());
                System.out.println(undergraduateDetails());
                Action();
                break;
            case 3:
                break;
            default:
                System.out.println("Wrong choice. Please try again.");
                Action();
                break;
        }
    }
    //Creating a basic searchStudent algorithm using studentID. If it finds the student it shows the details of the student.
    public void searchStudent(int studentID) { // extra method use it lecturers class
        for (int i = 0; i <= secretary.getTotalUndergraduateStudentValue(); i++) {
            if (studentID == secretary.totalUndergraduateStudent[i].getStudentID()) {
                secretary.totalUndergraduateStudent[i].studentDetails();
            }
            else {
                System.out.println("There are no students you are looking for.");
            }
        }
    }
    //getter-setters methods for encapsulation and access and update the value of a private variable
    public int getDiscontinuityDays() {
        return discontinuityDays;
    }
    public void setDiscontinuityDays(int discontinuityDays) {
        this.discontinuityDays = discontinuityDays;
    }
    public int getBeginYear() {
        return beginYear;
    }
}