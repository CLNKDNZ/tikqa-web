package com.tikqa.web.model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString(exclude = {"selectorType", "testCase", "testCaseEvent"})
@EqualsAndHashCode(exclude = {"selectorType", "testCase", "testCaseEvent"})
@Table(name = "test_step")
public class TestStep extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;

    @Column(name = "event_order")
    private Long eventOrder;

    @Column(name = "link_from")
    private Long linkFrom;

    @Column(name = "link_to")
    private Long linkTo;

    @Column(name = "selector_type_value")
    private String selectorTypeValue;

    @Column(name = "event_param_value")
    private String eventParamValue;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "test_case_id")
    private TestCase testCase;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "selector_type_id")
    private SelectorType selectorType;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "event_id")
    private TestCaseEvent testCaseEvent;


}
