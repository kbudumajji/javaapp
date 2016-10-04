package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GetData 
{

	@RequestMapping(value="reg")
	public ModelAndView getData()
	{
		System.out.println("entered into getdata method");
		return new ModelAndView("info","message","hello spring mvc");
	}
}
