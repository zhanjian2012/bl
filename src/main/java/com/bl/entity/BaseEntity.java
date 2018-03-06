package com.bl.entity;

import java.io.Serializable;

/**
 * @author zhanjian@ultrapower.com.cn
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2018/3/6 15:53
 */
public class BaseEntity implements Serializable{

    protected int pageNo = 1;

    protected int pageSize = 10;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
