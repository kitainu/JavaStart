package Polimorfizm.zadanie;

public class Person {
    private String name;
    private String lastName;
    private int payment;

    public void setName(String name){
       this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getPayment() {
        return payment;
    }
    public Person(String name, String lastName, int payment){
        setName(name);
        setLastName(lastName);
        setPayment(payment);
    }
    public Person() {} // musi być tylko nie wiem po co

    @Override
    public String toString() {
        return "Imię" + name + "Nazwisko" + lastName + " payment" + payment;
    }
}
