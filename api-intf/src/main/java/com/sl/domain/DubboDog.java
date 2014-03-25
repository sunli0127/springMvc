package com.sl.domain;

import java.io.Serializable;

/**
 * 类描述。
 * <p/>
 * <br>==========================
 * <br> 公司：优视科技
 * <br> 开发：sunli
 * <br> 版本：1.0
 * <br> 创建时间：2014-3-25
 * <br>==========================
 */
public class DubboDog implements Serializable{

    private static final long serialVersionUID = -4635862426491376515L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
