package com.test.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.bean.TodoItems;
import com.test.bean.User;
import com.test.service.TodoItemsService;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by fhd on 2018/7/23.
 */
@Controller
public class TodoItemsController {
    @Autowired
    TodoItemsService todoItemsService;
    @RequestMapping("/todoItems")
    public String getTodoItems(@RequestParam(value="pn",defaultValue = "1")Integer pn, Model model,HttpSession httpSession){
        //分页开始页数 和 每页多少数据
        PageHelper.startPage(pn,6);
        List<TodoItems> users = todoItemsService.getTodoItemmsByUserId(Long.parseLong(httpSession.getAttribute("uid").toString()));
        //获取所需页码信息
        PageInfo page = new PageInfo(users,5);
        model.addAttribute("pageInfo",page);
        return "todoItemsList";
    }


}
