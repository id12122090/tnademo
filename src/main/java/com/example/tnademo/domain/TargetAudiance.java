
package com.example.tnademo.domain;

import java.util.List;

import javax.persistence.ElementCollection;
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
    "languages",
    "genders",
    "age_range",
    "locations",
    "interests",
    "KeyWords"
})
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class TargetAudiance {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonIgnore
    private Long id;

    @JsonProperty("languages")
    @ElementCollection
    public List<String> languages = null;
    @JsonProperty("genders")
    @ElementCollection
    public List<String> genders = null;
    @JsonProperty("age_range")
    @ElementCollection
    public List<Integer> ageRange = null;
    @JsonProperty("locations")
    @ElementCollection
    public List<String> locations = null;
    @JsonProperty("interests")
    @ElementCollection
    public List<String> interests = null;
    @JsonProperty("KeyWords")
    @ElementCollection
    public List<String> keyWords = null;

}
