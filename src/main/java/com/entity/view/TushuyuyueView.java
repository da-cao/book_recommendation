package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.TushuyuyueEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 图书预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-05 14:09:24
 */
@TableName("tushuyuyue")
public class TushuyuyueView  extends TushuyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TushuyuyueView(){
	}
 
 	public TushuyuyueView(TushuyuyueEntity tushuyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, tushuyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
