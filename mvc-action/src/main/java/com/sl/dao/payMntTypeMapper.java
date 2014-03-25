package com.sl.dao;

import com.sl.domain.PayMntType;

import java.util.List;

/**
 * 类描述。
 * <p/>
 * <br>==========================
 * <br> 公司：优视科技
 * <br> 开发：sunli
 * <br> 版本：1.0
 * <br> 创建时间：2013-12-24
 * <br>==========================
 */
public interface payMntTypeMapper {
    List<PayMntType> find(List<String> id);
}
