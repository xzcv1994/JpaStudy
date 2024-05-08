package com.example.jpastudy.api.v1.content.controller;

import com.example.jpastudy.api.v1.content.service.ContentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/content")
public class ContentController {

    ContentService contentService;

    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<Object> getAll() {return contentService.getAll();}

    @GetMapping("/getAllByDTO")
    public ResponseEntity<Object> getAllByDTO() {return contentService.getAllByDTO();}

}
