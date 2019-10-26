/**
 * 
 */
package com.icss.springbootsecurityjwt.controller;

import com.icss.springbootsecurityjwt.security.validate.code.ValidateCodeProcessor;
import com.icss.springbootsecurityjwt.security.validate.code.image.ImageCode;
import com.icss.springbootsecurityjwt.security.validate.code.ValidateCodeGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * 图形验证码，手机验证码
 *
 */
@RestController
@Slf4j
public class ValidateCodeController {

	@Autowired
	private Map<String, ValidateCodeProcessor> validateCodeProcessors;

	/**
	 * 创建验证码，根据验证码类型不同，调用不同的 {@link ValidateCodeProcessor}接口实现
	 * @param request
	 * @param response
	 * @param type
	 * @throws Exception
	 */
	@GetMapping("/code/{type}")
	public void createCode(HttpServletRequest request, HttpServletResponse response, @PathVariable String type) throws Exception {
		log.info(type+"CodeProcessor");
		log.info(validateCodeProcessors.get(type+"CodeProcessor").toString());
		validateCodeProcessors.get(type+"CodeProcessor").create(new ServletWebRequest(request, response));
	}


}
