package com.cqgcxy.universityforum.service.impl;

import com.cqgcxy.universityforum.domain.entity.User;
import com.cqgcxy.universityforum.repository.UserRepository;
import com.cqgcxy.universityforum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;



    @Override
        public User userLogin(String email, String password) {
        //
//            User user= userRepository.findUserByUserEmailAndUserPassword(email,password);
//            return user;
        return null;
    }

    @Override
    @Transactional//如需增删改，加上事务管理注解
    public User userRegister(User user) {
//        return userRepository.save(user);
        return null;
    }

    @Override
    public Page<User> findhotuser(Integer page, Integer size) {
//        Pageable pageable= PageRequest.of(page,size, Sort.Direction.DESC,"userFans");
//        return userRepository.findAll(pageable);
        return null;
    }


}