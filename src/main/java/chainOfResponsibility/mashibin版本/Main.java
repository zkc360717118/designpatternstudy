package chainOfResponsibility.mashibin版本;


import chainOfResponsibility.mashibin版本.entity.Msg;

public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("i am going to do ER, RP,rdm");

        FilterChain fc = new FilterChain();
        fc.add(new EnrichFilter())
                .add(new RuleParserFilter())
                .add(new RDMFilter());
        boolean b = fc.doFilter(msg);

        System.out.println(msg);

    }
}
