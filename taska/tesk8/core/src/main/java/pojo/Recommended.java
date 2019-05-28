package pojo;

import java.io.Serializable;

public class Recommended implements Serializable {
    private static final long serialVersionUID = 8557988912741205658L;
    private Integer id;

    private String road;

    private String enterprise;

    private String data;

    private String introduce;

    private String introduceee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road == null ? null : road.trim();
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise == null ? null : enterprise.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getIntroduceee() {
        return introduceee;
    }

    public void setIntroduceee(String introduceee) {
        this.introduceee = introduceee == null ? null : introduceee.trim();
    }
}