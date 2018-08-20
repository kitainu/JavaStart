package Tablice1;

public class Company {
    public static void main(String[] args) {
        Employee[] employee = new Employee[20];
        employee[0] = new Employee("Jan", "Kowalski",
                10.000);
        employee[1] = new Employee("Małgorzata", " koscianska",
                15.000);
        employee[2] = new Employee("Piotr", " Michałęk",
                15.000);
        employee[3] = new Employee("Małgorzata", " Wasińska",
                15.000);
        employee[4] = new Employee("Janina", " Moro",
                15.000);
        int employeeSize =employee.length;
        int employeeIndex = 2;
        System.out.println("Wielkość tablicy" + employeeSize);
        System.out.println("Ostatni element to " + employee[employeeSize-1]);}

//       System.out.println(employee[employeeIndex-1].getFirstName() + " "+
//        employee[employeeIndex-1].getLastName() + " " + employee[employeeIndex-1].getSalary());
//        System.out.println(employee[10].getFirstName() + " " + employee[10].getLastName() +
//                " " + employee[10].getSalary());



}
