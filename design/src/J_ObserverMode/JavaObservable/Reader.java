package J_ObserverMode.JavaObservable;

import lombok.Data;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;

/**
 * �����Ķ��ߣ�Ϊ�˼򵥾�����һ������
 */

@Data
public class Reader implements java.util.Observable
{
	//���ߵ�����
	private String name;

	//ͬʱ֧�� ��ģ�� �� ��ģ��
	public void update(Observable o, Object obj)
	{
		//���ǲ����Ƶķ�ʽ
		System.out.println(name+"�յ���ֽ�ˣ��Ķ��ȡ�Ŀ���ƹ�����������==="+obj);

		//���ǻ�ȡ��������
		System.out.println(name+"�յ���ֽ�ˣ��Ķ��ȡ�������Ŀ�����ȥ����������==="
				+((NewsPaper)o).getContent());
	}
}


