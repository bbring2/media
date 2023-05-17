package com.stayfolio.media.dto;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OEmbedInfo {
    private String version;
    private String type;
    private int width;
    private int height;
    private String title;
    private String url;
    private String author_name;
    private String author_url;
    private String provider_name;
    private String provider_url;
    private String html;
}
