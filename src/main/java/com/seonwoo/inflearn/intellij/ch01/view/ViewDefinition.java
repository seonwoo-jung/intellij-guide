package com.seonwoo.inflearn.intellij.ch01.view;

public class ViewDefinition {

	public void viewDefinition() {
		EmailSender emailSender = new EmailSender(1L, "seonwoo", "laborlawseon@gmail.com");

		emailSender.send("test@gmail.com");
	}
}
