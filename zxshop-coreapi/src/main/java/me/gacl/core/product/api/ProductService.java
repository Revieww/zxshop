package me.gacl.core.product.api;

import me.gacl.core.common.dto.GeneralResult;
import me.gacl.core.product.dto.DetailEnter;

public interface ProductService {

	GeneralResult detail(DetailEnter detailEnter);

}
