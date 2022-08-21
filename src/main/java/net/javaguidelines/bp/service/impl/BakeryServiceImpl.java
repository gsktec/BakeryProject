package net.javaguidelines.bp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguidelines.bp.entity.Bakeryitem;
import net.javaguidelines.bp.repository.BakeryRepository;
import net.javaguidelines.bp.service.BakeryService;

@Service
public class BakeryServiceImpl implements BakeryService {
	
	private BakeryRepository bakeryRepository;
	
	

	public BakeryServiceImpl(BakeryRepository bakeryRepository) {
		super();
		this.bakeryRepository = bakeryRepository;
	}

	public BakeryRepository getBakeryRepository() {
		return bakeryRepository;
	}

	public void setBakeryRepository(BakeryRepository bakeryRepository) {
		this.bakeryRepository = bakeryRepository;
	}

	@Override
	public List<Bakeryitem> getAllItems() {
		return bakeryRepository.findAll();
	}
	
	

	
	
}
