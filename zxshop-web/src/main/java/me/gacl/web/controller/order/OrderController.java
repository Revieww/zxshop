package me.gacl.web.controller.order;

import me.gacl.core.order.api.OrderService;
import me.gacl.core.order.dto.BuyNowDetailEnter;
import me.gacl.core.order.dto.OrderConfirmResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	//立即购买
	//从购物车购买
	
	@RequestMapping("buyNowDetail")
	public String buyNowDetail(BuyNowDetailEnter detailEnter,Model model){
		model.addAttribute("detail", orderService.buyNowDetail(detailEnter));
		return "buyNowDetail";
	}
}
