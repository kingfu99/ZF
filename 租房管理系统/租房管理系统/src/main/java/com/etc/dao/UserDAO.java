package com.etc.dao;

import com.etc.entity.House;
import com.etc.entity.User;
import com.etc.vo.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//这层一般是数据访问层，一般是是用来连接数据库，具体对某个表的增删改查
public interface UserDAO {
        //2、然后第二步就是进入注册界面，考虑注册界面有哪些参数（在设计数据库中就要考虑）
        //本项目中需要的是用户id（一般是用于主键标识）、用户名、用户密码、确认密码、电话
        //地址、真实姓名等，由于这些所需要的参数太多，一般用对象的形式接收
        void reg(User user);

        User login(@Param("name") String name, @Param("password") String password);


}
