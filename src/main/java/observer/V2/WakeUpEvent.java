package observer.V2;

public class WakeUpEvent {
    public long timestamp;
    public String loc;
    Child source;

    public WakeUpEvent(long timestamp, String loc,Child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source ;
    }
}
