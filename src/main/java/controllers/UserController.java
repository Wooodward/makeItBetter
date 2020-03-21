package controllers;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.*;
import repos.UserRepo;


@RestController
@EnableMongoRepositories(basePackages = {"repos"})
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping("/")
    String home() {
        return "It's the root page";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User create(@RequestBody User user) {
        return userRepo.save(user);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userId}")
    public User get(@PathVariable String userId) {
        return userRepo.findById(userId).get();
    }
}
