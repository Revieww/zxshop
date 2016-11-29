package me.gacl.service.product;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import me.gacl.core.common.constants.enums.ResultCodeEnum;
import me.gacl.core.common.dto.DataResult;
import me.gacl.core.common.dto.GeneralResult;
import me.gacl.core.product.api.ProductService;
import me.gacl.core.product.dto.DetailEnter;
import me.gacl.core.product.dto.ProductModel;
import me.gacl.dao.ProductDao;
import me.gacl.dao.ProductskuDao;
import me.gacl.entity.Attribute;
import me.gacl.entity.Attributevalue;
import me.gacl.entity.Product;
import me.gacl.entity.ProductAttribute;
import me.gacl.entity.Productsku;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ProductDao productDao;

	@Autowired
	private ProductskuDao productskuDao;

	@Override
	public GeneralResult detail(DetailEnter detailEnter) {
		Product product = productDao.findOne(detailEnter.getPid());

		ProductModel model = new ProductModel();

		BeanUtils.copyProperties(product, model);

		// sku
		List<Productsku> productskus = product.getProductskus();
		System.out.println("sku======");
		for (Productsku psku : productskus) {
			List<ProductAttribute> attribute = psku.getSaleattributes();
			for (ProductAttribute pabt : attribute) {
				System.out.print(pabt.getAttribute().getName() + "===="
						+ pabt.getAttributevalue().getAttrvalue());
			}
			System.out.println("");

		}

		List<ProductAttribute> saleattributes = product.getSaleattributes();
		System.out.println("销售属性======");
		for (ProductAttribute pabt : saleattributes) {
			System.out.println(pabt.getAttribute().getName() + "===="
					+ pabt.getAttributevalue().getAttrvalue());
		}

		List<ProductAttribute> attributes = product.getAttributes();
		System.out.println("基本属性======");
		for (ProductAttribute pabt : attributes) {
			System.out.println(pabt.getAttribute().getName() + "===="
					+ pabt.getAttributevalue().getAttrvalue());
		}

		

		
		return new DataResult<ProductModel>(ResultCodeEnum.RESULT_SUCCESS,
				model);
	}

	
	private void saveSku(Product product){
		Productsku productsku = new Productsku();
		productsku.setName("T恤");
		productsku.setPrice(20.00);
		productsku.setProduct(product);

		List<ProductAttribute> s = new ArrayList<ProductAttribute>();
		ProductAttribute p = new ProductAttribute();
		Attribute attribute = new Attribute();
		attribute.setAttrid(1);
		p.setAttribute(attribute);
		Attributevalue attributevalue = new Attributevalue();
		attributevalue.setAttrvalueid(1);
		p.setAttributevalue(attributevalue);
		p.setIsSku(true);
		p.setProduct(product);
		p.setProductsku(productsku);

		ProductAttribute p2 = new ProductAttribute();
		Attribute attribute2 = new Attribute();
		attribute2.setAttrid(2);
		p2.setAttribute(attribute2);
		Attributevalue attributevalue2 = new Attributevalue();
		attributevalue2.setAttrvalueid(4);
		p2.setAttributevalue(attributevalue2);
		p2.setIsSku(true);
		p2.setProduct(product);
		p2.setProductsku(productsku);

		s.add(p);
		s.add(p2);
		productsku.setSaleattributes(s);
		
		productskuDao.save(productsku);
	}
}
