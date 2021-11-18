package com.pika.pika.services;

import java.util.List;

import com.pika.pika.enitites.load;

public interface loadService {
	public List<load> getload();
	public load getload(int Id);
	public load addload(load load);

}
