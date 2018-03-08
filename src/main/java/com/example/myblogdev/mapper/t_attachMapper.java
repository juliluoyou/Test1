package com.example.myblogdev.mapper;

import com.example.myblogdev.entity.t_attach;
import com.example.myblogdev.entity.t_attachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface t_attachMapper {
    int countByExample(t_attachExample example);

    int deleteByExample(t_attachExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(t_attach record);

    int insertSelective(t_attach record);

    List<t_attach> selectByExample(t_attachExample example);

    t_attach selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") t_attach record, @Param("example") t_attachExample example);

    int updateByExample(@Param("record") t_attach record, @Param("example") t_attachExample example);

    int updateByPrimaryKeySelective(t_attach record);

    int updateByPrimaryKey(t_attach record);
}