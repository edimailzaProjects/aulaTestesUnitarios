package aulaTestesUnitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import aulaDeTestesUnitarios.MyApplication;

public class MyApplicationTest {
	@Test
	public void processMessage_true() {
		MyApplication application = new MyApplication();
		application.setService(new FakeMessageService());
		Assertions.assertTrue(application.processMessage("Hello World!", "ebs@cesar.school"));
	}

}
