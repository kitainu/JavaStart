package Klasy;

public class Company {
    public static void main(String[] args) {
        Employee employee1= new Employee();
        employee1.imię = " Jan";
        employee1.nazwisko = "Kowalski";
        employee1.rokUrodzenia = 1977;
        employee1.stażPracy = 30;

        System.out.println(employee1.imię + " " + employee1.nazwisko + " " + employee1.rokUrodzenia + " "
        + employee1.stażPracy);

        Employee employee2 = new Employee();
        employee2.imię = " Janina";
        employee2.nazwisko = " Czuba";
        employee2.rokUrodzenia = 1963;
        employee2.stażPracy = 42;

        System.out.println(employee2.imię + " " + employee2.nazwisko + " " + employee2.rokUrodzenia + " "
                + employee2.stażPracy);

    }
}
