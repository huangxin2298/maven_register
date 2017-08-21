package cn.edu.zhku.jsj.huangxin.dao;

import cn.edu.zhku.jsj.huangxin.bean.Userlist;
import cn.edu.zhku.jsj.huangxin.bean.UserlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserlistMapper {
    long countByExample(UserlistExample example);

    int deleteByExample(UserlistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userlist record);

    int insertSelective(Userlist record);

    List<Userlist> selectByExample(UserlistExample example);

    Userlist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userlist record, @Param("example") UserlistExample example);

    int updateByExample(@Param("record") Userlist record, @Param("example") UserlistExample example);

    int updateByPrimaryKeySelective(Userlist record);

    int updateByPrimaryKey(Userlist record);
}