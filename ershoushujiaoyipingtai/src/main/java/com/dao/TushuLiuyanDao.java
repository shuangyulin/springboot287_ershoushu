package com.dao;

import com.entity.TushuLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TushuLiuyanView;

/**
 * 图书留言 Dao 接口
 *
 * @author 
 */
public interface TushuLiuyanDao extends BaseMapper<TushuLiuyanEntity> {

   List<TushuLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
