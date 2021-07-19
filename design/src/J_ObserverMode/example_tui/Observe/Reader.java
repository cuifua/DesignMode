package J_ObserverMode.example_tui.Observe;

import lombok.Data;

/**
 * 真正的读者，为了简单就描述一下姓名
 */
@Data
public class Reader implements Observer
{
	/**
	 * 读者的姓名
	 */
	private String name;

	public void update(String content)
	{
		//这是采用推的方式
		System.out.println(name+"收到报纸了，阅读先。推模型 内容是==="+content);//变化就在这里，直接接收传入的数据就可以了
	}
}
