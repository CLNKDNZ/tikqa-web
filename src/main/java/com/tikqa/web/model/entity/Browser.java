package com.tikqa.web.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Browser extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    @Column(name = "name")
    private String name;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "browser_operating_system",
            joinColumns = @JoinColumn(name = "browser_id"),
            inverseJoinColumns = @JoinColumn(name = "operating_system_id"))
    private Set<OperatingSystem> operatingSystems;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "browser")
    private Set<BrowserVersion> browserVersions;
}
