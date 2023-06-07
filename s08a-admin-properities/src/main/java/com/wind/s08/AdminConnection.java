package com.wind.s08;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements InitializingBean, DisposableBean, EnvironmentAware {

	private Environment env;
	private String adminId;
	private String adminPw;
	
	public Environment getEnv() { return env; }
	public String getAdminId() { return adminId; }
	public String getAdminPw() { return adminPw; }

	public void setEnv(Environment env) { this.env = env; }
	public void setAdminId(String adminId) { this.adminId = adminId; }
	public void setAdminPw(String adminPw) { this.adminPw = adminPw; }

	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("setEnvironment()");
		setEnv(environment);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	}

}
