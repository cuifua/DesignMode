package D_Singleton.now;

/**
 * @Author cuifua
 * @Date 2021/7/6 14:39
 * @Version 1.0
 */
public class Client
{
    public static void main(String[] args)
    {
        //创建读取应用配置的对象
        for(int i=0;i<5;i++)
        {
            AppConfig config = AppConfig.getInstance();

            String  paramA = config.getParameterA();
            String paramB = config.getParameterB();

            System.out.println("i="+i+"paramA="+paramA+",paramB="+paramB);
        }
    }
}