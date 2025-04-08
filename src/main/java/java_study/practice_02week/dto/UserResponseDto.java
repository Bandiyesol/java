package java_study.practice_02week.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class UserResponseDto {
    private Long id;
    private String username;
    private String email;
}
