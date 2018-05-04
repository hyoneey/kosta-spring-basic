package kosta.di;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WriteService implements Service {
	@Inject
	private Dao dao;
	
	public WriteService(){}
	
	public WriteService(Dao dao) {
		this.dao = dao;
	}

	//데이터 타입에 따라서 원하는 객체를 자동으로 설정하게 하는것 @Autowired
	@Autowired
	//@Qualifier("mySQL")
	public void setDao(Dao dao) {
		this.dao = dao;
	}

	
	@Override
	public void insert() {
		System.out.println("WriteService insert() 호출");
		dao.insertBoard();

	}

}
