package com.reactor.webflux.service;

import com.reactor.webflux.model.User;
import com.reactor.webflux.repository.UserRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public Mono<Long> count() {
        return userRepository.count();
    }

    public Flux<User> findAll() {
        return userRepository.findAll();
    }

    public Mono<User> addUser(User user) { // 단건 등록
        return userRepository.save(user);
    }

    public Flux<User> addUsers(Flux<User> users) { // 다건 등록
        return userRepository.saveAll(users);
    }

    public Mono<Void> deleteUser(Long id) { // 단건 삭제
        return userRepository.deleteById(id);
    }

    public Mono<Void> deleteAll() { // 다건 삭제
        return userRepository.deleteAll();
    }
}
