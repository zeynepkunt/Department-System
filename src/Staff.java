
//Creating an interface to achieve abstraction.
public interface Staff{

    //Creating empty bodies of methods that we want to use in our implemented classes.
    void overtimePay(double salary , String name , int workHour);

    public boolean isAvailable(Integer[] workingDays);

    public String staffDetails();
}


