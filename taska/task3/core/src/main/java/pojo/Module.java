package pojo;

public class Module {
    private Integer id;

    private String themodule;

    private String parentnode;

    private String url;

    private String creationtime;

    private String founder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThemodule() {
        return themodule;
    }

    public void setThemodule(String themodule) {
        this.themodule = themodule == null ? null : themodule.trim();
    }

    public String getParentnode() {
        return parentnode;
    }

    public void setParentnode(String parentnode) {
        this.parentnode = parentnode == null ? null : parentnode.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime == null ? null : creationtime.trim();
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder == null ? null : founder.trim();
    }
}