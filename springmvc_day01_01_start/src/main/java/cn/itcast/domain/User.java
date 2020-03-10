package cn.itcast.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 喻浩
 * @create 2019-08-21-20:14
 */
public class User implements Serializable {
    
    private String uname;
    private Integer age;
    private Date date;

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
