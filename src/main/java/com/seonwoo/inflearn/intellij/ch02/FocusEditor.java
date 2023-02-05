package com.seonwoo.inflearn.intellij.ch02;

import java.util.ArrayList;
import java.util.List;

public class FocusEditor {

	public void focus() {
		String s = "안녕하세요. 반갑습니다. IntelliJ IDEA Ultimate 2023 Version";
		System.out.println("s = " + s);

		List<String> members = new ArrayList<>();

		members.add(new Member(1L, "TOP").getCourse());
		members.add(new Member(1L, "TOP").getCourse());
		members.add(new Member(1L, "TOP").getCourse());
		members.add(new Member(1L, "TOP").getCourse());
		members.add(new Member(1L, "TOP").getCourse());
		members.add(new Member(1L, "TOP").getCourse());


	}
}
