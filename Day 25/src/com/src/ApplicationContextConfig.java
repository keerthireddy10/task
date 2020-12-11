package com.src;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextConfig {
	
	@Bean(name="mysql")
	public DataSource getDataSourceMysql()
	{
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/keerthidb";
		String user="root";
		String password="root";
		return new DataSource(driver,url,user,password);
	}
	
}
