package vw.nama.web.MVCdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/webcntrl")
@Controller   //@RestController = @Controller + @ResponseBody
public class GreetController {
	
	
	@GetMapping("/greet")
	public String greetAll()
	{
		return "greetall"; //assume this is a view name
	}
	
	@ResponseBody
	@GetMapping("/greet1")
	public String greetAll1()
	{
		return "this is a string retured as is - greetall1";
	 //with responsebody anno it will return as is in response body
	//it will not try resolve it as view name
	}
	
	@GetMapping("/greet/{msg}")
	public String greetAll(@PathVariable String msg,ModelMap map)
	{
		map.addAttribute("greetmsg", msg);
		return "greet"; //assume this is a view name
	}
	
}
