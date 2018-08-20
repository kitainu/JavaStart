package Polimorfizm.zadanie;

public  class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Rafał","Pestka",7300,0));
        hospital.add(new Nurse("Michalina","Pestka",3300,2500));
        hospital.add(new Nurse("Agnieszka","Pestka",2300,2000));

        System.out.println("Pracownicy " + hospital);
    }

}
