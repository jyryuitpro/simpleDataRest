package com.example.SimpleDataRest.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "member")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

//    @JsonIgnore
    private Integer age;

    @Version
    private Long version;

//    @JsonIgnore
    @Enumerated(EnumType.STRING)
    private Grade grade;

    private Member(String name, Integer age, Grade grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public static Member join(@NonNull String name, @NonNull Integer age) {
        return new Member(name, age, Grade.BRONZE);
    }
}
