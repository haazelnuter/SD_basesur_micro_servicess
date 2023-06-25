package com.example.radarservice;

import com.example.radarservice.entities.Radar;
import com.example.radarservice.repositories.RadarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class RadarServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RadarServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(RadarRepository radarRepository) {
        return args -> {
            Radar radar = Radar.builder()
                    .name("Test Radar")
                    .maxSpeed(100.0)
                    .longitude(123.456)
                    .latitude(78.910)
                    //.numeroRadar("P00")
                    .build();

            radarRepository.save(radar);
            Radar radar1 = Radar.builder()
                    .name("saad Radar")
                    .maxSpeed(100.3)
                    .longitude(130.456)
                    .latitude(30.910)
                    //.numeroRadar("E56")
                    .build();

            radarRepository.save(radar1);
            Radar radar2 = Radar.builder()
                    .name("oumaima Radar")
                    .maxSpeed(130.9)
                    .longitude(123.456)
                    .latitude(78.910)
                   // .numeroRadar("R12")
                    .build();

            radarRepository.save(radar2);

            System.out.println("All Radars:");
            radarRepository.findAll().forEach(vehicle -> {
                System.out.println(vehicle.toString());
            });
        };
    }


}
