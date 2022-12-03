package com.KarlexYan.pojo;

public class Account {
    private String id;
    private String o_name;
    private String o_code;
    private String o_category;
    private String o_entered;
    private String o_username;
    private String o_phone;
    private String is_deleted;


    public Account() {
    }

    public Account(String id, String o_name, String o_code, String o_category, String o_entered, String o_username, String o_phone, String is_deleted) {
        this.id = id;
        this.o_name = o_name;
        this.o_code = o_code;
        this.o_category = o_category;
        this.o_entered = o_entered;
        this.o_username = o_username;
        this.o_phone = o_phone;
        this.is_deleted = is_deleted;
    }

    /**
     * 获取
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return o_name
     */
    public String getO_name() {
        return o_name;
    }

    /**
     * 设置
     *
     * @param o_name
     */
    public void setO_name(String o_name) {
        this.o_name = o_name;
    }

    /**
     * 获取
     *
     * @return o_code
     */
    public String getO_code() {
        return o_code;
    }

    /**
     * 设置
     *
     * @param o_code
     */
    public void setO_code(String o_code) {
        this.o_code = o_code;
    }

    /**
     * 获取
     *
     * @return o_category
     */
    public String getO_category() {
        return o_category;
    }

    /**
     * 设置
     *
     * @param o_category
     */
    public void setO_category(String o_category) {
        this.o_category = o_category;
    }

    /**
     * 获取
     *
     * @return o_entered
     */
    public String getO_entered() {
        return o_entered;
    }

    /**
     * 设置
     *
     * @param o_entered
     */
    public void setO_entered(String o_entered) {
        this.o_entered = o_entered;
    }

    /**
     * 获取
     *
     * @return o_username
     */
    public String getO_username() {
        return o_username;
    }

    /**
     * 设置
     *
     * @param o_username
     */
    public void setO_username(String o_username) {
        this.o_username = o_username;
    }

    /**
     * 获取
     *
     * @return o_phone
     */
    public String getO_phone() {
        return o_phone;
    }

    /**
     * 设置
     *
     * @param o_phone
     */
    public void setO_phone(String o_phone) {
        this.o_phone = o_phone;
    }

    /**
     * 获取
     *
     * @return is_deleted
     */
    public String getIs_deleted() {
        return is_deleted;
    }

    /**
     * 设置
     *
     * @param is_deleted
     */
    public void setIs_deleted(String is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String toString() {
        return "Account{id = " + id + ", o_name = " + o_name + ", o_code = " + o_code + ", o_category = " + o_category + ", o_entered = " + o_entered + ", o_username = " + o_username + ", o_phone = " + o_phone + ", is_deleted = " + is_deleted + "}";
    }


}
