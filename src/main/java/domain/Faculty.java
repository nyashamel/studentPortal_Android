package domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Faculty {
    private String facultyName;
    private String getFacultyHead;
    private Long degreeId;
    private Long facultyId;

    public void setFacultyId(Long facultyId) {this.facultyId = facultyId;}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "faculty_Id",nullable = false)
    public Long getFacultyId() {return facultyId;}
}
