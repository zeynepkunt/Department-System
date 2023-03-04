import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
//declaration of class TechnicalStaff
public class TechnicalStaff implements Staff {
    //declare and initialize variables
    int staffId;
    String staff_name;
    String task;
    int workHour;
    double salary;
    String gender;
    private String technicalEmail;
    private String technicalCellNum;

    //creating an empty constructor to use in testing and some objects
    public TechnicalStaff() {
    }

    //creating a constructor with parameters for this class
    public TechnicalStaff(int staffId, String staff_name, String task, int workHour, double salary, String gender,String technicalEmail, String technicalCellNum) {
        this.staffId = staffId;
        this.staff_name = staff_name;
        this.task = task;
        this.workHour = workHour;
        this.salary = salary;
        this.gender = gender;
        this.technicalEmail = technicalEmail;
        this.technicalCellNum = technicalCellNum;
    }
    Integer[] workingDays = new Integer[]{1,2,3,4,5};

    //getter-setters methods for encapsulation and access and update the value of a private variable

    public String getTechnicalEmail() {
        return technicalEmail;
    }

    public void setTechnicalEmail(String technicalEmail) {
        this.technicalEmail = technicalEmail;
    }


    public String getTechnicalCellNum() {
        return technicalCellNum;
    }

    public void setTechnicalCellNum(String technicalCellNum) {
        this.technicalCellNum = technicalCellNum;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //creating a scanner for get input from user
    Scanner scan = new Scanner(System.in);

    //creating an Action method using switch statement to easily access other methods. Works like a menu.
    public void Action() { // extra method use it sub class
        System.out.println("1-) Check the Technical Staff working today or not");
        System.out.println("2-) Technical Staff Details");
        System.out.print("Select the action you want to do: ");
        int process = scan.nextInt();
        switch (process) {
            case 1:
                if(isAvailable(workingDays)){
                    System.out.println("Yes this technical staff is working today.");
                }else System.out.println("No this technical staff is not working today");
                break;
            case 2:
                staffDetails();
                break;
            default:
                System.out.println("Wrong choice. Please try again.");
                Action();
                break;
        }
    }

    //Overriding and using a overtimePay method to calculate and print staff member's new salary and overtime pay price

    @Override
    public void overtimePay(double salary , String name , int workHour) {
        if(workHour!=0){


            double rateOfPay = salary/workHour;
            double overtime = 0;

            if (workHour > 40)
                overtime = (workHour - 40) * 1.5;


            double newSalary = ((overtime == 0) ? (workHour * rateOfPay) : ((overtime + 8) * rateOfPay * 4));
            System.out.printf("%s's salary updated from %f to %f (Overtime Pay Price:%f)",name,salary,newSalary,(newSalary-salary));
            setSalary(newSalary);
        }else System.out.println("This staff has 0 work hour.");
    }


    /*Overriding and using isAvailable method to check the Cleaning Staff working today or not
    while doing that we are creating a Date object to use getDay() method for get day of the week in int format
    and converting our Array to a List to use ".contains" method to check is the date we get from getDay() method in
    the workingDays Array or not.
    */
    @Override
    public boolean isAvailable(Integer[] workingDays) {
        Date d = new Date();
        return Arrays.asList(workingDays).contains(d.getDay());
    }

    //Creating a toString method to show details of this class
    @Override
    public String staffDetails() {
        return "Technical Staff Details: Technical Staff Id:" + staffId + "\nTechnical Staff Name:" + staff_name + "\nTechnical Staff Task:" + task + "\nTechnical Staff Work Hour:" + workHour + "\nTechnical Staff Salary:" + salary + "\nTechnical Staff Gender:" + gender +  "\n Technical Staff Email:" + technicalEmail + "\n Technical Staff Cell Number:" + technicalCellNum;
    }
}
