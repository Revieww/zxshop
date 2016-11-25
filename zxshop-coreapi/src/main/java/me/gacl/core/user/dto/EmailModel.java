package me.gacl.core.user.dto;

import java.io.Serializable;

public class EmailModel implements Serializable{

	/**   
	 * @Fields serialVersionUID : TODO   
	 */  
	private static final long serialVersionUID = 1200135114293025582L;
	
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
