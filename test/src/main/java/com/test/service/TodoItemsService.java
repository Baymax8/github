package com.test.service;

import com.test.bean.TodoItems;
import com.test.bean.User;
import com.test.dao.TodoItemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by fhd on 2018/7/23.
 */
@Service
public class TodoItemsService {
    @Autowired
    TodoItemsMapper todoItemsMapper;

    public List<TodoItems> getTodoItemmsByUserId(Long uid) {
        return todoItemsMapper.selectByUserId(uid);
    }
}
