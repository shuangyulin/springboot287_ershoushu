package com.dao;

import com.entity.TushuqiugouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TushuqiugouView;

/**
 * 图书求购 Dao 接口
 *
 * @author 
 */
public interface TushuqiugouDao extends BaseMapper<TushuqiugouEntity> {

   List<TushuqiugouView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
