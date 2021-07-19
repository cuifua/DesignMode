package J_ObserverMode.Change.Observer;

import J_ObserverMode.Change.Subject.WaterQualitySubject;
import lombok.Data;

/**
 * 具体的观察者实现
 */
@Data
public class Watcher implements WatcherObserver
{
	/**
	 * 职务
	 */
	private String job;
	
	public void update(WaterQualitySubject subject)
	{
		//这里采用的是拉的方式
		System.out.println(job+"获取到通知，当前污染级别为："+subject.getPolluteLevel());
	}
}
