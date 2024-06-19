package me.dio.lab.api_rest_railway.service.impl;

import me.dio.lab.api_rest_railway.domain.model.User;
import me.dio.lab.api_rest_railway.domain.repository.UserRepository;
import me.dio.lab.api_rest_railway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> listAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if(userRepository.existsByAccountNumber(user.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account number already existis.");
        }
        return userRepository.save(user);
    }

    @Override
    public User updateOne(Long id, User userToUpdate) {
        var userDb = this.findById(id);

        userDb.setName(userToUpdate.getName());
        userDb.setAccount(userToUpdate.getAccount());
        userDb.setCard(userToUpdate.getCard());
        userDb.setFeatures(userToUpdate.getFeatures());
        userDb.setNews(userToUpdate.getNews());

        return userRepository.save(userDb);
    }

    @Override
    public void deleteOne(Long id) {
        var userToDelete = this.findById(id);
        userRepository.delete(userToDelete);
    }
}
