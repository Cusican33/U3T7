public class Employee
{
    private String firstName;
    private String lastName;
    private int idNum;
    static int nextIDNum = 100;
    static int employees;

    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = nextIDNum;
        nextIDNum++;
        employees++;
    }

    public String getFullName() { return firstName + " " + lastName; }

    public int getID() { return idNum; }

    public static int getMostRecentEmployeeID() { return nextIDNum - 1; }

    public static int getTotalEmployeesCreated() { return employees; }

    public String employeeInfo()
    {
        return "--------------------------\n" +
                "Employee full name: " + getFullName() +
                "\nEmployee ID: " + getID() +
                "\nMost recent ID assigned: " + getMostRecentEmployeeID() +
                "\nTotal employees hired: " + getTotalEmployeesCreated();
    }
}
