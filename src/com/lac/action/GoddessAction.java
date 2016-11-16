package com.lac.action;


import java.util.List;

import com.lac.dao.goddessDao;
import com.lac.model.Goddess;

public class GoddessAction {
	public static void main(String[] args) throws Exception {
		goddessDao g = new goddessDao();
		
		List<Goddess> gs = g.query();
		for (Goddess goddess : gs) {
			System.out.println(goddess.getUser_name() +"" +goddess.getAge());
			
		}
	}
}
