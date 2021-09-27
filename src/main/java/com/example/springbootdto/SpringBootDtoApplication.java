package com.example.springbootdto;

import com.example.springbootdto.model.Location;
import com.example.springbootdto.model.User;
import com.example.springbootdto.repository.LocationReository;
import com.example.springbootdto.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDtoApplication implements CommandLineRunner {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDtoApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LocationReository locationReository;

    @Override
    public void run(String... args) throws Exception {
        Location location = new Location();
        location.setPlace("Pune");
        location.setDescription("Pune is great place to live");
        location.setLongitude(40.5);
        location.setLatitude(30.6);
        locationReository.save(location);

        User user = new User();
        user.setFirstName("Hanh");
        user.setLastName("Nguyen");
        user.setEmail("hanh@gmail.com");
        user.setPassword("secret");
        userRepository.save(user);

        User user2 = new User();
        user2.setFirstName("Nam");
        user2.setLastName("Nguyen");
        user2.setEmail("nam@gmail.com");
        user2.setPassword("secret");
        userRepository.save(user2);
    }
}
