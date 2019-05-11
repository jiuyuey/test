package pojo;

public class Studio {
    private Integer id;

    private String name;

    private String state;

    private String createat;

    private String edit;

    private String richtext;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCreateat() {
        return createat;
    }

    public void setCreateat(String createat) {
        this.createat = createat == null ? null : createat.trim();
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit == null ? null : edit.trim();
    }

    public String getRichtext() {
        return richtext;
    }

    public void setRichtext(String richtext) {
        this.richtext = richtext == null ? null : richtext.trim();
    }
}