package cn.edu.zhku.jsj.huangxin.service;

import cn.edu.zhku.jsj.huangxin.bean.Userlist;

public interface UserService {
	public boolean findUser(Userlist userlist) throws Exception;
	public void saveUser(Userlist userlist) throws Exception;
}
