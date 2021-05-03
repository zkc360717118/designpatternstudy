package chainOfResponsibility.mashibin版本;




import chainOfResponsibility.mashibin版本.entity.Msg;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    List<Filter> filters = new ArrayList<>();

    /**
     * 添加一个处理链（Filter），然后返回整个类的引用
     * @param f
     * @return
     */
    public FilterChain add(Filter f) {
         this.filters.add(f);
         return this;
    }

    public boolean doFilter(Msg m) {
        for (Filter filter : filters) {
            filter.doFilter(m);
        }

        return true;
    }

}
