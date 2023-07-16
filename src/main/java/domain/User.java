package domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "users")
public class User {
    private String username;
    private String password;
    private boolean enabled;
    private String fullName;
    private String email;
    private Boolean locked;
    private Long userId;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_Id",nullable = false)
    public Long getUserId() {
        return userId;
    }
}
