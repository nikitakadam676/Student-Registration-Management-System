package org.techhub.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"org.techhub"})
public class DBConfig {
      @Bean
	public DriverManagerDataSource getDataSource () {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/mysql");
		dataSource.setUsername("root");
		dataSource.setPassword("@Monu1234");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dataSource;
	
	}
      @Bean
      public JdbcTemplate jdbcgetTemplate (DriverManagerDataSource ds) {
    	  return new JdbcTemplate(ds);
    	  
      }
	
}
