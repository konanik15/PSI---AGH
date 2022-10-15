package pl.agh.grupa2.psiocr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
public class PsiOcrApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsiOcrApplication.class, args);
	}

}
