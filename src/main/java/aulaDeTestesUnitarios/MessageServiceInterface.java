package aulaDeTestesUnitarios;

public interface MessageServiceInterface {
    boolean send(String msg, String rec);

    boolean sync();
}
