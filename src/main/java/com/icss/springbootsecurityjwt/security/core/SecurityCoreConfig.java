package com.icss.springbootsecurityjwt.security.core;



import com.icss.springbootsecurityjwt.security.core.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;



/**
 *security 可配置属性配置中心
 *
 */
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {

}
