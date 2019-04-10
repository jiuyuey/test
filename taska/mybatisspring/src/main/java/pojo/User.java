package pojo;

import java.util.List;

public class User {
    //此类配置要与数据表配置匹配
    private int id;
    private String name;
    private String password;
    private int createat;
    private int updateat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCreateat() {
        return createat;
    }

    public void setCreateat(int createat) {
        this.createat = createat;
    }

    public int getUpdateat() {
        return updateat;
    }

    public void setUpdateat(int updateat) {
        this.updateat = updateat;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", createat=" + createat +
                ", updateat=" + updateat +
                '}';
    }
}
