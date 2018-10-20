package com.example.tnademo.web.rest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tnademo.domain.AdsCampaign;
import com.example.tnademo.domain.Creatives;
import com.example.tnademo.domain.Insights;
import com.example.tnademo.domain.Platforms;
import com.example.tnademo.domain.TargetAudiance;
import com.example.tnademo.repository.AdsCampaignRepository;
import com.example.tnademo.repository.CreativesRepository;
import com.example.tnademo.repository.InsightsRepository;
import com.example.tnademo.repository.PlatformRepository;
import com.example.tnademo.repository.TargetAudianceRepository;

@RestController
public class TestInsertController {
	
	@Autowired
	AdsCampaignRepository adsCampaignRepository;
	@Autowired
	PlatformRepository platformRepository;
	@Autowired
	CreativesRepository creativesRepository;
	@Autowired
	InsightsRepository insightsRepository;
	@Autowired
	TargetAudianceRepository targetAudianceRepository;
	
	@GetMapping("/sss")
	public String fdg() {
		
		List<String> languages = Arrays.asList("EN", "VI");
		List<String> genders = Arrays.asList("M", "F");
		List<Integer> ageRange = Arrays.asList( 20, 30);
		List<String> locations = Arrays.asList("Switzerland", "Spain");
		List<String> interests = Arrays.asList("Docker", "DevOps");
		List<String> KeyWords = Arrays.asList("NoOps", "AWS");
		TargetAudiance ta = new TargetAudiance(null,languages, genders, ageRange, locations, interests, KeyWords);
		ta = targetAudianceRepository.save(ta);
		
		String header = "header";
		String header_1 = "header_1";
		String header_2 = null;//"header_2";
		String description = "description";
		String url = "url";
		String image = "image";
		Creatives c = new Creatives(null,header, header_1, header_2, description, url, image);
		c = creativesRepository.save(c);
	    long impressions = 20436;
	    long clicks = 420;
	    long website_visits = 378;
	    float nanos_score = 0.99f;
	    float cost_per_click = 0.99f;
	    float click_through_rate = 0.013f;
	    float advanced_kpi_1 = 3.9f;
	    float advanced_kpi_2 = 3.9f;
	    Insights i = new Insights(null,impressions, clicks, website_visits, nanos_score, cost_per_click, click_through_rate, advanced_kpi_1, advanced_kpi_2);
	    i = insightsRepository.save(i);
	    
	    String status = "status";
	    long totalBudget = 40;
	    long remainingBudget = 12;
	    Long startDate = 1530568800000L;
	    Long endDate = 1532901600000L;
	    TargetAudiance targetAudiance = ta;
	    Creatives creatives = c;
	    Insights insights = i;
//	    Platforms p = new Platforms(1L,"facebook",status, totalBudget, remainingBudget, startDate, endDate, targetAudiance, creatives, insights);
//	    Platforms p1 = new Platforms(1L,"",status, totalBudget, remainingBudget, startDate, endDate, targetAudiance, creatives, insights);
	    Platforms p2 = new Platforms(null,"google",status, totalBudget, remainingBudget, startDate, endDate, ta, c, i);
	
	    p2 = platformRepository.save(p2);
	    
	    Map<String, Platforms> platforms = Collections.unmodifiableMap(Stream.of(
//                new SimpleEntry<>("facebook", p),
//                new SimpleEntry<>("instagram", p1),
                new SimpleEntry<>("google", p2))
                .collect(Collectors.toMap((e) -> e.getKey(), (e) -> e.getValue())));
	
	    long id = 12;
	    String name = "name";
	    String goal = "goal";
	    long totalBudget1 = 120;
	    String status1 = "status";
	    Map<String, Platforms> platforms1 = platforms;
	    AdsCampaign adsC = new AdsCampaign(1001 ,name, goal, totalBudget1, status1, platforms);
		
	    adsCampaignRepository.save(adsC);
		
		return "OK";
	}

}
