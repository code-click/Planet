package com.groupware.planet.cobti.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "cobti_question")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CobtiQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 500, nullable = false)
    private String content;

}
