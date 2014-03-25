package com.sl.service.remote.impl;

import com.sl.domain.DubboDog;
import com.sl.service.remote.DubboTestService;

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
public class DubboTestServiceImpl implements DubboTestService {
    @Override
    public DubboDog queryDog(String name) {
        DubboDog dog1 = new DubboDog();
        dog1.setName("aaa");
        return dog1;
    }
}
