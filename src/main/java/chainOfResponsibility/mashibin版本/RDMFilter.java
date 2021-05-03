package chainOfResponsibility.mashibin版本;

import chainOfResponsibility.mashibin版本.entity.Msg;

public class RDMFilter implements Filter {
    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace("rdm", "RDM LOADER");
        m.setMsg(r);
        return true;
    }
}
