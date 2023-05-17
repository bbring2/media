package com.stayfolio.media.controller;

import com.stayfolio.media.dto.OEmbedInfo;
import com.stayfolio.media.service.OEmbedService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OEmbedController {

    private final OEmbedService service;

    public OEmbedController(OEmbedService service) {
        this.service = service;
    }

    @GetMapping("/o-embed")
    public ResponseEntity<OEmbedInfo> get(@RequestParam ("url") String url) {
        return ResponseEntity.ok(service.getoEmbedData(url));
    }

}
