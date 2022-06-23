package web.model;

public class User {
    String name;
    int age;
    String car;
    boolean family;

    public User(){}

    public User(String name, int age, String car, boolean family) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.family = family;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCar() {
        return this.car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public boolean isFamily() {
        return this.family;
    }

    public void setFamily(boolean family) {
        this.family = family;
    }


}
