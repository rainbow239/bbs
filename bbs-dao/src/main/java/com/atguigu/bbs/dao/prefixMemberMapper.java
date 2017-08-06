package com.atguigu.bbs.dao;

import com.atguigu.bbs.pojo.prefixMember;
import com.atguigu.bbs.pojo.prefixMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface prefixMemberMapper {
    long countByExample(prefixMemberExample example);

    int deleteByExample(prefixMemberExample example);

    int insert(prefixMember record);

    int insertSelective(prefixMember record);

    List<prefixMember> selectByExample(prefixMemberExample example);

    int updateByExampleSelective(@Param("record") prefixMember record, @Param("example") prefixMemberExample example);

    int updateByExample(@Param("record") prefixMember record, @Param("example") prefixMemberExample example);
}