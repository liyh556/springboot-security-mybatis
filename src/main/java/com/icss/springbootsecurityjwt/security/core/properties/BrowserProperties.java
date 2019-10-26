/**
 * 
 */
package com.icss.springbootsecurityjwt.security.core.properties;

/**
 */
public class BrowserProperties {
	
	private String loginPage = "/login";
	private String loginProcessingUrl = "/userLogin";
	
	private LoginType loginType = LoginType.JSON;

	public String getLoginPage() {
		return loginPage;
	}

	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}

	public LoginType getLoginType() {
		return loginType;
	}

	public void setLoginType(LoginType loginType) {
		this.loginType = loginType;
	}

	public String getLoginProcessingUrl() {
		return loginProcessingUrl;
	}

	public void setLoginProcessingUrl(String loginProcessingUrl) {
		this.loginProcessingUrl = loginProcessingUrl;
	}
}
