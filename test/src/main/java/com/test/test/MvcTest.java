package com.test.test;

import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by fhd on 2018/7/23.
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class MvcTest {
    @Autowired
    WebApplicationContext context;
    MockMvc mockMvc;
    @Before
    public  void initMocMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
    @Test
    public void mvcTest() throws Exception{
        //模拟请求并得到结果
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/users").param("pn","1")).andReturn();
        MockHttpServletRequest request = result.getRequest();
        PageInfo attribute = (PageInfo) request.getAttribute("pageInfo");
        System.out.println("当前页码："+attribute.getPageNum());
        System.out.println("当前总页数:"+attribute.getPages());
        System.out.println("总记录数:"+attribute.getTotal());
        System.out.println("连续显示页码：");
        int[] nums = attribute.getNavigatepageNums();
        for (int num:nums){
            System.out.print(num+" ");
        }
    }

}
