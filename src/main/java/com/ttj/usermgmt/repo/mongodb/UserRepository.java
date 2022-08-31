//package com.ttj.usermgmt.repo.mongodb;
//
//
//import com.ttj.usermgmt.domain.User;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
//
//public interface UserRepository extends MongoRepository<User, String> {
//    @Query("{ 'userId' : ?0 }")
//    public User findByUserId(String userId);
//}
