package cn.edu.zhku.jsj.huangxin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.zhku.jsj.huangxin.bean.Userlist;
import cn.edu.zhku.jsj.huangxin.service.UserService;

@Controller
// @RequestMapping("/user")
public class UserController {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Resource(name = "userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/register")
	public ModelAndView register(@Validated Userlist userlist, BindingResult bindingResult) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError objectError:allErrors){
				System.out.println(objectError.getDefaultMessage());
			}
			modelAndView.addObject("allErrors", allErrors);
			modelAndView.setViewName("register.jsp");
		} else {
			if (userService.findUser(userlist)) {
				modelAndView.setViewName("/WEB-INF/jsp/registerFail.jsp");
			} else {
				userService.saveUser(userlist);
				modelAndView.setViewName("/WEB-INF/jsp/registerSuccess.jsp");
			}
		}
		return modelAndView;
	}
}
