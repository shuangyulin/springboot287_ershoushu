package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChatEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户反馈 服务类
 */
public interface ChatService extends IService<ChatEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}