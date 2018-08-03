package com.test.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.bean.User;
import com.test.bean.Msg;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by fhd on 2018/7/23.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    HttpServletRequest request;


    @RequestMapping("/user")
    public String getUser(HttpSession httpSession, Model model) {
        Long uid = Long.parseLong(httpSession.getAttribute("uid").toString());
        User user = userService.getMessage(uid);
        model.addAttribute("user", user);
        return "userMessage";
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Msg checkUser(User user, HttpSession httpSession) {
        String userName = user.getUserName();
        String password = user.getPassword();
        User findUser = userService.findUser(userName);
        if (findUser == null) return Msg.fail().add("va_msg", "用户名不存在");
        else if (!findUser.getPassword().equals(password)) return Msg.fail().add("va_msg", "密码错误");
        else {
            httpSession.setAttribute("uid", findUser.getUserId());
            return Msg.success();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/updateUserMessage", method = RequestMethod.PUT)
    public Msg updateUserMessage(User user, HttpSession httpSession) {
//        Date date = new Date();
//        String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
//                .format(date);// 将时间格式转换成符合Timestamp要求的格式.
//        Timestamp newdate = Timestamp.valueOf(nowTime);// 把时间转换
        user.setUserId(Long.parseLong(httpSession.getAttribute("uid").toString()));
        userService.updateUserMessage(user);
        return Msg.success();

    }
}
