package com.fbart.research.web.api;

import com.fbart.research.core.infrastructure.Stu;
import com.fbart.research.core.infrastructure.mapper.StuMapper;
import com.fbart.research.util.AjaxResultUtil;
import com.fbart.research.web.infrastructure.Book;
import com.fbart.research.web.infrastructure.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
@RequestMapping("/api/test")
public class TestController {
    /**
     * 刷新
     * @return
     */
    @RequestMapping("/refresh")
    @ResponseBody
    public Map<String, Object> refresh(HttpServletRequest request) {
        XmlWebApplicationContext xmlWebApplicationContext = (XmlWebApplicationContext) WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
        xmlWebApplicationContext.refresh();

//        BeanDefinitionRegistry reg = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(reg);
//        reader.loadBeanDefinitions(new ClassPathResource("eyas-web-service.xml"));
        return AjaxResultUtil.success("刷新完成");
    }



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
