package chainOfResponsibility.mashibin版本;

import chainOfResponsibility.mashibin版本.Filter;
import chainOfResponsibility.mashibin版本.entity.Msg;

public class RuleParserFilter implements Filter {
    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace("RP", "RULE PARSER");
        m.setMsg(r);
        return true;
    }
}
