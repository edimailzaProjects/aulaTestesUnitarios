package aulaTestesUnitarios;

import static org.mockito.ArgumentMatchers.anyString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import aulaDeTestesUnitarios.Message;
import aulaDeTestesUnitarios.MessageServiceInterface;
import aulaDeTestesUnitarios.MyApplication;

@ExtendWith(MockitoExtension.class)
public class MyApplicationMockitoTest {
	private Message message = new Message();

	@InjectMocks
	MyApplication application;

	@Mock
	MessageServiceInterface service;

	@Test
	public void processMessage_withMsgAndRec_true() {
		Mockito.when(service.send(null, null)).thenReturn(true);
		Assertions.assertTrue(application.processMessage2(message));
	}

	@Test
	public void processMessage_withMsgAndRec_false() {
		Mockito.when(service.send(null, null)).thenReturn(false);
		Assertions.assertFalse(application.processMessage2(message));
	}

}
