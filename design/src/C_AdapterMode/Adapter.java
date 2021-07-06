package C_AdapterMode;

import java.util.List;

/**
 * @Author cuifua
 * @Date 2021/7/4 20:50
 * @Version 1.0
 */
public class Adapter implements LogDbOperateApi//接口接的哪个，就是改造哪个
{
    /*
    //需要被适配的对象
    private Adaptee adaptee;

    //构造方法，传入需要被适配的对象
    public Adapter(Adaptee adaptee)
    {
        this.adaptee = adaptee;
    }

    //进行适配
    public void request()
    {
        adaptee.specificRequest();
    }
     */

     //持有需要被适配的接口对象
    private LogFileOperateApi adaptee;

    /**
     * 构造方法，传入需要被适配的对象
     * @param adaptee 需要被适配的对象
     */
    public Adapter(LogFileOperateApi adaptee)
    {
        this.adaptee = adaptee;
    }


    public void createLog(LogModel lm) {
        //1：先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();

        //2：加入新的日志对象
        list.add(lm);

        //3：重新写入文件
        adaptee.writeLogFile(list);
    }

    public List<LogModel> getAllLog()
    {
        return adaptee.readLogFile();
    }

    public void removeLog(LogModel lm)
    {
        //1：先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();

        //2：删除相应的日志对象
        list.remove(lm);

        //3：重新写入文件
        adaptee.writeLogFile(list);
    }

    public void updateLog(LogModel lm)
    {
        //1：先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();

        //2：修改相应的日志对象
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getLogId().equals(lm.getLogId()))
            {
                list.set(i, lm);
                break;
            }
        }

        //3：重新写入文件
        adaptee.writeLogFile(list);
    }

}
