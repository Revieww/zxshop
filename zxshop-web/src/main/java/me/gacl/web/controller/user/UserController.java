package me.gacl.web.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import me.gacl.core.common.dto.GeneralResult;
import me.gacl.core.user.api.UserService;
import me.gacl.service.MyUserDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private MyUserDetailService myUserDetailService;

	@Autowired
	private AuthenticationManager authenticationManager; // 这样就可以自动注入？oh
															// ，mygod ,how can
													// it do so?
	
	@ResponseBody
	@RequestMapping("update")
	public GeneralResult update() {
		return new GeneralResult(1, "修改成功");
	}
	
	@ResponseBody
	@RequestMapping("unAccess")
	public GeneralResult unAccess(){
		return new GeneralResult(9998, "无权修改");
	}
	
	@ResponseBody
	@RequestMapping("save")
	public GeneralResult save() {
		return new GeneralResult(1, "保存成功");
	}

	@ResponseBody
	@RequestMapping("unlogin")
	public GeneralResult loginTimedOut() {
		return new GeneralResult(9999, "未登陆");
	}
	

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public GeneralResult login(String username, String password,
			HttpServletRequest request) {

		UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
				username, password);

		Authentication authentication = authenticationManager
				.authenticate(authRequest);

		SecurityContextHolder.getContext().setAuthentication(authentication);
		HttpSession session = request.getSession();
		session.setAttribute("SPRING_SECURITY_CONTEXT",
				SecurityContextHolder.getContext()); // 这个非常重要，否则验证后将无法登陆
		 return new GeneralResult(1, "登陆成功");
	}
	
	
}
