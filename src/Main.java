import First.User;
import First.UserDTO;
import First.UserRole;
import First.UserService;
import Second.MyArrayList;
import Third.Calculator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
         ### 3.

        Ni får följande klass:

        ```java
            public class Calculator {
            private int number;

        private Calculator(int number) {
        this.number = numbers;
    }

        private int add(int other) {
        return this.number + other;
        }
        }
            ```
        Skapa ett nytt objekt utifrån klassen, skicka in valfritt nummer som argument till constructorn,
        och anropa sedan `add` funktionen, allt genom att använda reflection.
        Koden måste skrivas i en separat klass.
*/

        // FRÅGA 1
        List<User> users = List.of(
                new User(1, "Robin Palm", "Robin@mail.com", true, UserRole.ADMIN),
                new User(2, "Alex Reichstein", "Alex@mail.com", false, UserRole.ADMIN),
                new User(3, "Julia Frank", "Julia@mail.com", false, UserRole.USER),
                new User(4, "Robin Palm2", "Robin2@mail.com", true, UserRole.ADMIN)
        );

        UserService service = new UserService();
        List<UserDTO> activeAdmins = service.getActiveAdminUsers(users);
        activeAdmins.forEach(System.out::println);

        // FRÅGA 2
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



        // FRÅGA 3

        try {
            Class<?> clazz = Class.forName("Third.Calculator");

            Constructor<?> constructor = clazz.getDeclaredConstructor(int.class);
            constructor.setAccessible(true);

            Object newInstance = constructor.newInstance(1);

            Method add = clazz.getDeclaredMethod("add", int.class);
            add.setAccessible(true);

            Object result = add.invoke(newInstance, 5);

            System.out.println("Resultat: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}