/**
 * 
 */
package com.icss.springbootsecurityjwt.security.validate.code.sms;

/**
 *发送短信验证码器
 *
 */
public interface SmsCodeSender {
	
	void send(String mobile, String code);

}
