package chainOfResponsibility.mashibin版本;

import chainOfResponsibility.mashibin版本.entity.Msg;

public class EnrichFilter implements Filter {
    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace("ER", "erichment");
        m.setMsg(r);
        return true;
    }
}
