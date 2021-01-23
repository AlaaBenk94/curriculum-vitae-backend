package com.cv.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CurriculumVitae {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String description;

    @ElementCollection
    private List<String> nicknames;

}
