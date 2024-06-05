package week7.swingMiniProje.entity;

import java.util.StringJoiner;

public class User {
    private int id;
    private String name;
    private String password;
    private String mail;
    private Type type;
    private Gender gender;

    public enum Type{
        ADMIN,
        WORKER
    }
    public enum Gender{
        FEMALE,
        MALE
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("password='" + password + "'")
                .add("mail='" + mail + "'")
                .add("type=" + type)
                .add("gender=" + gender)
                .toString();
    }
}
