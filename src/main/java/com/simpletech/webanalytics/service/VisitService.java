package com.simpletech.webanalytics.service;

import java.util.Date;
import java.util.List;

import com.simpletech.webanalytics.model.Visit;
import com.simpletech.webanalytics.model.entity.IspValue;
import com.simpletech.webanalytics.service.base.BaseService;

/**
 * 数据库表t_visit的Service接口层
 * @author 树朾
 * @date 2015-10-15 12:18:28 中国标准时间
 */
public interface VisitService extends BaseService<Visit> {

	/**
	 * 插入一条新数据
	 * @param model 添加的数据
	 * @return 改变行数
	 */
	int insert(Visit model);
	/**
	 * 根据ID删除
	 * @param id 主键ID
	 */
	int delete(Object id);
	/**
	 * 更新一条数据
	 * @param model 需要更新数据
	 * @return 改变行数
	 */
	int update(Visit model);
	/**
	 * 统计全部出数据
	 * @return 全部数据量
	 */
	int countAll();
	/**
	 * 根据ID获取
	 * @param id 主键ID
	 * @return 数据对象 or null
	 */
	Visit findById(Object id);
	/**
	 * 获取全部数据
	 * @return 全部所有数据
	 */
	List<Visit> findAll();
	/**
	 * 分页查询数据
	 * @param limit 分页最大值
	 * @param start 开始编号
	 * @return 分页列表数据
	 */
	List<Visit> findByPage(int limit, int start);

//	List<Visit> findWhereByPage(String where,int limit, int start);


//	/**
//	 * 更新一条数据
//	 * @param model 需要更新数据
//	 * @return 改变行数
//	 */
//	int updateCompared(Visit model);
	
}
