package com.example.SimpleDataRest.domain;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "with-writer", types = {Board.class})
public interface WithWriterProjection {

    String getTitle();

    String getContent();

    Member getWriter();
}
