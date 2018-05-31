package com.gm.controller;

import java.util.regex.Pattern;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gm.model.ChessPlayer;

@Controller
public class HomeController {
	
	
	@RequestMapping(value="/home")
	public ModelAndView getHome(ModelAndView mv){
		System.out.println("1111111111");
		ChessPlayer player=new ChessPlayer();
		mv.addObject("player", player);
		mv.setViewName("home");		
		System.out.println("22222222");
		return mv;		
	}
	@RequestMapping(value = "/createplayer")
	public ModelAndView createPlayer(ModelAndView mv, @ModelAttribute("player") ChessPlayer player){
		
		mv.setViewName("success");	
		mv.addObject("player", player);
		System.out.println("player");
			
		/*if (bindingResult.hasErrors()) {
			mv.addObject("player", player);
			mv.setViewName("success");
		} 
		else {
			redirectAttributes.addFlashAttribute("player", player);
			mv.addObject("player", player);
			mv.setViewName("success");
		}
		System.out.println("2242424");*/
		
		
		return mv;

		
	}

}
