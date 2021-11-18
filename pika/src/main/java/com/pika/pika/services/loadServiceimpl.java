package com.pika.pika.services;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.pika.pika.enitites.load;
@Service
public class loadServiceimpl implements loadService {
	
	List<load> list;
	public loadServiceimpl() {
		list = new ArrayList<>();
		list.add(new load(1, "No", "chandigarh", "some", "idhar", 2, "udhr", 1, "kyu"));
		list.add(new load(2, "No", "chandiga", "some", "iar", 2, "udhr", 1, "kyu"));
		
	}

	@Override
	public List<load> getload() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public load getload(int Id) {
		load l = null;
		for (load load:list) {
			if (load.getId() == Id) {
				l = load;
				break;
			}
			
		}
		return l;
		
		
	}

	@Override
	public load addload(load load) {
		list.add(load);
		return load;
	}

	

}
