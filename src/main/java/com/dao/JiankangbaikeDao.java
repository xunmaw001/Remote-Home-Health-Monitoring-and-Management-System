package com.dao;

import com.entity.JiankangbaikeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangbaikeVO;
import com.entity.view.JiankangbaikeView;


/**
 * 健康百科
 * 
 * @author 
 * @email 
 * @date 2022-04-30 10:23:01
 */
public interface JiankangbaikeDao extends BaseMapper<JiankangbaikeEntity> {
	
	List<JiankangbaikeVO> selectListVO(@Param("ew") Wrapper<JiankangbaikeEntity> wrapper);
	
	JiankangbaikeVO selectVO(@Param("ew") Wrapper<JiankangbaikeEntity> wrapper);
	
	List<JiankangbaikeView> selectListView(@Param("ew") Wrapper<JiankangbaikeEntity> wrapper);

	List<JiankangbaikeView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangbaikeEntity> wrapper);
	
	JiankangbaikeView selectView(@Param("ew") Wrapper<JiankangbaikeEntity> wrapper);
	

}
