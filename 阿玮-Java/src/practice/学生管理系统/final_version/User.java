package practice.学生管理系统.final_version;

public class User {
    private String username;
    private String password;
    private String id;
    private String phoneNumber;

    public User() {
    }

    public User(String username, String password, String id, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}