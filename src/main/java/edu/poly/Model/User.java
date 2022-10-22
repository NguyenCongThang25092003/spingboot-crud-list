package edu.poly.Model;


public class User {
    private String username;
    private String password;
    private String fullname;
    private int age;
    private boolean gender;

    private Major major;
    public User() {
    }

    public User(String username, String password, String fullname, int age, boolean gender, Major major) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.age = age;
        this.gender = gender;
        this.major = major;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", major=" + major.getId() +
                '}';
    }
}
