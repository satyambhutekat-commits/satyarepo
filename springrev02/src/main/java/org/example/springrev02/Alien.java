package org.example.springrev02;

public class Alien {
    private String aname;
    private int age;

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aname='" + aname + '\'' +
                ", age=" + age +
                '}';
    }
}
