package D_Singleton.now;

/**
 * @Author cuifua
 * @Date 2021/7/6 14:19
 * @Version 1.0
 */
public class SingletonLazy
{
    //定义一个变量来存储创建好的类实例【=null  懒汉的意思即先不创建，用的时候再创建】
    private static SingletonLazy uniqueInstance = null;

    //私有化构造方法，好在内部控制创建实例的数目
    private SingletonLazy(){
    }

    //示意方法，单例可以有自己的操作
    public void singletonOperation()
    {
        //功能处理
    }

    //示意属性，单例可以有自己的属性
    private String singletonData;

    /**
     * 示意方法，让外部通过这些方法来访问属性的值
     * @return 属性的值
     */
    public String getSingletonData()
    {
        return singletonData;
    }

    /**
     * 定义一个方法来为客户端提供类实例
     * @return 一个Singleton的实例
     */
    public static synchronized SingletonLazy getInstance()
    {

        if(uniqueInstance == null)                //判断存储实例的变量是否有值
            uniqueInstance = new SingletonLazy(); //如果没有，就创建一个类实例，并把值赋值给存储类实例的变量

        return uniqueInstance;                    //如果有值，那就直接使用
    }
}
