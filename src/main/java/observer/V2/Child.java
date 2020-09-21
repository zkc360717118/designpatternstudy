package observer.V2;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Dog());
        observers.add(new Mom());
        observers.add(event-> System.out.println("test lamda and add one more observer:"+event.loc));

    }


    public boolean isCry() {
        return cry;
    }

    public void wakeup() {
        cry = true;
        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed",this);
        for (Observer o : observers) {
            o.actionOnWakeUp(event);
        }
    }

}

/**
 * 观察1
 */
class Dad implements Observer {
    public void feed(WakeUpEvent event) {
        System.out.println("dad feeding"+" standing along with "+event.loc);
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        feed(event);
    }
}

/*
观察者2
 */
class Dog implements Observer {
    public void feed(WakeUpEvent event) {
        System.out.println("dog barking.."+" runing back and forth "+event.loc);
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        feed(event);
    }
}

/**
 * 观察者3
 *
 */
class Mom implements Observer {
    public void feed(WakeUpEvent event) {
        System.out.println("mama crying.." +" on  the "+event.loc);
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        feed(event);
    }
}


