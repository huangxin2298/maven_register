package cn.edu.zhku.jsj.huangxin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.edu.zhku.jsj.huangxin.bean.Userlist;
import cn.edu.zhku.jsj.huangxin.bean.UserlistExample;
import cn.edu.zhku.jsj.huangxin.dao.UserlistMapper;
import cn.edu.zhku.jsj.huangxin.service.UserService;
@Component("userService")
public class UserSerivceImpl implements UserService {
	private UserlistMapper userlistMapper;
	
	public UserlistMapper getUserlistMapper() {
		return userlistMapper;
	}
	@Resource(name="userlistMapper")
	public void setUserlistMapper(UserlistMapper userlistMapper) {
		this.userlistMapper = userlistMapper;
	}

	@Override
	public boolean findUser(Userlist userlist) throws Exception{
		UserlistExample userlistExample = new UserlistExample();
		UserlistExample.Criteria criteria = userlistExample.createCriteria();
		criteria.andUsernameEqualTo(userlist.getUsername());
		return userlistMapper.selectByExample(userlistExample).size()>0;
	}

	@Override
	public void saveUser(Userlist userlist) throws Exception{
		userlistMapper.insert(userlist);
	}

}
