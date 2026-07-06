package com.example.bookapi.users;

import java.util.List;

import org.springframework.web.bind.annotation.*;


import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService  = usersService;
    }

    @GetMapping("/ping")
    public Map<String, String> ping() {
        return usersService.ping();
    }
    
    @GetMapping
    public List<UsersDTO> findAll() {
        return usersService.findAll();
    }

    // @GetMapping
    // public List<Map<String, Object>> findAll() {
    //     return List.of(
    //         Map.of(
    //             "id",1L,
    //             "name", "이자바",
    //             "email", "java@example.com",
    //             "age", 25
    //         ),
    //         Map.of(
    //             "id",2L,
    //             "name", "김지현",
    //             "email", "jihyon@example.com",
    //             "age", 27
    //         )
    //     );
    // }


}
