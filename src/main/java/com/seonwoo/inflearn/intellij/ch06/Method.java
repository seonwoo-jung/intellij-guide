package com.seonwoo.inflearn.intellij.ch06;

public class Method {

	public static void main(String[] args) {
		AdministratorChk("seonwoo");
		printMemberCnt("5명 입니다.");
	}

	private static void printMemberCnt(String x) {
		System.out.println("담당자는 5명 입니다.");
	}

	private static void AdministratorChk(String s) {
		if ("seonwoo".equals(s)) {
			printMemberCnt("담당자가 맞습니다.");
		}
	}

}
