package com.tikqa.web.model.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TestSetting extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "name")
    private String name;


}
