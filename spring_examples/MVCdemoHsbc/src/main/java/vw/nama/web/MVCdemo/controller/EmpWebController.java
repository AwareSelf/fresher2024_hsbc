package vw.nama.web.MVCdemo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import vw.nama.web.MVCdemo.dao.EmpDao;
import vw.nama.web.MVCdemo.exception.EmployeeNotFoundException;
import vw.nama.web.MVCdemo.model.Employee;

@RequestMapping("empwebcntrl")
@SessionAttributes("employee") 
@Controller
public class EmpWebController {
	Logger logger = LoggerFactory.getLogger(EmpWebController.class);
	
	@Autowired
	EmpDao empdao;
	
	
	
	@GetMapping("/")
	public String getEmpForm(Model model)
	{
		Employee e = new Employee();
		model.addAttribute("employee", e);
		return "empform";
	}
	
	@PostMapping("/empp")
	public String addEmployee( @ModelAttribute("employee") @Valid Employee e,BindingResult bindingResult,ModelMap map)
	{
		if (bindingResult.hasErrors()) {
			logger.info("employee validation failed:Returning back to empform.jsp page");
			return "empform";
		}
		else
		{
		logger.info("postemp:"+e);
			
	    Employee em = this.empdao.saveEmp(e);
	    map.addAttribute("postedemp", em);
	    return "postempdet";
		}
	    
	}
	
	
	
	@GetMapping("/emp/{empid}")
	public String getEmployee(@PathVariable int empid,ModelMap map)
	{
		try
		{
	     Employee e = this.empdao.fetchEmp(empid);
	     map.addAttribute("empid",empid);
	     map.addAttribute("emp",e);
		}
		catch(EmployeeNotFoundException e)
		{
			map.addAttribute("empexception",e.getMessage());
		}
	   
		return "dispemp";
	}
	
	@GetMapping("/emp/annsal/{empid}")
	public String fetchAnnSal(@PathVariable int empid,ModelMap map)
	{
		try
		{
	     Employee e = this.empdao.fetchEmp(empid);
	     double annsal = e.computeAnnSal();
	     map.addAttribute("empid",empid);
	     map.addAttribute("empannsal",annsal);
		}
		catch(EmployeeNotFoundException e)
		{
			map.addAttribute("empexception",
					e.getMessage()+", so annsal of emp can't be computed!");
		}
	   
		return "empannsal";
	}


   
}
