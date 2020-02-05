package bookstore.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bookstore.bookstore.domain.kirja;
import bookstore.bookstore.domain.kirjareposity;



@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner kirjaDemo(kirjareposity repository) {
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new kirja("Runokokokelma", "Useita tekijöitä", "2000"));
			repository.save(new kirja("Pakinoita", "Matti Mallikas", "2005"));	
			
			log.info("fetch all books");
			for (kirja kirja : repository.findAll()) {
				log.info(kirja.toString());
			}

		};
	}
}