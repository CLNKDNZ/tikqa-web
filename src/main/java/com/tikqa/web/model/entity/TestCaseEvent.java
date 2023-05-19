package com.tikqa.web.model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@ToString(exclude = {"eventParam", "testSteps"})
@EqualsAndHashCode(exclude = {"eventParam", "testSteps"})
@Getter
@Setter
public class TestCaseEvent extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    @Column(name = "type")
    private String type;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "testCaseEvent")
    private List<TestStep> testSteps;
    @OneToMany(cascade = CascadeType.MERGE)
    private Set<EventParam> eventParam;

}
