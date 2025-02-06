package fr.estia.mbds.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

    @Bean
    CommandLineRunner CommandLineRunner(CustomerRepository customerRepository)
    {
        return args -> {
            List<Customer> customersList = List.of(
                    Customer.builder()
                            .fristName("Elodie").lastName("Bantos")
                            .email("elodie.bantos@etu.univ-cotedazur.fr")
                            .build(),
                    Customer.builder()
                            .fristName("Yue").lastName("Guo")
                            .email("yue.guo@etu.univ-cotedazur.fr")
                            .build(),
                    Customer.builder()
                            .fristName("Valeriia").lastName("Lapshina")
                            .email("valeriia.lapshina@etu.univ-cotedazur.fr")
                            .build(),
                    Customer.builder()
                            .fristName("Dounia").lastName("Zoubid")
                            .email("dounia.zoubid@etu.univ-cotedazur.fr")
                            .build()
            );
            customerRepository.saveAll(customersList);


        };
    }
}

