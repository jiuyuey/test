package util;

public class Page {
    private Integer start = 0;
    private Integer pageSize;
    private long last = 0L;

    public void callbang(long totat){//totat是总条数
        if (totat%pageSize == 0){//总条数除以每页条数，那就是最后一页
            last = totat - pageSize;//最后一页的第一个数据的条数
        }else{
            last = totat - totat%pageSize;//余数不为零，还会有下一页
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

    public Long getLast() {
        return last;
    }

    public void setLast(Long last) {
        this.last = last;
    }
}
