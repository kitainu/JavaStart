package Polimorfizm;

public class Zoo {
    public static void main(String[] args) {
//        Animal[] animals = new Animal[3];
//        animals[0] = new Dog("Misiu");
//        animals[1] = new Lew("Mis");
//        animals[2] = new Animal("MisioMis");
//       changeAnimalName ( animals[2],"Pieseł");
//dla każdego elementu tablicy animals typu obiektowego animal
     //   wywołujemy  daj głos
//        for (Animal animal : animals) {
//            animal.giveVoice();
//        }


// gdy robimu jak w dziedziczeniu

        Animal dog = new Dog("Misiu");
        Animal cat = new Cat("Mis");
        Animal doge = new Animal("MisioMis");

        //rzutowanie do zmiennej
        Dog specificDog = (Dog)dog;
        specificDog.bark();


        //rzutowanie w locie
        ((Cat)cat).meow();
//        dog.giveVoice();
//        cat.giveVoice();
//        doge.giveVoice();
    }

//metoda która zmienia imię, przekazuje w parametrach obiekt, i nowy parametr noweImię

  public static void changeAnimalName(Animal animal,String newName){
        animal.setName(newName);
  }

}
