package com.xqy.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xqy.common.utils.PageUtils;
import com.xqy.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author xieqianyu
 * @email 119596909@qq.com
 * @date 2022-12-06 11:01:33
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

