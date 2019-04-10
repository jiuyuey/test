package pojo;

public class User {
    //此类配置要与数据表配置匹配
    private int id;
    private String name;
    private String password;
    private Long createat;
    private Long updateat;

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


    public Long getCreateat() {
        return createat;
    }

    public void setCreateat(Long createat) {
        this.createat = createat;
    }

    public Long getUpdateat() {
        return updateat;
    }

    public void setUpdateat(Long updateat) {
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
