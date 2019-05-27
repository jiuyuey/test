package controller.util;

public class Page {
    Integer start = 0;
    Integer pageSize;
    long last = 0L;

    public void callbang(long totat){
        if (totat%pageSize == 0){
            last = totat - pageSize;
        }else{
            last = totat - totat%pageSize;
        }
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public long getLast() {
        return last;
    }

    public void setLast(long last) {
        this.last = last;
    }
}
