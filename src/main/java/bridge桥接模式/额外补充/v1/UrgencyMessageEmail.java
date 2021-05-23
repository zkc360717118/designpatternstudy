package bridge桥接模式.额外补充.v1;

/**
 * 紧急消息
 *  1. 要监控
 *  2. 发送消息
 *      2.1 发短信
 *      2.2 发邮件
 */
public class UrgencyMessageEmail implements UrgentMsg{
    @Override
    public void send(String msg) {
        //在原有消息的基础上，加上加急标签
        //发送邮件
        System.out.println( "发送加急消息"+"--> 邮件");
    }

    /**
     * 监控加急的信息，保证对应人员收到消息。 后台必须能有功能去查看加急消息的到达情况，所以这里可能要入数据库
     * @param messageId  被监控的消息编号
     * @return
     */
    @Override
    public Object watch(String messageId) {
        //存入数据库 方便查询
        return null;
    }
}
