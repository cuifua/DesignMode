package J_ObserverMode.example_tui.Subject;

import J_ObserverMode.example_tui.Observe.Observer;

import java.util.ArrayList;
import java.util.List;
//����ģ�͵�Ŀ��ʵ�����,��һЩ�仯��
//   ֪ͨ���й۲��ߵķ���,��ǰ��û�в�����,������Ҫ������Ҫ�������͵����ݡ�
//   ��ѭ��֪ͨ�۲��ߵ�ʱ��,Ҳ����ѭ�����ù۲��ߵ� update ������ʱ��,����Ĳ�����ͬ�ˡ�

/**
 * Ŀ�������Ϊ���۲��ߣ�ʹ����ģ��
 */
public class Subject
{
	/**
	 * ��������ע��Ĺ۲��߶���Ҳ���Ǳ�ֽ�Ķ�����
	 */
	private List<Observer> readers = new ArrayList<Observer>();

	/**
	 * ��ֽ�Ķ�����Ҫ�����綩�ģ���Ҫע��
	 * @param reader ��ֽ�Ķ��� 
	 * @return �Ƿ�ע��ɹ�
	 */
	public void attach(Observer reader) {
		readers.add(reader);
	}

	/**
	 * ��ֽ�Ķ��߿���ȡ������
	 * @param reader ��ֽ�Ķ���
	 * @return �Ƿ�ȡ���ɹ�
	 */
	public void detach(Observer reader) {
		readers.remove(reader);
	}

	/**
	 * ��ÿ�ڱ�ֽӡˢ�����󣬾�ҪѸ�ٵ������ı��͵����ߵ����У�
	 * �൱��֪ͨ���ߣ�������֪��
	 * @param content Ҫ�������͵�����
	 */
	protected void notifyObservers(String content)
	{
		for(Observer reader : readers)
			reader.update(content);
	}
}
