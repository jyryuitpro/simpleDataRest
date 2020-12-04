package com.example.SimpleDataRest.repository;

import com.example.SimpleDataRest.domain.Board;
import com.example.SimpleDataRest.domain.WithWriterProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = WithWriterProjection.class)
public interface BoardRepository extends JpaRepository<Board, Long> {

}
