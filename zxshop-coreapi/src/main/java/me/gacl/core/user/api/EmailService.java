package me.gacl.core.user.api;

import me.gacl.core.common.dto.BaseEnter;
import me.gacl.core.common.dto.GeneralResult;
import me.gacl.core.user.dto.EmailModel;

public interface EmailService {
	
	
	GeneralResult send(EmailModel model, BaseEnter baseEnter);

}
