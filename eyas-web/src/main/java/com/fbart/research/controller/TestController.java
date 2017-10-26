package com.fbart.research.controller;

import com.fbart.research.model.Book;
import com.fbart.research.util.AjaxResultUtil;
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

    /**
     * 获取书籍列表
     * @return
     */
    @RequestMapping("/getBooks")
    @ResponseBody
    public Map<String, Object> getUserOverview(String email, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        Book book1 = new Book("格林童话",1001,"23.12");
        Book book2 = new Book("冰与火之歌", 1002, "100.88");
        Book book3 = new Book("唐诗三百首", 1003, "3.36");
        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Map<String, Object> res = new HashMap<String, Object>();
        res.put("userEmail", email);
        res.put("books", books);
        System.out.println("request email : "+email);
        return AjaxResultUtil.success(res);
    }


}
