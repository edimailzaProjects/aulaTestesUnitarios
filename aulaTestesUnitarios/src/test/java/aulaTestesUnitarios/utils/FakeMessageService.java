package aulaTestesUnitarios.utils;

import aulaDeTestesUnitarios.MessageService;

public class FakeMessageService extends MessageService{
	
	@Override
	public boolean send(String msg, String rec) {
		return true;	
	}

}

