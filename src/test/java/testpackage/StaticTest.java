package testpackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StaticTest {

	@Test
	void name() {
		Calendar calendar = new GregorianCalendar();
		Assertions.assertAll();

	}

	@Test
	void forConditionBrk() {
		for (int i = 0; i < 100; i++) {
			System.out.println("i = " + i);
		}
	}
}
