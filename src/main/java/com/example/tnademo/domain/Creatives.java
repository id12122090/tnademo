package com.example.tnademo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "header",
    "header_1",
    "header_2",
    "description",
    "url",
    "image"
})
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Creatives {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonIgnore
    private Long id;

	@JsonProperty("header")
    public String header;
    @JsonProperty("header_1")
    public String header1;
    @JsonProperty("header_2")
    public String header2;
    @JsonProperty("description")
    public String description;
    @JsonProperty("url")
    public String url;
    @JsonProperty("image")
    public String image;

}
