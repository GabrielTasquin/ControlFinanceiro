package br.com.vipautomacao;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.vipautomacao.core.io.Base64ProtocolResolver;
import br.com.vipautomacao.infrastructure.repository.CustomJpaRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomJpaRepositoryImpl.class)
public class ControleFinanceiroApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ControleFinanceiroApplication.class, args);
		
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		
		var app = new SpringApplication(ControleFinanceiroApplication.class);
//		app.addListeners(new Base64ProtocolResolver());
		app.run(args);
	}

}
