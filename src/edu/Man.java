package edu;

public class Man {

    private String name;
    private int age;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money < 20) {
            System.out.println("Insufficient funds");
        }
        else this.money = money;
    }
}