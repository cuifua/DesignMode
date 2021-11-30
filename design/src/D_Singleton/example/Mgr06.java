package D_Singleton.example;

/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可以通过synchronized解决，但也带来效率下降
 */
public class Mgr06 {
    private static volatile Mgr06 INSTANCE; //JIT

    private Mgr06() {
    }

    //为什么要双重检查？
    /*
    同步锁外判断，为避免在实例已经创建的情况下每次获取实例都加锁取，影响性能；
    锁内判断，考虑多线程情况下，两个以上线程都已经运行至同步锁处，也就是都已经判断变量为空，如锁内不再次判断，会导致实例重复创建
    */
    public static Mgr06 getInstance()
    {
        if (INSTANCE == null)
        {
            //双重检查
            synchronized (Mgr06.class)
            {
                if(INSTANCE == null)
                {
                    try
                    {
                        Thread.sleep(1);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args)
    {
        for(int i=0; i<100; i++)
        {
            new Thread(()->{
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }
}