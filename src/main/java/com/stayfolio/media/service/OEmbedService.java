package com.stayfolio.media.service;

import com.stayfolio.media.dto.OEmbedInfo;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OEmbedService {

    private final RestTemplate restTemplate;

    public OEmbedService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public OEmbedInfo getoEmbedData(String url) {
        String oEmbedUrl = "https://www.youtube.com/oembed?url=" + url ;

        ResponseEntity<OEmbedInfo> response = restTemplate.exchange(oEmbedUrl, HttpMethod.GET, null, OEmbedInfo.class);

        return response.getBody();
    }

}
