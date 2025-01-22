package com.dao;

import com.entity.DiscussjiankangbaikeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiankangbaikeVO;
import com.entity.view.DiscussjiankangbaikeView;


/**
 * 健康百科评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-30 10:23:01
 */
public interface DiscussjiankangbaikeDao extends BaseMapper<DiscussjiankangbaikeEntity> {
	
	List<DiscussjiankangbaikeVO> selectListVO(@Param("ew") Wrapper<DiscussjiankangbaikeEntity> wrapper);
	
	DiscussjiankangbaikeVO selectVO(@Param("ew") Wrapper<DiscussjiankangbaikeEntity> wrapper);
	
	List<DiscussjiankangbaikeView> selectListView(@Param("ew") Wrapper<DiscussjiankangbaikeEntity> wrapper);

	List<DiscussjiankangbaikeView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiankangbaikeEntity> wrapper);
	
	DiscussjiankangbaikeView selectView(@Param("ew") Wrapper<DiscussjiankangbaikeEntity> wrapper);
	

}
