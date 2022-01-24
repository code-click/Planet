package com.groupware.planet.cobti.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "cobti_answer_type")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CobtiAnswerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 500, nullable = false)
    private String answer;

    @Column(length = 2, nullable = false)
    private String type;
}
