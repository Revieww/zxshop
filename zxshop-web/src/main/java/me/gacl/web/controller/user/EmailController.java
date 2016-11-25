package me.gacl.web.controller.user;

import me.gacl.core.common.dto.BaseEnter;
import me.gacl.core.common.dto.GeneralResult;
import me.gacl.core.user.api.EmailService;
import me.gacl.core.user.dto.EmailModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("email")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	public GeneralResult send(EmailModel model,BaseEnter baseEnter){
		return emailService.send(model,baseEnter);
	}
}
