package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role {
    private Long roleId;

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_Id",nullable = false)
    public Long getRoleId() {
        return roleId;
    }

    private enum roleName {
        ADMIN,
        HOD,
        STUDENT
    }

}

