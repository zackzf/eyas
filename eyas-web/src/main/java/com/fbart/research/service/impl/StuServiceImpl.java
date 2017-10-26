package com.fbart.research.service.impl;

import com.fbart.research.dao.StuDao;
import com.fbart.research.domain.StuEntity;
import com.fbart.research.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wangzhengfa on 2017/7/24.
 */
@Service
public class StuServiceImpl implements StuService{
    private StuDao stuDao;

    public StuDao getStuDao() {
        return stuDao;
    }

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }

    public void showStu(Integer id) {
        StuEntity stu = stuDao.getStuById(id);
        System.out.println("id:"+stu.getId()+",Name:"+stu.getName()+",Age:"+stu.getAge());
    }
}
