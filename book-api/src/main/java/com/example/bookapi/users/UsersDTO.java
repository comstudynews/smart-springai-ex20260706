package com.example.bookapi.users;

public class UsersDTO {
    private Long id;
    private String name;
    private String email;
    private Integer age;

    public UsersDTO() {
    }

    public UsersDTO(Long id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // Entity를 DTO로 변환 하는 기능.
    public static UsersDTO from(AppUser user) {
        return new UsersDTO(
            user.getId(), 
            user.getName(), 
            user.getEmail(), 
            user.getAge()
        );
    }

    // Codespaces에서 코파일럿 해제(Ctrl + , --> chat.disapble 체크).
    // Java 확장 팩 설치.
    // F5 키 눌러서 새로 고침.
    // Ctrl + . --> setters 및 생성자 자동으로 생성 가능.

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }
}