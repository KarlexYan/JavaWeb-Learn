package com.KarlexYan.domain;

public class User {
    private String userName;
    private int age;


    public User() {
    }

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{userName = " + userName + ", age = " + age + "}";
    }
}
