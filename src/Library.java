public class Library {
    public static void main(String[] args) {
        final String appName = "Bibliotekav0.1";

        Book[] books = new Book[1000];
        books[0] = new Book("W pustyni i puszczy","Henryk Sienkiewicz",2010,296,"Greg","97845612321");
        books[1] = new Book("Java.Efektywne programowanie","Joshua Bloch",2009,
                352,"Helion", "985263147895124");
        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
                "Bert Bates, Katherine Sierra",2008,851,"McGraw-Hill Osborne Media",
                "98520001457777");

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece: ");
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
        System.out.println("System może przechowywać do" + books.length + "książek");
    }
}
