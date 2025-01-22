package com.entity.view;

import com.entity.JiankangbaikeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康百科
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-30 10:23:01
 */
@TableName("jiankangbaike")
public class JiankangbaikeView  extends JiankangbaikeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangbaikeView(){
	}
 
 	public JiankangbaikeView(JiankangbaikeEntity jiankangbaikeEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangbaikeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
