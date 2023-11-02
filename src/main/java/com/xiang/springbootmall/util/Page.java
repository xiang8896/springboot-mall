package com.xiang.springbootmall.util;

import java.util.List;

public class Page<T> {

    private Integer fetch;
    private Integer offset;
    private Integer total;
    private List<T> result;

    public Integer getFetch() {
        return fetch;
    }

    public void setFetch(Integer fetch) {
        this.fetch = fetch;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
