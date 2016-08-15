package com.zc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.zc.dao.countryDao;
import com.zc.pojo.country;
import com.zc.service.countryService;
@Service("countryService")
public class countryServiceImpl implements countryService {
	@Resource
	private countryDao countrydao;
	public List<country> getAllCountry() {
		
		return this.countrydao.selectAll();

	}

}
