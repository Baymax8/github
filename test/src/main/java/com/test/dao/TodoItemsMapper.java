package com.test.dao;

import com.test.bean.TodoItems;
import com.test.bean.TodoItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TodoItemsMapper {
    long countByExample(TodoItemsExample example);

    int deleteByExample(TodoItemsExample example);

    int deleteByPrimaryKey(Long todoItemId);

    int insert(TodoItems record);

    int insertSelective(TodoItems record);

    List<TodoItems> selectByExample(TodoItemsExample example);

    List<TodoItems> selectByUserId(Long userId);

    TodoItems selectByPrimaryKey(Long todoItemId);

    int updateByExampleSelective(@Param("record") TodoItems record, @Param("example") TodoItemsExample example);

    int updateByExample(@Param("record") TodoItems record, @Param("example") TodoItemsExample example);

    int updateByPrimaryKeySelective(TodoItems record);

    int updateByPrimaryKey(TodoItems record);
}