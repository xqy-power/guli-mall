package com.xqy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xqy.common.utils.PageUtils;
import com.xqy.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author xieqianyu
 * @email 119596909@qq.com
 * @date 2022-12-06 10:21:01
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

