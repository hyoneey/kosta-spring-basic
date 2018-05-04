package kosta.test;

import javax.inject.Inject;

public class Controller{
	
	@Inject
	BoardService service;
	
	public void in(){
		service.listBoardService();
	}
	
}
