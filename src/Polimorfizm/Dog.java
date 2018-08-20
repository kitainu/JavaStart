package Polimorfizm;

public class Dog extends Animal{
    public Dog(String name){
    super(name); }

    @Override
    public void giveVoice() {
        super.giveVoice();
    }
    //rzutowanie typów

    public void bark(){
        System.out.println("Bauau, bauau");
    }
}
