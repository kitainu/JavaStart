package statyczne.Zadanie;

public class University {


    public static void main(String[] args) {
    Student student = new Student("Janina","Kowalska",328384);
    Student student2 = new Student("Paulina", "Włodarczyk",123654);
    Student student3 = new Student("Marta","Klepacka",147852);


        System.out.println(student.getName()+ " "+ student.getSurname() + " " + student.getIndex());
        System.out.println(student2.getName()+ " "+ student2.getSurname() + " " + student2.getIndex());
        System.out.println(student3.getName()+ " "+ student3.getSurname() + " " + student3.getIndex());
        System.out.println(Student.numberOfStudent);
    }
}
