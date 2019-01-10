package com.test.service.impl;

import com.test.dao.cosmosdb.TireSizeRepository;
import com.test.model.cosmosdb.TireSize;
import com.test.service.TireSizeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tireSizeService")
@Slf4j
public class TireSizeServiceImpl implements TireSizeService {

	@Autowired
	private TireSizeRepository tireSizeRepository;


	/**
	 * findByTireWidth
	 * @param width
	 * @return tireSize
	 */
	@Override
	public String findByTireWidth(String width) {
		log.info("findByTireWidth:" +width);
		List<TireSize> list = tireSizeRepository.findByWidth(width);
		list.forEach(tireSize ->log.info(tireSize.getTireSize()));
		return list.toString();
	}

}