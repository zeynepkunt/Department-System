import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
//declaration of class CleaningStaff
public class CleaningStaff implements Staff {
    //declare and initialize variables
    int staffId;
    String staff_name;
    String task;
    int workHour;
    double salary;
    String gender;

    private String cleaningEmail;

    private String cleaningCellNum;
    //creating an empty constructor to use in testing and some objects
    public CleaningStaff() {
    }
    //creating a constructor with parameters for this class
    public CleaningStaff(int staffId, String staff_name, String task, int workHour, double salary, String gender, String cleaningEmail, String cleaningCellNum) {
        this.staffId = staffId;
        this.staff_name = staff_name;
        this.task = task;
        this.workHour = workHour;
        this.salary = salary;
        this.gender = gender;
        this.cleaningEmail = cleaningEmail;
        this.cleaningCellNum = cleaningCellNum;
    }
    Integer[] workingDays = new Integer[]{1,2,3,4,5};
    Integer[] cleaningHours = new Integer[]{1,2,3,4,5};


    //getter-setters methods for encapsulation and access and update the value of a private variable
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

    public String getCleaningEmail() {
        return cleaningEmail;
    }

    public void setCleaningEmail(String cleaningEmail) {
        this.cleaningEmail = cleaningEmail;
    }

    public String getCleaningCellNum() {
        return cleaningCellNum;
    }

    public void setCleaningCellNum(String cleaningCellNum) {
        this.cleaningCellNum = cleaningCellNum;
    }

    //creating a scanner for get input from user
    Scanner scan = new Scanner(System.in);

    //creating an Action method using switch statement to easily access other methods. Works like a menu.
    public void Action() { // extra method use it sub class
        System.out.println("1-) Check the Cleaning Staff working today or not ");
        System.out.println("2-) Check the Cleaning Staff cleaning right now or not ");
        System.out.println("2-) Cleaning Staff Details");
        System.out.print("Select the action you want to do:");
        int process = scan.nextInt();
        switch (process) {
            case 1:
                if(isAvailable(workingDays)){
                    System.out.println("Yes this cleaning staff is working today.");
                }else System.out.println("No this cleaning staff is not working today");
                break;
            case 2:
                if(isAvailable(cleaningHours)){
                    System.out.println("Yes this cleaning staff is cleaning right now.");
                }else System.out.println("No this cleaning staff is not cleaning right now");
                break;
            case 3:
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
        return "Cleaning Staff Details: Cleaning Staff Id:" + staffId + "\nCleaning Staff Name:" + staff_name + "\nCleaning Staff Task:" + task + "\nCleaning Staff Work Hour:" + workHour + "\nCleaning Staff Salary:" + salary + "\nCleaning Staff Gender:" + gender +  "\n Cleaning Staff Email:" + cleaningEmail + "\n Cleaning Staff Cell Number:" + cleaningCellNum;
    }
    /*Creating a isCleaning method to check the Cleaning Staff cleaning right now or not
     while doing that we are creating a Date object to use getHours() method for get hour of the day in int format
     and converting our Array to a List to use ".contains" method to check is the date we get from getHours() method in
     the cleaningHours Array or not.
     */
    public boolean isCleaning(Integer[] cleaningHours) {
        if (isAvailable(workingDays)) {
            Date d = new Date();
            return Arrays.asList(cleaningHours).contains(d.getHours());
        }

        return false;
    }



}