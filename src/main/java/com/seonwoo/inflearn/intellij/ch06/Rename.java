package com.seonwoo.inflearn.intellij.ch06;

public class Rename {

	public void rename() {
		String legacy = "a";

		for (int i = 0; i < 10; i++) {
			System.out.println("legacy = " + legacy);
		}

		System.out.println("legacy = " + legacy);
	}
}
