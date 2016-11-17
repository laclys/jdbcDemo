/**
 * @author Zhang
 * @version v1.1
 */
package com.lac.action;


import java.util.Date;
import java.util.List;

import com.lac.dao.goddessDao;
import com.lac.model.Goddess;

public class GoddessAction {
	public static void main(String[] args) throws Exception {
		goddessDao g = new goddessDao();
		/*
		 *测试查询语句
		 * 		List<Goddess> gs = g.query();
				for (Goddess goddess : gs) {
					System.out.println(goddess.getUser_name() +"" +goddess.getAge());
		 */
		Goddess g1 = new Goddess();
		g1.setUser_name("小君");
		g1.setAge(28);
		g1.setSex(1);
		g1.setBirthday(new Date());
		g1.setEmail("12312@126.com");
		g1.setMobile("08046226369");
		g1.setCreate_user("Lac");
		g1.setUpdate_user("lac");
		g1.setIsdel(1);
		g1.setId(4);
//		g.addGoddess(g1);//增加
//		g.updateGoddess(g1);//更新操作
//		g.delGoddess(4);//删除
		Goddess g2 = g.get(5);//通过id得到单个数据
		System.out.println(g2.toString());
		
		
			
		}
	}

