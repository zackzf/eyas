package com.fbart.research.web.api;

import com.fbart.research.core.infrastructure.Stu;
import com.fbart.research.core.infrastructure.mapper.StuMapper;
import com.fbart.research.util.AjaxResultUtil;
import com.fbart.research.web.infrastructure.Book;
import com.fbart.research.web.infrastructure.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    private StuMapper stuMapper;
    @Autowired
    private BookMapper bookMapper;

    /**
     * 获取书籍列表
     *
     * @return
     */
    @RequestMapping("/getStu")
    @ResponseBody
    public Map<String, Object> getStu(Integer id) {
        Stu stu = stuMapper.selectById(id);
        System.out.println(stu);
        return AjaxResultUtil.success(stu);
    }

    /**
     * 获取书籍列表
     *
     * @return
     */
    @RequestMapping("/getBook")
    @ResponseBody
    public Map<String, Object> getBook(Integer id) {
        Book book = bookMapper.selectByPrimaryKey(id);

        System.out.println(book);
        return AjaxResultUtil.success(book);
    }

}
