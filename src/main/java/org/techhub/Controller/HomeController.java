package org.techhub.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.techhub.Service.RegisterService;
import org.techhub.model.Register;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	@Autowired
	RegisterService regService;
       
	@RequestMapping(value="/",method=RequestMethod.GET)
	
	public String homePage() {
		return "index";
	}
	@GetMapping("/reg")
	public String registerPage() {
		return "Register";
	}
	//@RequestMapping(value="/save",method=RequestMethod.POST)
	@PostMapping("/save")
	public String acceptData (Register register,Map<String,String> map) {
				boolean b=regService.isRegister(register);
				if (b) {
					map.put("msg","registration Sucessfully.....");
				}
				else {
					map.put("msg","registration fail");
				}
		return "welcome";//welcome.jsp
	}
}

