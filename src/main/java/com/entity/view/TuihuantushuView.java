package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.TuihuantushuEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 退换图书
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-05 14:09:24
 */
@TableName("tuihuantushu")
public class TuihuantushuView  extends TuihuantushuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuihuantushuView(){
	}
 
 	public TuihuantushuView(TuihuantushuEntity tuihuantushuEntity){
 	try {
			BeanUtils.copyProperties(this, tuihuantushuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
