package com.simpletech.webanalytics.dao;

import com.ipmapping.cnIP.RandomIP;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


/**
 * 数据库表t_visit的dao层测试类
 *
 * @author 树朾
 * @date 2015-09-21 17:03:53 中国标准时间
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-*.xml")
public class ShareInfoDaoTester {

	@Autowired
    ShareInfoDao shareInfoDao;

	@Test
	public void generatePointLogFile()throws Exception{
        shareInfoDao.generatePointLogFile("resources/sharePointLog.txt");
	}

	@Test
	public void generateUserLogFile()throws Exception{
		shareInfoDao.generateUserLogFile("e:\\shareUserLog.txt");
	}

	@Test
	public void generateUserLogHdfsFile()throws Exception{
		shareInfoDao.generateUserHdfsLogFile();
	}

	@Test
	public void generateShareLogHdfsFile()throws Exception{
		shareInfoDao.generatePointHdfsLogFile();
	}
}
