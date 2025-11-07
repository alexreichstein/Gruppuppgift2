package First;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    public List<UserDTO> getActiveAdminUsers(List<User> users) {

        return users.stream()
                .filter(User::isActive)
                .filter(user -> user.getRole() == UserRole.ADMIN)
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private UserDTO convertToDTO(User user) {
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail());
    }
}
