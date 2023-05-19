package com.tikqa.web.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Entity
@Getter
@Setter
public class OperatingSystem extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "operatingSystems", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Platform> platforms;

    @JsonIgnore
    @ManyToMany(mappedBy = "operatingSystems", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Browser> browsers;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "operatingSystem")
    private Set<OperatingSystemVersion> operatingSystemVersions;

}
