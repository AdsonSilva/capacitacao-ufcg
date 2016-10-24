package br.edu.ufcg.embedded.aula10.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by huawei on 24/10/16.
 */

public class Contact {
    @SerializedName("_id")
    private String id;
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String userId;

    public Contact(String id, String name, String lastName, String phone, String email, String userId) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
