package com.example.jpastudy.api.v1.content.repository;

import com.example.jpastudy.api.v1.content.entity.Content;
import com.example.jpastudy.api.v1.content.dto.ContentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentRepository  extends JpaRepository<Content, Integer> {

    @Query(value = "SELECT " +
            "new com.example.jpastudy.api.v1.content.dto.ContentDTO(c.id, c.title, c.contents, c.writer) " +
            "FROM Content c", nativeQuery = false)
    List<ContentDTO> getAllByDTO();
}
