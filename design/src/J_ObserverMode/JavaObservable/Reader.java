package J_ObserverMode.JavaObservable;

import lombok.Data;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;

/**
 * 真正的读者，为了简单就描述一下姓名
 */

@Data
public class Reader implements java.util.Observable
{
	//读者的姓名
	private String name;

	//同时支持 推模型 和 拉模型
	public void update(Observable o, Object obj)
	{
		//这是采用推的方式
		System.out.println(name+"收到报纸了，阅读先。目标推过来的内容是==="+obj);

		//这是获取拉的数据
		System.out.println(name+"收到报纸了，阅读先。主动到目标对象去拉的内容是==="
				+((NewsPaper)o).getContent());
	}
}


