public class Main
{
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(5, 6);
        boolean square = rect1.isSquare();
        System.out.println(square + "\n");

        // --- test milesToKm method ---
        // 1. convert 13.85 miles to kilometers
        double km1 = RaceUtility.milesToKm(13.85);
        System.out.println("13.85 miles = " + km1 + " km");

        // 2. convert 26.42 miles to kilometers
        double km2 = RaceUtility.milesToKm(26.42);
        System.out.println("26.42 miles = " + km2 + " km");


        // --- test kmToMiles method ---
        // 3. convert 40 km to miles
        double miles1 = RaceUtility.kmToMiles(40);
        System.out.println("40 km = " + miles1 + " miles");

        // 4. convert 3.5 km to miles
        double miles2 = RaceUtility.kmToMiles(3.5);
        System.out.println("3.5 km = " + miles2 + " miles");


        // --- test makeProper method ---
        // 5. make string proper
        String proper1 = RaceUtility.makeProper("welcome to the marathon!");
        System.out.println(proper1);

        // 6. make string proper
        String proper2 = RaceUtility.makeProper("It's TIME for THE 5k!");
        System.out.println(proper2 + "\n");

        // 1. create employee1
        Employee employee1 = new Employee("Jim", "Mason");
        System.out.println(employee1.employeeInfo());


        // 2. print static variables
        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());


        // 3. create employee2
        Employee employee2 = new Employee("Amy", "Adams");
        System.out.println(employee2.employeeInfo());


        // 4. print static variables again
        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());


        // 5. call employeeInfo again on both
        System.out.println(employee1.employeeInfo());
        System.out.println(employee2.employeeInfo());


        // 6. create employee3
        Employee employee3 = new Employee("Bob", "Ross");
        System.out.println(employee3.employeeInfo());


        // 7. create employee4
        Employee employee4 = new Employee("Cindy", "Nox");
        System.out.println(employee4.employeeInfo());


        // 8. call employeeInfo on all 4
        System.out.println(employee1.employeeInfo());
        System.out.println(employee2.employeeInfo());
        System.out.println(employee3.employeeInfo());
        System.out.println(employee4.employeeInfo());


        // 9. final static variable check
        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());
    }
}
