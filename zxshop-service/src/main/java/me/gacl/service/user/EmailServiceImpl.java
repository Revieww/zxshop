package me.gacl.service.user;

import org.springframework.stereotype.Service;

import me.gacl.core.common.dto.BaseEnter;
import me.gacl.core.common.dto.GeneralResult;
import me.gacl.core.user.api.EmailService;
import me.gacl.core.user.dto.EmailModel;

@Service("emailService")
public class EmailServiceImpl implements EmailService{

	
	@Override
	public GeneralResult send(EmailModel model, BaseEnter baseEnter) {
		
		
		
		return null;
	}

}
