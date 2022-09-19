package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-09-18 20:04:34
 */
@Mapper
public interface
SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
