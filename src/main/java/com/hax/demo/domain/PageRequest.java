package com.hax.demo.domain;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * 分页请求参数
 */
public class PageRequest {

    @JSONField(name = "page_index")
    private Integer pageNum;

    @JSONField(name = "page_count")
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
