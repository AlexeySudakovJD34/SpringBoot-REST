package ru.netology.springbootrest.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {


    @NotBlank(message = "Username is mandatory!")
    private String user;
    @NotBlank(message = "Password is mandatory!")
    @Size(min=6, max=12)
    private String password;
}
