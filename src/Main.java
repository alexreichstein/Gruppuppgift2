import First.User;
import First.UserDTO;
import First.UserRole;
import First.UserService;
import Second.MyArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
         ### 2.

        Skriv en enkel EGEN ArrayList implementation med följande funktioner:
            - `add` Lägger till element i listan
            - `remove` Tar bort element från listan
            - `get` Hämtar ett element baserat på index
            - `clear` Tömmer hela listan / Raderar alla element

            VIKTIGT: Koden får inte på något sätt innehålla den existerande ArrayList klassen som finns inbyggd i Java.
            Er uppgift är att skapa en egen sådan.


*/
        List<User> users = List.of(
                new User(1, "Robin Palm", "Robin@mail.com", true, UserRole.ADMIN),
                new User(2, "Alex Reichstein", "Alex@mail.com", false, UserRole.ADMIN),
                new User(3, "Julia Frank", "Julia@mail.com", false, UserRole.USER),
                new User(4, "Robin Palm2", "Robin2@mail.com", true, UserRole.ADMIN)
        );

        UserService service = new UserService();
        List<UserDTO> activeAdmins = service.getActiveAdminUsers(users);
        activeAdmins.forEach(System.out::println);

        MyArrayList<String> myArray = new  MyArrayList<>();
        myArray.add("Päron");
        myArray.add("Banan");
        myArray.add("Apelsin");
        myArray.add("GOD FRUKT");

        System.out.println(myArray);
        myArray.remove(0);
        System.out.println(myArray);

        System.out.println(myArray.get(1));

        myArray.clear();
        System.out.println(myArray + "tomt");


    }
}