package D_Singleton.example;

/**
 * lazy loading
 * Ҳ������ʽ
 * ��Ȼ�ﵽ�˰����ʼ����Ŀ�ģ���ȴ�����̲߳���ȫ������
 * ����ͨ��synchronized�������Ҳ����Ч���½�
 */
public class Mgr06 {
    private static volatile Mgr06 INSTANCE; //JIT

    private Mgr06() {
    }

    //ΪʲôҪ˫�ؼ�飿
    /*
    ͬ�������жϣ�Ϊ������ʵ���Ѿ������������ÿ�λ�ȡʵ��������ȡ��Ӱ�����ܣ�
    �����жϣ����Ƕ��߳�����£����������̶߳��Ѿ�������ͬ��������Ҳ���Ƕ��Ѿ��жϱ���Ϊ�գ������ڲ��ٴ��жϣ��ᵼ��ʵ���ظ�����
    */
    public static Mgr06 getInstance()
    {
        if (INSTANCE == null)
        {
            //˫�ؼ��
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