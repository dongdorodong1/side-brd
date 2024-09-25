package play.board1.common.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import play.board1.common.config.CustomBCryptPasswordEncoder;

import java.time.LocalDateTime;

@Getter@Setter
@AllArgsConstructor
public class MemberDto {
    private Long id;
    private String userId;
    private String username;
    private String password;
    private LocalDateTime joinDate;

    public boolean pwdCheck(String password) {
        return this.password.equals(password);
    }
}
