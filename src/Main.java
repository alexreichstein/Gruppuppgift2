import First.User;
import First.UserDTO;
import First.UserRole;
import First.UserService;
import Fourth.AutoCall;
import Fourth.AutoCaller;
import Fourth.TestClass;
import Second.MyArrayList;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
         Skriv en funktion som tar in ett objekt, vilket som helst,
         och anropar alla metoder för objektet som har en `@AutoCall` annotation.
         Ni skall skapa den själva.
         Metoderna med `@AutoCall` kan inte ha några parametrar när ni testar.

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

        // FRÅGA 4

        TestClass test = new TestClass();

        AutoCaller.callMethods(test);


    }
}

