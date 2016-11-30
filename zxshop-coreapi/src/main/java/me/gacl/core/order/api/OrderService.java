package me.gacl.core.order.api;

import me.gacl.core.order.dto.BuyNowDetailEnter;
import me.gacl.core.order.dto.OrderConfirmResult;

public interface OrderService{
	
	OrderConfirmResult buyNowDetail(BuyNowDetailEnter detailEnter);

}
