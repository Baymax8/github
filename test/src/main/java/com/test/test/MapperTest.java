package com.test.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;


import com.test.bean.TodoItems;
import com.test.bean.User;
import com.test.dao.TodoItemsMapper;
import com.test.dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jws.soap.SOAPBinding;


/**
 * 测试dao层的工作
 * @author lfy
 *推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
 *1、导入SpringTest模块
 *2、@ContextConfiguration指定Spring配置文件的位置
 *3、直接autowired要使用的组件即可
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	UserMapper userMapper;
	@Autowired
    TodoItemsMapper todoItemsMapper;
	
	@Autowired
	SqlSession sqlSession;
	
	/**
	 * 测试DepartmentMapper
	 */
	@Test
	public void testCRUD(){
	/*	//1、创建SpringIOC容器
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2、从容器中获取mapper
		DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);*/
//		System.out.println(userMapper);
//        User u1 = new User(1l,"shilei","123","M",22l,"12344",null,null,null);
		//1、插入用户信息
//		userMapper.insertSelective(new User(11l,"shilei","123","M",22l,"1231231321",null,null,null));
//        User a =  userMapper.selectByPrimaryKey(1l);
//        System.out.println(a.getPassword());
        //2、生成员工数据，测试员工插入
//		employeeMapper.insertSelective(new Employee(null, "Jerry", "M", "Jerry@atguigu.com", 1));
		
//		3、批量插入多个用户；批量，使用可以执行批量操作的sqlSession。
//		TodoItemsMapper mapper = sqlSession.getMapper(TodoItemsMapper.class);
//
//        for (int i = 0; i <800 ; i++) {
//            String uid = UUID.randomUUID().toString().substring(0,6);
//            long u = (long) i%8+1;
//            mapper.insertSelective(new TodoItems((long)i+1,u,"待办任务",uid));
//        }
//        System.out.println("批量完成");
//        Date date = new Date();
//        String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
//                .format(date);// 将时间格式转换成符合Timestamp要求的格式.
//        Timestamp newdate = Timestamp.valueOf(nowTime);// 把时间转换
//        User u = new User(1l,"shilei224","M",22l,"12344","222");
//        userMapper.updateByPrimaryKey(u);
//		List<TodoItems> list = todoItemsMapper.selectByUserId(2l);
//		for(TodoItems t:list)
//			System.out.println(t.getTodoItemContent());

	}

}
