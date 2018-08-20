package Condition;

public class UserManager {
    public static void main(String[] args) {


        User user = new User("Anna", "Zawadzka");

        System.out.println("Choose an option: ");
        System.out.println(" 0 - EXIT");
        System.out.println(" 1 - view information about user");
        System.out.println(" 2 - modify user data ");

        int option = 1;

        if (option == 0) {
            System.out.println("Bye bye!");
        } else if (option == 2) {
            System.out.println("User " + user.getName() + " " + user.getSurname());
        } else if (option == 2) { /*
        NIE WOLNO WYSWIETLAC SET!!!!!!!!!!
            System.out.println("Change the data " + user.setName("Monika") +
                    " " + user.setSurname("Kondra"));
            */
            user.setName("Monika");
            user.setSurname("Kondra");
            System.out.println("New user: " + user.getName() + " " + user.getSurname());
        }
    }
}
