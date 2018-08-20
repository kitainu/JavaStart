package Enum;

public class ShirtShop {
    public static void main(String[] args) {
        for(Size s:Size.values())
        System.out.println(s.getDescripion());
//metoda valueOfktóra pozwoli utworzyć obiekt zdefiniowanego typu enum na podstawie Stringa
        Tshirt tshirt = new Tshirt();
        System.out.println("wybierz rozmiar koszulki:");
        tshirt.setSize(Size.valueOf("Medium"));
        System.out.println(tshirt.getSize().getDescripion());
    }
}
