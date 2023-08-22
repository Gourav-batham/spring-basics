package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home",method=RequestMethod.POST)
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "Ankit kumar joshi");
		model.addAttribute("id", 1414);

		List<String> friends = new ArrayList<String>();
		friends.add("abcd");
		friends.add("efgh");
		friends.add("hijk");
		friends.add("zxcv");

		model.addAttribute("f", friends);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}

	@RequestMapping("help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		// creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		// setting the data
		modelAndView.addObject("name", "Uttam Shukla");
		modelAndView.addObject("rollNumber", 45235);
		LocalDateTime localDateTime = LocalDateTime.now();
		modelAndView.addObject("time", localDateTime);
		
		List<Integer>list =new ArrayList<Integer>();
		list.add(11);
		list.add(122);
		list.add(1224);
		list.add(235);
		modelAndView.addObject("marks", list);
		// setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
