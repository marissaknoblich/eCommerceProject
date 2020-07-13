package com.tts.eCommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tts.eCommerce.model.Cart;
import com.tts.eCommerce.model.User;
import com.tts.eCommerce.service.CartService;
import com.tts.eCommerce.service.UserService;

@Controller
public class CartController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private CartService cartService;

	public UserService getUserService() {
		return userService;
	}

	public void setCustomerService(UserService customerService) {
		this.userService = customerService;
	}

	public CartService getCartService() {
		return cartService;
	}

	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping("cart/getCartById")
	public String getCartId(Model model){
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String emailId = user.getUsername();
		User user = userService.getUserByemailId(emailId);
		model.addAttribute("cartId", user.getCart().getCartId());
		return "cart";
	}
	
	@RequestMapping("/cart/getCart/{cartId}")
	public @ResponseBody Cart getCartItems(@PathVariable(value="cartId")String cartId){
		return cartService.getCartByCartId(cartId);
	}
	
}