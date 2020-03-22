package user;

import user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.*;
import user.UserRepo;


@RestController
@EnableMongoRepositories(basePackages = {"user"})
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userId}")
    public User getUser(@PathVariable String userId) {
        return userRepo.findById(userId).get();
    }
}
