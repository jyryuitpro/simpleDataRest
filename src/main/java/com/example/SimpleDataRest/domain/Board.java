package com.example.SimpleDataRest.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "board")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class Board {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "writer_id")
    private Member writer;

    public Board(String title, String content, Member writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public static Board join(String title, String content, Member writer) {
        return new Board(title, content, writer);
    }
}
