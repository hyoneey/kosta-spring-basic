package kosta.test;

import javax.inject.Inject;


import org.springframework.stereotype.Service;

@Service
public class BoardService {
	@Inject
	public BoardDao dao;
	

	public void listBoardService(){
		System.out.println("BoardService의 listBoardService 호출");
		dao.listBoard();
	}
}
