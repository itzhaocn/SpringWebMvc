package it.zhao.cn.abstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldControllerAbstract extends AbstractController {
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv=new ModelAndView();
		mv.addObject("abstractMessage", "11Ó»Àß11");
		mv.setViewName("abstract");
		return mv;
	}
}
