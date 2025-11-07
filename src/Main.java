import First.User;
import First.UserDTO;
import First.UserRole;
import First.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        ### 1.

Följande kod manipulerar en lista på ett visst sätt, men allt görs på ett "vanilla" Java sätt.
Skriv om koden så att den använder streams för allt istället.
Ni kan behöva skapa fler klasser själva för att kunna testa koden.

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
    }
}