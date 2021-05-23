package bridge桥接模式.额外补充.v2;

public interface MessageImplementor {
    /**
     * 发送消息
     * @param message 要发送消息的内容
     * @param toUser  消息的接受者
     */
     void send(String message, String toUser);
}
