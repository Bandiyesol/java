package java_study.practice_02week.model;

import jakarta.persistence.*;
import java_study.practice_02week.dto.UserRequestDto;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String username;

    private String email;

    private String password;

    public User(UserRequestDto dto) {
        this.username = dto.getUsername();
        this.email = dto.getEmail();
        this.password = dto.getPassword();
    }
}