package com.example.SimpleDataRest.repository;

import com.example.SimpleDataRest.domain.Member;
import com.example.SimpleDataRest.domain.OnlyName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = OnlyName.class)
public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByName(@Param("name") String name);

//    Page<Member> findByName(@Param("name") String name, Pageable pageable);
}