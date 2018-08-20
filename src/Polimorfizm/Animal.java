package Polimorfizm;

public class Animal {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Animal(String name){setName(name);}

    public  void giveVoice(/* nic tu nie piszemy bo nie korzystamadnego typu*/){
        System.out.println("Mam na imię " + getName()  );
    }
}

