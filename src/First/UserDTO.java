package First;

public class UserDTO {
    private int id;
    private String username;
    private String email;

    public UserDTO(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "First.UserDTO{" + "id=" + id + ", username=" + username + ", email=" + email + '}';
    }
}
