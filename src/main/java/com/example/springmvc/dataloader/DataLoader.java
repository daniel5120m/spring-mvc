package com.example.springmvc.dataloader;

import com.example.springmvc.model.User;
import com.example.springmvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader  implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

             userRepository.save(new User(1, "Daniel", "Mierzejewski"));
             userRepository.save(new User(2, "aa", "aaaa"));
             userRepository.save(new User(3, "bb", "bbbb"));
             userRepository.save(new User(4, "cc", "cccc"));
             userRepository.save(new User(5, "dd", "dddd"));
             userRepository.save(new User(6, "ee", "eeee"));
             userRepository.save(new User(7, "ff", "ffff"));
             userRepository.save(new User(8, "gg", "gggg"));
             
    }
}
