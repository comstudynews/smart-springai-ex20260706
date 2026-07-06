package com.example.bookapi.users;

import java.util.*;

import org.springframework.stereotype.*;

@Service
public class UsersService {

    private final UserRepository userRepository;

    public UsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Map<String, String> ping() {
        return Map.of("message","UserService - db ok!");
    }

    public List<UsersDTO> findAll() {
        return userRepository.findAll()
            .stream()
            .map(UsersDTO::from)
            .toList();
    }

    // public List<UsersDTO> findAll() {
    //     return List.of(
    //         new UsersDTO(1L, "KIM", "kim@aaa.com", 25),
    //         new UsersDTO(2L, "LEE", "lee@aaa.com", 35),
    //         new UsersDTO(2L, "PARK", "park@aaa.com", 20)
    //     );
    // }
}


/*
1단계: DTO 생성
2단계: DTO를 사용하는 Controller, Service로 수정
3단계: DTO 기반 API 테스트
4단계: Entity 생성
5단계: Repository 연결
6단계: H2 DB 연동 테스트
*/