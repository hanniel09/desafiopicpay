package com.desafiopicpay.services;

import com.desafiopicpay.domain.user.User;
import com.desafiopicpay.domain.user.UserType;
import com.desafiopicpay.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void valideTransaction(User sender, BigDecimal amount) throws Exception {
        if(sender.getUserType() == UserType.MERCHANT){
            throw new Exception("User not authorized to realize the operation: transaction");
        }

        if (sender.getBalance().compareTo(amount) <0 ) {
            throw new Exception("Insufficient funds");
        }
    }

    public User findUserById(Long id) throws Exception {
       return this.repository.findUserById(id).orElseThrow(() -> new Exception("User not found"));
    }

    @Transactional
    public void saveUser(User user){
        this.repository.save(user);
    }
}
