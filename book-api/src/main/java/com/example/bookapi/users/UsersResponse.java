package com.example.bookapi.users;

public record UsersResponse(
    Long id,
    String name,
    String email,
    Integer age
) {
    public static UsersResponse from(AppUser user) {
        return new UsersResponse(
            user.getId(),
            user.getName(),
            user.getEmail(),
            user.getAge()
        );
    }
}
