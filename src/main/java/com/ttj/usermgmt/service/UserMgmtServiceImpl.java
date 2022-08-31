//package com.ttj.usermgmt.service;
//
//import com.ttj.usermgmt.domain.User;
//import com.ttj.usermgmt.repo.mongodb.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserMgmtServiceImpl implements UserMgmtService{
//    @Autowired
//    UserRepository userRepo;
//
//    @Override
//    public void saveUser(User user) {
//        userRepo.save(user);
//    }
//
//    @Override
//    public User findByUserId(String userId) {
//        return userRepo.findByUserId(userId);
//    }
//
//    @Override
//    public void deleteUser(String userId) {
//        User user = userRepo.findByUserId(userId);
//        userRepo.delete(user);
//    }
//
//    @Override
//    public List<User> listAllUsers(){
//        return userRepo.findAll();
//    }
//
//}