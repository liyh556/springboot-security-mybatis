/**
 * 
 */
package com.icss.springbootsecurityjwt.security.validate.code;

import org.springframework.security.core.AuthenticationException;

/**
 * 异常类
 *
 */
public class ValidateCodeException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7285211528095468156L;

	public ValidateCodeException(String msg) {
		super(msg);
	}

}
