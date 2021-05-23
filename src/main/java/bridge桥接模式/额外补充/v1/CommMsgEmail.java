package bridge桥接模式.额外补充.v1;

public class CommMsgEmail implements Message{
    @Override
    public void send(String msg) {
        System.out.println("send common email message");
    }
}
