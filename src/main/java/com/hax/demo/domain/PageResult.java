package com.hax.demo.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.github.pagehelper.Page;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


/**
 * 自改分页插件
 *
 * @author:hax
 * @create:2019-10-17 11:32
 */
@Data
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @JSONField(
            name = "recd_count"
    )
    protected long total;
    @JSONField(
            name = "recd_array"
    )
    //结果集
    protected List<T> list;

    public PageResult() {

    }

    public PageResult(List<T> list) {
        this.list = list;
        if (list instanceof Page) {
            this.total = ((Page) list).getTotal();
        } else {
            this.total = list.size();
        }
    }

    public static <T> PageResult<T> of(List<T> list) {
        return new PageResult<T>(list);
    }


    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageInfoSerializable{" +
                "total=" + total +
                ", list=" + list +
                '}';
    }


}
