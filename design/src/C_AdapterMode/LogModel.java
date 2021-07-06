package C_AdapterMode;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author cuifua
 * @Date 2021/7/4 19:58
 * @Version 1.0
 */
@Data
public class LogModel implements Serializable
{
    //日志编号
    private String logId;
    //操作人员
    private String operateUser;
    //操作时间
    private String operateTime;
    //日志内容
    private String logContent;
}
