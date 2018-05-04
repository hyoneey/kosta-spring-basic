package kosta.test;

import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
	
	public void listBoard(){
		System.out.println("BoardDao의 listBoard() 호출");
	}

}
