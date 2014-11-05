package it.zhao.cn.baseCommandController;

import it.zhao.cn.model.UserModel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;



public class MyAbstractCommandController extends AbstractCommandController {
	public MyAbstractCommandController() {
		//设置命令对象实现类
		setCommandClass(UserModel.class);
	}	
	
	@Override
	protected ModelAndView handle(HttpServletRequest req, HttpServletResponse resp, Object command, BindException errors) throws Exception {
		//将命令对象转换为实际类型
		/**
		 * 当请求发过来后，http://localhost:8080/webmvc3/abstractCommand?username=zhao&password=123
		 * 会被command拦截到，然后
		 * command.setUsername="zhao";
		 * command.setPassword="123";
		 * 然后将command对象转化为实际类；
		 * 这整个过程其实是将请求封装进command，然后在将command拿出来转化为实际类型用而已	
		 */
		UserModel user = (UserModel) command;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("abstractCommand");
		mv.addObject("user", user);
		return mv;
	}
}
