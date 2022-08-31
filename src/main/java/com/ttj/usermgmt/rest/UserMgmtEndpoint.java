//package com.ttj.usermgmt.rest;
//
//import com.ttj.usermgmt.domain.User;
//import com.ttj.usermgmt.service.UserMgmtService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/users")
//@RefreshScope
//public class UserMgmtEndpoint {
//
//    @Autowired
//    private UserMgmtService userMgmtService;
//
//    @Value("${message}")
//    private String message;
//
//    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
//    public String welcome() {
//        return message;
//    }
//
//    @RequestMapping(value="/{userId}", method = RequestMethod.GET, produces = "application/json")
//    public User findUserById(@PathVariable("userId") String userId) {
//        User user = userMgmtService.findByUserId(userId);
//        return user;
//    }
//
//    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
//    public String createUser(@RequestBody User user) {
//        userMgmtService.saveUser(user);
//        return "UserId: "+user.getId();
//    }
//
//    @RequestMapping(value = "/listAll", method = RequestMethod.GET, produces = "application/json")
//    public List<User> listUsers() {
//        return userMgmtService.listAllUsers();
//    }
//
//}
