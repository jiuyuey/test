package pojo;

public class Message {
    private Integer id;

    private String title;

    private String nickname;

    private String state;

    private String messagetime;

    private String modifythetime;

    private String editperson;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getMessagetime() {
        return messagetime;
    }

    public void setMessagetime(String messagetime) {
        this.messagetime = messagetime == null ? null : messagetime.trim();
    }

    public String getModifythetime() {
        return modifythetime;
    }

    public void setModifythetime(String modifythetime) {
        this.modifythetime = modifythetime == null ? null : modifythetime.trim();
    }

    public String getEditperson() {
        return editperson;
    }

    public void setEditperson(String editperson) {
        this.editperson = editperson == null ? null : editperson.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}