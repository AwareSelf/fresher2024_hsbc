package vw.nama.web.MVCdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

/*
desc:Its simple add web controller that takes two nos from end-user and
display their result of addition on jsp view page of mvc web controller
1)
below example also shows how you can use Optional with @PathVariable with required=false
suitable when you aren't sure that pathvariables are provided or not.(check function add1)

2)
add1 method also shows how you can provide/map multiple urls to same function.(check value
attribute of @GetMapping anno given on top of add1() function

3)
below example also shows how you can provide default values with @RequestParam
(check function add2)
 */
@RequestMapping("addwebcntrl")
@Controller   //@RestController = @Controller + @ResponseBody
public class AdditionController {
	
	
	@GetMapping("name")
	public String getname()
	{
		return "cntrlinfo";
		 //assume this is a view name
	}
	

	
	@GetMapping("add/no1/{no1}/no2/{no2}")
	public String add(@PathVariable int no1,@PathVariable int no2,ModelMap map)
	{
		System.out.println(no1+","+no2);
		int result = no1+no2;
		map.addAttribute("no1",no1);
		map.addAttribute("no2",no2);
		map.addAttribute("result",result);
		return "addnos"; //assume this is a view name
	}

	@GetMapping(value={"add1","add1/no1/{no1}/no2/{no2}"})
	public String add1(@PathVariable(name="no1",required = false) Optional<Integer> n1,
						   @PathVariable(name="no2",required = false) Optional<Integer> n2,
						   ModelMap map)
	{
		int no1 = n1.isPresent()?n1.get():10;
		int no2 = n2.isPresent()?n2.get():20;

		System.out.println(no1+","+no2);
		int result = no1+no2;
		map.addAttribute("no1",no1);
		map.addAttribute("no2",no2);
		map.addAttribute("result",result);
		return "addnos"; //assume this is a view name
	}

	@GetMapping("add2")
	public String add2(@RequestParam(value="no1", defaultValue = "10")int no1,
					   @RequestParam(value="no2", defaultValue = "20") int no2,
					   ModelMap map)
	{
	    System.out.println(no1+","+no2);
		int result = no1+no2;
		map.addAttribute("no1",no1);
		map.addAttribute("no2",no2);
		map.addAttribute("result",result);
		return "addnos"; //assume this is a view name
	}


	
}
