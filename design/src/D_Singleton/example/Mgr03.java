package D_Singleton.example;

/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03() {
    }

    public static Mgr03 getInstance()
    {
        if (INSTANCE == null) {
            try
            {
                Thread.sleep(1);// 这里不睡眠一下，短时间大量线程进来，直接return第一次创建好的线程，体现不出我们的测试意图了
                                      // 我们的意图是每个线程进来后都会创建线程，最后都不一样，所以是不可取的，这个方法线程不安全
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->//labda表达式的条件是匿名内部类的重写方法只有一个
                System.out.println(Mgr03.getInstance().hashCode())
            ).start();
        }
    }
}