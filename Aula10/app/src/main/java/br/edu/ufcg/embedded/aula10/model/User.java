package br.edu.ufcg.embedded.aula10.model;

import java.io.Serializable;

/**
 * Created by huawei on 24/10/16.
 */

public class User implements Serializable{

    private String id;
    private String email;
    private String password;

    public User(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
