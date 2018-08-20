package Polimorfizm;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public void giveVoice(){
       super.giveVoice();
    }
    // rzutowanie typów

    public void meow(){
        System.out.println("Miaau, miauuu");
    }
}
