package net.javaguidelines.bp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguidelines.bp.service.BakeryService;

@Controller
public class BakeryController {
	
	private BakeryService bakeryService;

	public BakeryController(BakeryService bakeryService) {
		super();
		this.bakeryService = bakeryService;
	}

	//handler list Bakery items
	
	@GetMapping("/bakeryitems")
	public  String listbakerys(Model model){
		model.addAttribute("bakeryitems", bakeryService.getAllItems());
		
		return "bakeryitems";
		}
	}
