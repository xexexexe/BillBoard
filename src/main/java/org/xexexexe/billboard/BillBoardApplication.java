package org.xexexexe.billboard;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.xexexexe.billboard.mongo.repo.DTransactionRepository;
import org.xexexexe.billboard.storage.StorageProperties;
import org.xexexexe.billboard.storage.StorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class BillBoardApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(BillBoardApplication.class, args);
    }
	
	@Bean
    CommandLineRunner init(StorageService storageService, DTransactionRepository dtransactionRepository) {
        return (args) -> {
            storageService.deleteAll();
            storageService.init();
        };
		
//		return new CommandLineRunner(){
//			@Override
//			public void run(String... args) throws Exception {
//				storageService.deleteAll();
//				storageService.init();
//			}
//		};
    }

}
