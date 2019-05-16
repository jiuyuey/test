package pojo;

public class Professional {
    private Integer id;

    private String path;

    private String pathhhh;

    private String name;

    private String introduction;

    private Integer threshold;

    private String easy;

    private String growth;

    private String scarce;

    private String ayear;

    private String threeyears;

    private String fiveyears;

    private String leam;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getPathhhh() {
        return pathhhh;
    }

    public void setPathhhh(String pathhhh) {
        this.pathhhh = pathhhh == null ? null : pathhhh.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public String getEasy() {
        return easy;
    }

    public void setEasy(String easy) {
        this.easy = easy == null ? null : easy.trim();
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth == null ? null : growth.trim();
    }

    public String getScarce() {
        return scarce;
    }

    public void setScarce(String scarce) {
        this.scarce = scarce == null ? null : scarce.trim();
    }

    public String getAyear() {
        return ayear;
    }

    public void setAyear(String ayear) {
        this.ayear = ayear == null ? null : ayear.trim();
    }

    public String getThreeyears() {
        return threeyears;
    }

    public void setThreeyears(String threeyears) {
        this.threeyears = threeyears == null ? null : threeyears.trim();
    }

    public String getFiveyears() {
        return fiveyears;
    }

    public void setFiveyears(String fiveyears) {
        this.fiveyears = fiveyears == null ? null : fiveyears.trim();
    }

    public String getLeam() {
        return leam;
    }

    public void setLeam(String leam) {
        this.leam = leam == null ? null : leam.trim();
    }
}