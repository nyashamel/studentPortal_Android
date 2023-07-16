package domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Degree {
    private String degreeName;
    private String degreeLength;
    private Long degreeId;

    public void setDegreeId(Long degreeId) {this.degreeId = degreeId;}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "degree_Id",nullable = false)
    public Long getDegreeId() {return degreeId;}
}
