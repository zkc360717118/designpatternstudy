package bridge桥接模式.额外补充.v2;

public class CommonMessage extends AbstractMessage{
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }


}
