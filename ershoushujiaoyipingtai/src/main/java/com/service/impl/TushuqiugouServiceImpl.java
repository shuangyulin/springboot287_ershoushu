package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.TushuqiugouDao;
import com.entity.TushuqiugouEntity;
import com.service.TushuqiugouService;
import com.entity.view.TushuqiugouView;

/**
 * 图书求购 服务实现类
 */
@Service("tushuqiugouService")
@Transactional
public class TushuqiugouServiceImpl extends ServiceImpl<TushuqiugouDao, TushuqiugouEntity> implements TushuqiugouService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<TushuqiugouView> page =new Query<TushuqiugouView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
