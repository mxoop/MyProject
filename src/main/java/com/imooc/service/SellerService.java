package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * 卖家端
 * Created by Rain on 2020/5/25.
 */
public interface SellerService {
    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
