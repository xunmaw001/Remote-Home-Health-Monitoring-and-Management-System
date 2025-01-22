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


import com.dao.JiankangbaikeDao;
import com.entity.JiankangbaikeEntity;
import com.service.JiankangbaikeService;
import com.entity.vo.JiankangbaikeVO;
import com.entity.view.JiankangbaikeView;

@Service("jiankangbaikeService")
public class JiankangbaikeServiceImpl extends ServiceImpl<JiankangbaikeDao, JiankangbaikeEntity> implements JiankangbaikeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangbaikeEntity> page = this.selectPage(
                new Query<JiankangbaikeEntity>(params).getPage(),
                new EntityWrapper<JiankangbaikeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangbaikeEntity> wrapper) {
		  Page<JiankangbaikeView> page =new Query<JiankangbaikeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangbaikeVO> selectListVO(Wrapper<JiankangbaikeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangbaikeVO selectVO(Wrapper<JiankangbaikeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangbaikeView> selectListView(Wrapper<JiankangbaikeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangbaikeView selectView(Wrapper<JiankangbaikeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
