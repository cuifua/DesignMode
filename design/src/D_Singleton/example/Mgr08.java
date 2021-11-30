package D_Singleton.example;

/**
 * 不仅可以解决线程同步，还可以防止反序列化。反序列化在这里是因为序列化都需要获取class，通过构造函数来实例化对象，但enum没有构造函数
 */
public enum Mgr08 {

    INSTANCE;

    public void m() {}

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }

}