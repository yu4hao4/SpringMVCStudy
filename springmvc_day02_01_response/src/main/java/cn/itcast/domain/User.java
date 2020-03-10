package cn.itcast.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 喻浩
 * @create 2019-08-21-20:14
 */
public class User implements Serializable {
    
    private String username;
    private String password;
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
