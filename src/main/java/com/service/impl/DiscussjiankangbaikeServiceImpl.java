package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjiankangbaikeDao;
import com.entity.DiscussjiankangbaikeEntity;
import com.service.DiscussjiankangbaikeService;
import com.entity.vo.DiscussjiankangbaikeVO;
import com.entity.view.DiscussjiankangbaikeView;

@Service("discussjiankangbaikeService")
public class DiscussjiankangbaikeServiceImpl extends ServiceImpl<DiscussjiankangbaikeDao, DiscussjiankangbaikeEntity> implements DiscussjiankangbaikeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiankangbaikeEntity> page = this.selectPage(
                new Query<DiscussjiankangbaikeEntity>(params).getPage(),
                new EntityWrapper<DiscussjiankangbaikeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiankangbaikeEntity> wrapper) {
		  Page<DiscussjiankangbaikeView> page =new Query<DiscussjiankangbaikeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiankangbaikeVO> selectListVO(Wrapper<DiscussjiankangbaikeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiankangbaikeVO selectVO(Wrapper<DiscussjiankangbaikeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiankangbaikeView> selectListView(Wrapper<DiscussjiankangbaikeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiankangbaikeView selectView(Wrapper<DiscussjiankangbaikeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
