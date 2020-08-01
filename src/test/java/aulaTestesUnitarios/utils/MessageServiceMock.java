package aulaTestesUnitarios.utils;

import aulaDeTestesUnitarios.MessageServiceInterface;

public class MessageServiceMock implements MessageServiceInterface{
    public int count = 0;
    public String msg = null;

    @Override
    public boolean send(String msg, String rec) {
        count++;
        this.msg = msg;
        return true;
    }

    @Override
    public boolean sync() {
        throw new UnsupportedOperationException();
    }
}
