package computer.ComputerHero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import computer.ComputerHero.model.Response;

@Controller
public class FamousLabController {

	@RequestMapping("/")
	public ModelAndView index() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		RestTemplate rest = new RestTemplate();
		Response rep = rest.getForObject(url, Response.class);

		return new ModelAndView("home", "tinylist", rep.getTiny());
		
		// List<Tiny> tinyList =apiserv.getTiny(url);
	}
	
	@RequestMapping("/complete")
	public ModelAndView complete() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		RestTemplate rest = new RestTemplate();
		Response rep = rest.getForObject(url, Response.class);
		return new ModelAndView("complete", "completelist",rep.getComplete()) ;
	}
	
}
