package com.bl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zhanjian@ultrapower.com.cn
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2018/3/6 15:12
 */
@Entity
@Table(name = "t_bl")
public class BLEntity extends BaseEntity {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
