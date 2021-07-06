package D_Singleton.old;

/**
 * @Author cuifua
 * @Date 2021/7/6 14:15
 * @Version 1.0
 */
public class Client
{
    public static void main(String[] args)
    {
        //创建读取应用配置的对象【老方法的不好之处在于，用一次调用一次，要创建很多一模一样的AppConfig类】
        AppConfig config = new AppConfig();

        String paramA = config.getParameterA();
        String paramB = config.getParameterB();

        System.out.println("paramA="+paramA+",paramB="+paramB);
    }
}
