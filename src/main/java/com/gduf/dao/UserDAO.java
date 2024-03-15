package com.gduf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gduf.pojo.user.User;
import com.gduf.pojo.user.UserValue;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDAO extends BaseMapper<User> {

    @Insert("insert into tb_user_basic (username, password) values (#{username}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty = "userId")
//    这里使用了 回显主键的方法 但是一定要记住 keyProperty
    public int insertBasic(User user);

    @Insert("insert into user_value (sign,age,gender,pic) values (#{sign},#{age},#{gender},#{pic})")
    public int insertValue(UserValue userValue);

    @Insert("insert into user_value (user_id,email) values (#{userId},#{email})")
    public int initializationUserValue(Integer userId,String email);

    @Select("select * from tb_user_basic where username = #{username}")
    public User getByUsername(String username);

    @Update("update tb_user_basic set password = #{password} where user_id = #{userId}")
    public void resetPassword(Integer userId ,String password);

    @Update("update user_value set pic = #{pic} where user_id = #{userId}")
    public int updatePic(Integer userId, String pic);

    @Select("select * from user_value where user_id = #{id}")
    public UserValue getValueById(Integer id);

    @Update("update user_value set sign = #{sign},age = #{age},gender = #{gender} where user_id = #{beforeUserId}")
    public int UpdateUserValue(String sign, Integer age, Boolean gender, Integer beforeUserId);

    @Update("update tb_user_basic set password = #{password} where user_id = #{userId}")
    public void updatePassword(String password,Integer userId);

    @Select("select username from tb_user_basic where user_id = #{userId}")
    public String getUsername(Integer userId);

    @Select("select pic from user_value where user_id = #{userId}")
    public String getPic(Integer userId);
}
