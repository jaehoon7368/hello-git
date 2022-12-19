package com.sh.git;
/*
 * 되돌리기 (협업할때는 추천하지않음)
 *  -revert : 지정한 커밋의 작업내용을 취소한 버젼을 새로운 커밋으로 만든다.(conflict날수 있음)
 *  
 *  -reset : 지정한 커밋으로 돌아간다.
 *    - hard : 지정한 커밋 이후 변경사항 버림
 *    - mixed : 지정 커밋 이후 변경사항을 unstaging area 보관. 재추가후 커밋 가능
 *    - soft : 지정 커밋 이후 변경사항을 staging area 보관. 즉시 커밋 가능
 */
public class Main {
	
	public void master() {
		System.out.println("master!!!!!");
		System.out.println("origin/master에서 작성함!!!!!");
		System.out.println("origin/master에서 작성함222222222222222!!!!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");

	}
	
	public void feature() {
		System.out.println("maaaaaaaster!!!!!");
		System.out.println("feeeeature!!");
	}
}
