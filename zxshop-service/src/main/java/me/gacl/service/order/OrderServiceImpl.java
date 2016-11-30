package me.gacl.service.order;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import me.gacl.core.order.api.OrderService;
import me.gacl.core.order.dto.BuyNowDetailEnter;
import me.gacl.core.order.dto.OrderConfirmResult;
import me.gacl.dao.ProductskuDao;
import me.gacl.entity.Product;
import me.gacl.entity.Productsku;

@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	private ProductskuDao productskuDao;
	
	@Override
	public OrderConfirmResult buyNowDetail(BuyNowDetailEnter detailEnter) {
		
		Productsku productsku = productskuDao.getOne(detailEnter.getSkuid());
		Product product = productsku.getProduct();
		OrderConfirmResult result = new OrderConfirmResult();
		
		result.setName(product.getName());
		result.setNumber(1);
		result.setPid(product.getPid());
		result.setPrice(productsku.getPrice());
		result.setShowimg(product.getShowimg());
		result.setSkuid(productsku.getSkuid());
		result.setAttributevaluesb(productsku.getAttributevaluesb());
		result.setStoreid(1);
		result.setStorename("新新商店");
		return result;
	}

	
}
