/**
 * 
 */
package com.test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author PrudhvidherReddy
 *
 */
@Controller
public class HomeController {
	
	private static final Logger Logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(){
		Logger.info("Inside index controller");
		return "index";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String home(Model model, @ModelAttribute("userName") String userName){
		Logger.info("Inside home controller");
		model.addAttribute("userName",userName);
		return "homePage";
	}
	
	
	
	

}
