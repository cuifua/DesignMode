package J_ObserverMode.Change.Observer;

import J_ObserverMode.Change.Subject.WaterQualitySubject;
import lombok.Data;

/**
 * ����Ĺ۲���ʵ��
 */
@Data
public class Watcher implements WatcherObserver
{
	/**
	 * ְ��
	 */
	private String job;
	
	public void update(WaterQualitySubject subject)
	{
		//������õ������ķ�ʽ
		System.out.println(job+"��ȡ��֪ͨ����ǰ��Ⱦ����Ϊ��"+subject.getPolluteLevel());
	}
}
