package J_ObserverMode.emample_la.Observe;

import J_ObserverMode.emample_la.Subject.NewsPaper;
import J_ObserverMode.emample_la.Subject.Subject;
import lombok.Data;

/**
 * �����Ķ��ߣ�Ϊ�˼򵥾�����һ������
 */
@Data
public class Reader implements Observer
{
	/**
	 * ���ߵ�����
	 */
	private String name;

	public void update(Subject subject)
	{
		//���ǲ������ķ�ʽ
		System.out.println(name+"�յ���ֽ�ˣ��Ķ��ȡ�������==="+((NewsPaper)subject).getContent());
	}
}
