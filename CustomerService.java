package com.inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {

	public void analyze(List<String> data) throws ListToLargeException {
		
		if(data.size() > 50) {
			throw new ListToLargeException("List can't exceed 50 items!");
		}
	}
	public static void main(String[] args) throws ListToLargeException {
		CustomerService service = new CustomerService();
		List<String> data = new ArrayList<>(Collections.nCopies(100, "sudhir"));
		
		service.analyze(data);
	}
}
