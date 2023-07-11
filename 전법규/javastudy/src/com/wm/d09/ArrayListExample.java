package com.wm.d09;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		// ArrayList 컬렉션 생성
		List<Board> list = new ArrayList<>();	// 배열 list에는 Board에 지정된 타입의 객체만 저장  --> Board 클래스의 객체만 생성이 가능하다..??
		
		// 객체 추가
		list.add(new Board("제목1","내용1","글쓴이1"));		
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));		// 배열 list의 0번부터 4번까지 데이터 삽입
		
		// 저장된 총 객체 수 얻기
		int size = list.size();		// --> 5(o) , 4(x)
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		// 특정 인덱스의 객체 가져오기
		Board board = list.get(2);
		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		System.out.println();
		
		// 모든 객체를 하나씩 가져오기
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);		
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		System.out.println();
		
		// 객체 삭제
		list.remove(2);
		list.remove(2);		// 2번 인덱스를 삭제하면 3번 인덱스가 2번 인덱스로 변경되므로 다시 2번 인덱스를 제거할 수 있다
		
		// 향상된 for문 으로 모든 객체를 하나씩 가져오기
		for(Board b : list) {		// list의 각 값들을 b에 가져온다
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		
		
	}	// main
}	// class
