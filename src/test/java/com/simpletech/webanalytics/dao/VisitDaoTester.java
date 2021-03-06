package com.simpletech.webanalytics.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simpletech.webanalytics.model.Visit;
import com.simpletech.webanalytics.util.JacksonUtil;

/**
 * 数据库表t_visit的Dao层测试类
 * @author 树朾
 * @date 2015-09-21 17:03:53 中国标准时间
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-*.xml")
public class VisitDaoTester {

	@Autowired
	VisitDao dao;
	
	@Test
	public void insert(){
		Visit model = new Visit();
		Object result = dao.insert(model);
		System.out.println(JacksonUtil.toJson(result));
	}
	
	@Test
	public void update() {
		Visit model = new Visit();
		Object result = dao.update(model);
		System.out.println(JacksonUtil.toJson(result));
	}
	
	@Test
	public void delete() {
		Object result = dao.delete("1");
		System.out.println(JacksonUtil.toJson(result));
	}
	
	@Test
	public void countAll() {
		Object result = dao.countAll();
		System.out.println(JacksonUtil.toJson(result));
	}

	@Test
	public void findByPage() {
		Object result = dao.findByPage(5, 0);
		System.out.println(JacksonUtil.toJson(result));
	}

	@Test
	public void findAll() {
		Object result = dao.findAll();
		System.out.println(JacksonUtil.toJson(result));
	}

}
