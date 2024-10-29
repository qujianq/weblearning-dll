package com.example.bookonline.dao.Impl;

import com.example.bookonline.dao.BookDao;
import com.example.bookonline.entity.Book;
import com.example.bookonline.util.JdbcUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BookDaoImpl implements BookDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getDataSource());
    @Override
    public List<Book> selectAll() {
        String sql = "SELECT * FROM t_book ORDER BY id DESC";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Book.class));
    }

    @Override
    public Book getBookById(int id) {
        String sql = "SELECT * FROM t_book WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Book.class),id);
    }
}
