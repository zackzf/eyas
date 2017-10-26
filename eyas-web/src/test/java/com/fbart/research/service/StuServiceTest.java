package com.fbart.research.service;

import com.fbart.research.dao.StuDao;
import com.fbart.research.domain.StuEntity;
import com.fbart.research.service.impl.StuServiceImpl;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangzhengfa on 2017/7/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml",
        "classpath:applicationContext-mybatis.xml"})
public class StuServiceTest {
    @Autowired
    private StuService stuService;

    @Test
    public void testShowUser(){
        StuEntity stu = new StuEntity();
        stu.setId(10);
        stu.setName("Tom");
        stu.setAge(120);
        StuDao stuDaoMock = EasyMock.createMock(StuDao.class);
        EasyMock.expect(stuDaoMock.getStuById(10)).andReturn(stu);
        EasyMock.replay(stuDaoMock);
        stuService.setStuDao(stuDaoMock);
        stuService.showStu(10);

    }

    public StuService getStuService() {
        return stuService;
    }

    public void setStuService(StuService stuService) {
        this.stuService = stuService;
    }
}
