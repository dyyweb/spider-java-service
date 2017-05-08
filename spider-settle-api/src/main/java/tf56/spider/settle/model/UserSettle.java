package tf56.spider.settle.model;

import java.io.Serializable;

/**
 * @author: dy
 * @date: 2017.2.24
 */
public class UserSettle implements Serializable {
    private String userName;
    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
