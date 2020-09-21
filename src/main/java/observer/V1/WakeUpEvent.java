package observer.V1;

public class WakeUpEvent {
    public long timestamp;
    public String loc;

    public WakeUpEvent(long timestamp, String loc) {
        this.timestamp = timestamp;
        this.loc = loc;
    }
}
