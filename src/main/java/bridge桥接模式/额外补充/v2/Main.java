package bridge桥接模式.额外补充.v2;

public class Main {
    public static void main(String[] args) {
        //1. 创建普通消息对象
            //1.1 创建sms消息的实现对象
        MessageSMS messageSMSimpl = new MessageSMS();
           //1.2 sms 消息通过普通方式发出去
        AbstractMessage commonMessage = new CommonMessage(messageSMSimpl);
        commonMessage.sendMessage("我要请假", "samuel");
          //1.3 sms 消息通过加急方式发出去
        AbstractMessage urgencyMessage1 = new UrgencyMessage(messageSMSimpl);
        urgencyMessage1.sendMessage("我要请假", "陆总");

        //2 创建加急消息对象
            //2.1创建email消息的实现对象
        MessageEmail messageEmailImpl = new MessageEmail();
            //2.2 email消息通过加急方式发出去
        AbstractMessage commonMessage1 = new UrgencyMessage(messageEmailImpl);
        commonMessage1.sendMessage("我要产假", "陆总");
    }
}
