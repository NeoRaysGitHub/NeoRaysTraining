package com.neorays.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neorays.model.PolicyHolder;

@Controller
public class HomeController {
	

	@RequestMapping(value = "/home")
	public ModelAndView getHome(ModelAndView mv) {
		System.out.println("getHome");
		mv.addObject("currentDate", new Date());
;
	
		PolicyHolder policyHolder = new PolicyHolder();
		mv.addObject("policyHolder", policyHolder);
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(value = "/createPolicy")
	public ModelAndView createPolicy(ModelAndView mv, @ModelAttribute @Valid PolicyHolder policyHolder,
			BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
		System.out.println("createPolicy");

		
		if (bindingResult.hasErrors()) {
			mv.setViewName("home");
		} else {
			redirectAttributes.addFlashAttribute("policyHolder", policyHolder);
			mv.setViewName("redirect:/createPolicyInfo");
		}
		return mv;

	}
	@RequestMapping(value="/createPolicyInfo")
	public ModelAndView createPolicyInfo(ModelAndView mv,@ModelAttribute("policyHolder") PolicyHolder policyHolder){
		System.out.println("createPolicyInfo");

		mv.setViewName("createPolicySuccess");
		mv.addObject("policyHolder", policyHolder);
		return mv;
	}

}
