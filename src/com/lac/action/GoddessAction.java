package com.lac.action;


import java.util.Date;
import java.util.List;

import com.lac.dao.goddessDao;
import com.lac.model.Goddess;

public class GoddessAction {
	public static void main(String[] args) throws Exception {
		goddessDao g = new goddessDao();
		/*
		 *≤‚ ‘≤È—Ø”Ôæ‰
		 * 		List<Goddess> gs = g.query();
				for (Goddess goddess : gs) {
					System.out.println(goddess.getUser_name() +"" +goddess.getAge());
		 */
		Goddess g1 = new Goddess();
		g1.setUser_name("–°æ˝");
		g1.setAge(24);
		g1.setSex(1);
		g1.setBirthday(new Date());
		g1.setEmail("12312@126.com");
		g1.setMobile("123223");
		g1.setCreate_user("Lac");
		g1.setUpdate_user("lac");
		g1.setIsdel(1);
		
		g.addGoddess(g1);
		
		
			
		}
	}

