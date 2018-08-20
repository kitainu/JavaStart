package Polimorfizm.zadanie;

public class Hospital {
    public static final int MAX_PEOPLE = 3;

    private Person[] person;
    private int people;

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public Hospital(Person[] person, int people) {
        setPerson(new Person[MAX_PEOPLE]);
        setPeople(0);
    }

    public Hospital() {
    }

    ;

    public void add(Person person) {
        if (getPeople() < MAX_PEOPLE) {
            getPerson()[getPeople()] = person;
            setPeople(getPeople() + 1);
            //personList[i] = new Person
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < MAX_PEOPLE; i++) {
            System.out.println(person[i].toString());
            result = result + person[i].toString() + "; ";
        }
        return result;

    }
}
//    public static void main(String[] args) {
//        Person[] personList = new Person[3];
//        //pętla tworząca obiekty
//        for(int i=0; i<personList.length; i++ )
//        {
//            personList[i] = new Person();
//        }
//    //pętla ustawiająca obiekty
//        for(int i=0; i<personList.length; i++ ){
//            personList[i].setPayment(0);
//            personList[i].setName("not set yet");
//            personList[i].setLastName("not set yet");
//        }

// for  each dla tablicy
//  public static void printArray(inputArray)
//for(i want my element to keep looping as long as values are free in array)
//     for(element : inputArray){
//  System.out.println( element + " ");
// } System.out.println( );

// pętla wyświetlająca obiekty
//            for(int i=0; i<personList.length; i++)
//            {
//                System.out.println(personList[i].getPayment() + " "+ personList[i].getLastName() + " " + personList[i].getName());
//            }
//
//    }
//        // metoda dodająca pacjenta
//    public void addPerson(Person[]personList, int i){
//        if(i<3)
//            personList[i] = new Person(); //personlist[i] = person ;
//        i++;
//    }
//
//    public static void setAll(Person[] person){
//
//    }

//}
