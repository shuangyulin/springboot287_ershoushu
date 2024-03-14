package com.dao;

import com.entity.TushuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TushuView;

/**
 * 图书 Dao 接口
 *
 * @author 
 */
public interface TushuDao extends BaseMapper<TushuEntity> {

   List<TushuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
