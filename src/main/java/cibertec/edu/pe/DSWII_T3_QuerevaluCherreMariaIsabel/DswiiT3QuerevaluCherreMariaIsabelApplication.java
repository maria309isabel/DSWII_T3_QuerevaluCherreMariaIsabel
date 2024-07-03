package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DswiiT3QuerevaluCherreMariaIsabelApplication {

	public static void main(String[] args) {
		SpringApplication.run(DswiiT3QuerevaluCherreMariaIsabelApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer configGlobalCors(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("https://www.cibertec.edu.pe")
						.allowedMethods("GET", "POST", "PUT")
						.allowedHeaders("*")
						.allowCredentials(true);
			}
		};
	}

}
