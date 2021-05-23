package bridge桥接模式.额外补充.v1;

public class Main {
    public static void main(String[] args) {
        UrgencyMessageSMS urgencyMessageSMS = new UrgencyMessageSMS();
        SpecialUrgentMsgSMS specialUrgentMsgSMS = new SpecialUrgentMsgSMS();
        urgencyMessageSMS.send("通知李月吃饭了");
        specialUrgentMsgSMS.send("通知李月吃饭了");
    }
}
