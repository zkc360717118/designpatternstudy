package Singleton;

/**
 * lazy loading
 *  1. have to handle multiple-thread situation
 *  2. more code ,not concise
 */
public class LazyLoading {
    private static LazyLoading lazyLoading;

    private LazyLoading() {}

    public static LazyLoading getInstance() {
        synchronized (LazyLoading.class) {
            if (lazyLoading == null) {
                synchronized (LazyLoading.class) {
                    // start: test the error that may happen in multiple Thread situation
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    //end
                    lazyLoading = new LazyLoading();
                }
            }
        }
        return lazyLoading;
    }
}
