package D_Singleton.example;

/**
 * �������Խ���߳�ͬ���������Է�ֹ�����л��������л�����������Ϊ���л�����Ҫ��ȡclass��ͨ�����캯����ʵ�������󣬵�enumû�й��캯��
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