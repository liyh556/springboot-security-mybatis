/**
 * 
 */
package com.icss.springbootsecurityjwt.security.validate.code;

import com.icss.springbootsecurityjwt.security.validate.code.image.ImageCode;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * 验证码生成器
 *
 */
public interface ValidateCodeGenerator {

	ValidateCode generate(ServletWebRequest request);
	
}
