package kosta.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Factory { //설정파일로서의 역할 -xml불필요
	
	@Bean
	public Dao oracleDao(){
		return new OracleDao();
	}
	
	@Bean
	public Service service(){ //id가 method명
		return new WriteService();
	}
	
}
