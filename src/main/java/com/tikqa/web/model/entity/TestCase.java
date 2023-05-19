package com.tikqa.web.model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "test_case")
@ToString(exclude = {"testSteps"})
@EqualsAndHashCode(exclude = {"testSteps"})
public class TestCase extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "is_headless")
    private boolean isHeadless;

    @Column(name = "is_grid")
    private boolean isGrid;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "testCase")
    private List<TestStep> testSteps;
}
