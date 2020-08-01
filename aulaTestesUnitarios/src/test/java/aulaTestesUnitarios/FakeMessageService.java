package aulaTestesUnitarios;

import aulaDeTestesUnitarios.MessageService;

public class FakeMessageService extends MessageService{
	
	@Override
	public boolean send(String msg, String rec) {
		return true;	
	}

}

