package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangbaikeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangbaikeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangbaikeView;


/**
 * 健康百科
 *
 * @author 
 * @email 
 * @date 2022-04-30 10:23:01
 */
public interface JiankangbaikeService extends IService<JiankangbaikeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangbaikeVO> selectListVO(Wrapper<JiankangbaikeEntity> wrapper);
   	
   	JiankangbaikeVO selectVO(@Param("ew") Wrapper<JiankangbaikeEntity> wrapper);
   	
   	List<JiankangbaikeView> selectListView(Wrapper<JiankangbaikeEntity> wrapper);
   	
   	JiankangbaikeView selectView(@Param("ew") Wrapper<JiankangbaikeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangbaikeEntity> wrapper);
   	

}

