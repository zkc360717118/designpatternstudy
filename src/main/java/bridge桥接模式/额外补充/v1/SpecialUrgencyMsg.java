package bridge桥接模式.额外补充.v1;


public interface SpecialUrgencyMsg  extends Message {
    // 特急消息 需要更加特殊的催促，需要更换到特殊队列发送消息，减少等待
    void specialPush(String messageId);
}

