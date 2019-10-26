/**
 * 
 */
package com.icss.springbootsecurityjwt.security.validate.code.sms;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 手机验证码发送器
 *
 */
@Service
@Slf4j
public class SmsCodeSenderImpl implements SmsCodeSender {

	/* (non-Javadoc)
	 * @see com.imooc.security.core.validate.code.sms.SmsCodeSender#send(java.lang.String, java.lang.String)
	 */
	@Override
	public void send(String mobile, String code) {

		log.info("【xxx】短信验证码"+code+"5分钟内有效，请勿泄露!");
	}

}
