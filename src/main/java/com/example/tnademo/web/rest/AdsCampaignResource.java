package com.example.tnademo.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tnademo.domain.AdsCampaign;
import com.example.tnademo.repository.AdsCampaignRepository;

@RestController
@RequestMapping("/api/adscampaigns")
public class AdsCampaignResource {

	@Autowired
	AdsCampaignRepository adsCampaignRepository;

	@GetMapping
	public List<AdsCampaign> getList() {
		return adsCampaignRepository.findAll();
	}

}
