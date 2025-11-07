package First;

public class User {
    private int id;
    private String username;
    private String email;
    private boolean active;
    private UserRole role;

    public User(int id, String username, String email, boolean active, UserRole role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.active = active;
        this.role = role;
    }

    public int getId() { return id;}
    public String getUsername()  { return username;}
    public String getEmail()  { return email;}
    public boolean isActive()  { return active;}
    public UserRole getRole()  { return role;}

}
