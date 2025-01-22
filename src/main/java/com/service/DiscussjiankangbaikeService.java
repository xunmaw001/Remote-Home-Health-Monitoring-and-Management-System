package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiankangbaikeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiankangbaikeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiankangbaikeView;


/**
 * 健康百科评论表
 *
 * @author 
 * @email 
 * @date 2022-04-30 10:23:01
 */
public interface DiscussjiankangbaikeService extends IService<DiscussjiankangbaikeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiankangbaikeVO> selectListVO(Wrapper<DiscussjiankangbaikeEntity> wrapper);
   	
   	DiscussjiankangbaikeVO selectVO(@Param("ew") Wrapper<DiscussjiankangbaikeEntity> wrapper);
   	
   	List<DiscussjiankangbaikeView> selectListView(Wrapper<DiscussjiankangbaikeEntity> wrapper);
   	
   	DiscussjiankangbaikeView selectView(@Param("ew") Wrapper<DiscussjiankangbaikeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiankangbaikeEntity> wrapper);
   	

}

