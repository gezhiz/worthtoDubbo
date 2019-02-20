package com.worthto.platform.facade.fina.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by gezz on 2019/2/20.
 */
public class FinanceAccount implements Serializable {
    private String id;
    private String name;
    private String mobile;
    private Date birthday;
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
