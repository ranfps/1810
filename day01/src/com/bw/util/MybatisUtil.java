package com.bw.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {

	private  static   SqlSessionFactory sf;
	
	static {
		try {
		
			InputStream in = Resources.getResourceAsStream("mybatis.xml");
			 sf = new SqlSessionFactoryBuilder().build(in);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession() {
		return sf.openSession(true);
	}
	public static void close(SqlSession ss) {
		ss.close();
	}
	
	public static void main(String[] args) {
		SqlSession session = getSession();
		
		System.out.println(session);
	}
}
