package E_FactoryMode.AbstractFactory.old.Factory;

import E_FactoryMode.AbstractFactory.old.MainBoard.GAmainboard;
import E_FactoryMode.AbstractFactory.old.MainBoard.MSImainboard;
import E_FactoryMode.AbstractFactory.old.MainBoard.MainBoard_API;

/**
 * @Author cuifua
 * @Date 2021/7/6 19:29
 * @Version 1.0
 */
public class MainboardFactory
{
    /**
     * 创建主板接口对象的方法
     * @param type 选择主板类型的参数
     * @return 主板接口对象的方法
     */
    public static MainBoard_API createMainboardApi(int type)
    {
        MainBoard_API mainboard = null;

        //根据参数来选择并创建相应的主板对象
        if(type==1)
            mainboard = new GAmainboard(1156);
        else if(type==2)
            mainboard = new MSImainboard(939);

        return mainboard;
    }
}
