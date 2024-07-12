package controller;

import java.util.ArrayList;

import model.UserDAO;
import model.domain.UserDTO;

public class BookController {
	
	// common
	public static ArrayList<UserDTO> getAllUser() {
		return UserDAO.getAllUser();
	}
	
	// 일반 회원
	// 회원 등록
	// 도서 대여
	// 도서 반납
	// 도서 검색
	
	// 관리자 회원
	// 도서 등록
	// 도서 삭제
	// 도서 수정
}
