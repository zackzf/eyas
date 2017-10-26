package com.fbart.research.dao;

import com.fbart.research.domain.StuEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by wangzhengfa on 2017/7/24.
 */
@Repository
public interface StuDao {
    public StuEntity getStuById(Integer id);
}
