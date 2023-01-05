package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MathController extends MultiActionController
{
	
	public ModelAndView MathaddCal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int fn=Integer.parseInt(request.getParameter("fn"));
		int sn=Integer.parseInt(request.getParameter("sn"));
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", fn+sn);
		mav.setViewName("success");
		return mav;
	}
	public ModelAndView MathsubCal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int fn=Integer.parseInt(request.getParameter("fn"));
		int sn=Integer.parseInt(request.getParameter("sn"));
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", fn-sn);
		mav.setViewName("success");
		return mav;
	}

}
