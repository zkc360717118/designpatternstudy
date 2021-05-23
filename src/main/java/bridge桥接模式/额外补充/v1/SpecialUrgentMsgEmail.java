package bridge桥接模式.额外补充.v1;

public class SpecialUrgentMsgEmail implements SpecialUrgencyMsg{
    @Override
    public void send(String msg) {
        specialPush(msg);

        //发送消息
        System.out.println("发送消息--》邮件");
    }

    //特急消息，需要更换到特殊队列发送消息
    @Override
    public void specialPush(String messageId) {
        System.out.println("指定当前消息到特殊队列");
    }
}
