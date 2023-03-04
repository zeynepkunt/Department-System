//declaration of class Graduate
public class Graduate extends Students {
    //declare and initialize variables
    private String licenceDegree;
    private String thesisName; // extra attributes use headofthedepartment class
    private int graduationYear; // extra attributes use headofthedepartment class
    //creating a constructor with parameters for this class
    public Graduate(int studentIdentificationNumber, int year, String studentName, String gender, int studentID,double studentBalance,
                    String licenceDegree, String thesisName, int graduationYear) {
        super(studentIdentificationNumber, year, studentName, gender, studentID,studentBalance);
        this.licenceDegree = licenceDegree;
        this.thesisName = thesisName;
        this.graduationYear = graduationYear;
    }
    //overloading constructor Graduate
    public Graduate(int studentID) {
        super(studentID);
    }
    //Creating a toString method to show details of this class
    public String graduateDetails() { // extra method
        return "Thesis Name = " + thesisName + " \nGraduation Year = " + graduationYear;
    }

    //creating an Action method using switch statement to easily access other methods. Works like a menu.
    public void Action() { // extra method
        System.out.println("1-) Thesis Submission");
        System.out.println("2-) Students' Works");
        System.out.println("3-) Student Details");
        System.out.println("4-) Exit the program.");
        System.out.print("Select the action you want to do: ");
        int process = scan.nextInt();
        switch (process) {
            case 1:
                thesisSubmission();
                Action();
                break;
            case 2:
                super.Action();
                break;
            case 3:
                System.out.println(studentDetails());
                System.out.println(graduateDetails());
                Action();
                break;
            case 4:
                break;
            default:
                System.out.println("Wrong choice. Please try again.");
                Action();
                break;
        }
    }
    public void thesisSubmission() { // extra method will write it

    }
    //getter-setters methods for encapsulation and access and update the value of a private variable
    public String getThesisName() {
        return thesisName;
    }
    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }
    public String getLicenceDegree() {
        return licenceDegree;
    }
    public void setLicenceDegree(String licenceDegree) {
        this.licenceDegree = licenceDegree;
    }
    public int getGraduationYear() {
        return graduationYear;
    }
}