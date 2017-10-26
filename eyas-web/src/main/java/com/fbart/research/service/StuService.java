package com.fbart.research.service;

import com.fbart.research.dao.StuDao;
import org.springframework.stereotype.Service;

/**
 * Created by wangzhengfa on 2017/7/24.
 */
public interface StuService {
    void showStu(Integer id);
    void setStuDao(StuDao stuDao);
}
