package A_SimpleFactory;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * @Author cuifua
 * @Date 2021/7/4 17:38
 * @Version 1.0
 */
public class SimpleFactory
{
    /**
     * 根据客户端输入的要求选择不同的实现类
     * public static Api creatApi(int key)
     * {
     * Api api = null;
     * if(key ==1)
     * api = new ApiImplA();
     * else if(key == 2)
     * api = new ApiImplB();
     * return api;
     * }
     */

    public static Api creatApi()
    {
        //========================装载配置文件========================
        Properties p = new Properties();
        InputStream is = null;

        try
        {
            is = SimpleFactory.class.getResourceAsStream("SimpleFactory.properties");
            p.load(is);
        }
        catch (IOException e)
        {
            System.out.println("装载工厂的配置文件出错了，具体堆栈信息如下：");
            e.printStackTrace();
        }
        finally
        {
            try
            {
                is.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        //========================通过配置文件配置实体类========================
        Api api = null;
        try
        {
            api = (Api) Class.forName(p.getProperty("ImplClass")).getDeclaredConstructor().newInstance();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(NoSuchMethodException e)
        {
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        return api;
    }
}
