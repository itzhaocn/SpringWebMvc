package it.zhao.cn;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloZhao implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv =new ModelAndView();
		mv.addObject("message", "aaaaaaaaa");
		mv.setViewName("aaa");
		return mv;
	}
}