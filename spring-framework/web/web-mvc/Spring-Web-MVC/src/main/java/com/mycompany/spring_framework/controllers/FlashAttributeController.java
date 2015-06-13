/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycompany.spring_framework.model.Customer;

/**
 * An example demonstrating how to use Flash Attributes in Spring Web MVC
 * 
 * POST/redirect/GET
 * 
 * so that when people don't submit form items twice after initial post.
 * 
 * @author colin
 *
 */
@Controller
public class FlashAttributeController {

	/**
	 * Displays the form
	 * 
	 * @return
	 */
	@RequestMapping(value="/showForm", method=RequestMethod.GET)
	public String showForm(@ModelAttribute("customer") Customer customer) {
		return "flashAttribute-AddCustomer";
	}
	
	/**
	 * When submitting the form
	 * 
	 * @param customer
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value = "/addCustomer", method=RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") Customer customer, 
				final RedirectAttributes redirectAttributes) {
		
		redirectAttributes.addFlashAttribute("customer", customer);
		redirectAttributes.addFlashAttribute("message", "Added successfully.");
		
		return "redirect:showCustomer";
	}
	
	/**
	 * After submitting the form & after a redirect
	 * @return
	 */
	@RequestMapping(value="/showCustomer", method=RequestMethod.GET)
	public String showCustomer (@ModelAttribute("customer") Customer customer) {
		System.out.println("cust:" + customer.getFirstname());
		return "flashAttribute-showCustomer";
	}
}
