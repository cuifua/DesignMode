package J_ObserverMode.example_tui.Observe;

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

	public void update(String content)
	{
		//���ǲ����Ƶķ�ʽ
		System.out.println(name+"�յ���ֽ�ˣ��Ķ��ȡ���ģ�� ������==="+content);//�仯�������ֱ�ӽ��մ�������ݾͿ�����
	}
}
