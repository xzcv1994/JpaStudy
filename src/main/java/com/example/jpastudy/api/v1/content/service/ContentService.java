package com.example.jpastudy.api.v1.content.service;

import com.example.jpastudy.api.v1.content.dto.ContentDTO;
import com.example.jpastudy.api.v1.content.entity.Content;
import com.example.jpastudy.api.v1.content.repository.ContentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {
    public ContentRepository contentRepository;

    public ContentService(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public ResponseEntity<Object> getAll() {
        List<Content> list = contentRepository.findAll();
        return new ResponseEntity<Object>(list, HttpStatus.OK);
    }

    public ResponseEntity<Object> getAllByDTO() {
        List<ContentDTO> list = contentRepository.getAllByDTO();
        return new ResponseEntity<Object>(list, HttpStatus.OK);
    }

}
