package main.net.spring.model;

import javax.persistence.*;

/**
 * Created by thangnguyen on 3/29/15.
 */
@Entity
@Table(name="USER")
public class User {

    private long id;

    private String username;

    private String password;

    private String email;


    public User() {
    }

    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
