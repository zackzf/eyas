package com.fbart.research.web.infrastructure.mapper;

import com.fbart.research.web.infrastructure.Book;

public interface BookMapper {
    Book selectByPrimaryKey(Integer id);
}
