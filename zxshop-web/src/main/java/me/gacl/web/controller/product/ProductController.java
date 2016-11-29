package me.gacl.web.controller.product;

import me.gacl.core.common.dto.GeneralResult;
import me.gacl.core.product.api.ProductService;
import me.gacl.core.product.dto.DetailEnter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("detail")
	@ResponseBody
	public GeneralResult detail(DetailEnter detailEnter) {
		return productService.detail(detailEnter);
	}
}
