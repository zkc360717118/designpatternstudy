package chainOfResponsibility.mashibin版本;


import chainOfResponsibility.mashibin版本.entity.Msg;

public interface Filter {
   boolean doFilter(Msg m);
}
