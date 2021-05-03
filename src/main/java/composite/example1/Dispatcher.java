package composite.example1;


import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * 服务类 Dispatcher
 * 经过使用重构以后，使用组合模式
 * 1。避免了各种if else
 * 2. 符合开闭原则，对修改关闭，对扩展开放
 * 2.1 如果是新增一种转换，name就是新增转换类就行，不需要修改原来的代码
 */

public class Dispatcher {
    private static Map<String,IConvert> handlers= new HashMap<>();

    static {
        //该处最好从配置文件获取,通过反射创建实例(暂时用Map)
//        config.txt   配置文件
//        001=ToLowerCaseLetterConvert
//        002=ToUpperCaseConvert003=ToReverseConvert
//        004=MacroConvert(ToLowerCaseLetterConvert,ToUpperCaseConvert,ToReverseConvert)
//        005=MacroConvert(ToLowerCaseLetterConvert,ToUpperCaseConvert
        handlers.put("001", new ToLowerCaseLetterConvert());
        handlers.put("001", new ToUpperCaseConvert());
        handlers.put("004", new MacroConvert("001"));
    }

    public String convert(String type, String content) {
        IConvert handler = lookupHandlerBy(type);
        return handler.convert(content);
    }

    private IConvert lookupHandlerBy(String type) {
        return handlers.get(type);
    }

    public static void main(String[] args) {
        //模拟客户端调用
        Dispatcher invoker = new Dispatcher();
        String result = "";
        result = invoker.convert("001", "ABC");
        result = invoker.convert("002", "abc");

        result = invoker.convert("004", "ABC,abc,12345");
        System.out.println(result);
//        result=invoker.convert("005", "ABC,abc");
    }
}

interface IConvert {
    String convert(String content);
}

class ToLowerCaseLetterConvert implements IConvert {

    @Override
    public String convert(String content) {
        return content.toLowerCase();
    }
}

class ToUpperCaseConvert implements IConvert {

    @Override
    public String convert(String content) {
        return content.toUpperCase();
    }
}

//组合方式
interface IMacroConvert extends IConvert {
    void add(IConvert toAdd);

    void remove(IConvert toRemove);

    String convert(String content);
}

class MacroConvert implements IMacroConvert {
    private Vector commandList = new Vector();

    public MacroConvert(String Com) {
        this.commandList = commandList;
    }

    @Override
    public void add(IConvert toAdd) {
        commandList.removeElement(toAdd);
    }

    @Override
    public void remove(IConvert toRemove) {
        commandList.removeElement(toRemove);
    }

    @Override
    public String convert(String content) {
        IConvert nextCommand;
        for (int i = 0; i < commandList.size(); i++) {
            //实现组合转换
            nextCommand = (IConvert) commandList.elementAt(i);
            content = nextCommand.convert(content);

        }
        return content;
    }
}

