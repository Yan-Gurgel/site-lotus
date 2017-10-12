package br.uece.gesad.sitelotus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("br.uece.gesad.sitelotus")
@SpringBootApplication
public class SiteLotusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiteLotusApplication.class, args);
	}
}
