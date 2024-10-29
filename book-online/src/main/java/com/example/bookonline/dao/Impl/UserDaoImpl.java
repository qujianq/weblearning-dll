package com.example.bookonline.dao.Impl;

import com.example.bookonline.dao.UserDao;
import com.example.bookonline.entity.User;
import com.example.bookonline.util.JdbcUtil;
import com.example.bookonline.util.Md5Util;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getDataSource());

    @Override
    public int insertUser(User user) {
        String sql = "INSERT INTO t_user(account,password,nickname,avatar) VALUES (?,?,?,?)";
        return jdbcTemplate.update(sql,user.getAccount(), Md5Util.crypt(user.getPassword()),user.getNickname(),user.getAvatar());
    }

    @Override
    public User findUser(User userDto) {
        try {
            String sql = "SELECT * FROM t_user WHERE account = ? AND password = ?";
            return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),userDto.getAccount(),Md5Util.crypt(userDto.getPassword()));

        }catch (DataAccessException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int updataImage(String account,String avatar) {
        try {
            String sql = "UPDATE t_user SET avatar = ? WHERE account = ?";
            return jdbcTemplate.update(sql,avatar,account);
        }catch (DataAccessException e){
            e.printStackTrace();
//            System.out.println("报错了");
            return 0;
        }
    }

    @Override
    public User userInfo(String account) {
        try {
            String sql = "SELECT * FROM t_user WHERE account = ?";
            return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),account);
        }catch (DataAccessException e){
            e.printStackTrace();
//            System.out.println("报错了");
            return new User();
        }
    }


}
