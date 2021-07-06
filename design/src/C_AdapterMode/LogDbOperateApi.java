package C_AdapterMode;

import java.util.List;

/**
 * @Author cuifua
 * @Date 2021/7/4 20:31
 * @Version 1.0
 *
 * 已经存在的接口，通常能满足客户端的功能需求，但是接口与
 * 客户端的特定领域接口不一致，【需要被适配】
 */
public interface LogDbOperateApi
{
    /**
     * 新增日志
     * @param lm 需要新增的日志对象
     */
    public void createLog(LogModel lm);

    /**
     * 修改日志
     * @param lm 需要修改的日志对象
     */
    public void updateLog(LogModel lm);

    /**
     * 删除日志
     * @param lm 需要删除的日志对象
     */
    public void removeLog(LogModel lm);

    /**
     * 获取所有的日志
     * @return 所有的日志对象
     */
    public List<LogModel> getAllLog();
}
