package J_ObserverMode.JavaObservable;

import java.util.Observer;

public class Client
{
	public static void main(String[] args)
	{
		//����һ����ֽ����Ϊ���۲���
		NewsPaper subject = new NewsPaper();
		
		//�����Ķ��ߣ�Ҳ���ǹ۲���
		Reader reader1 = new Reader();
		reader1.setName("����");
		
		Reader reader2 = new Reader();
		reader2.setName("����");
		
		Reader reader3 = new Reader();
		reader3.setName("����");
		
		//ע���Ķ���
		subject.addObserver((Observer) reader1);
		subject.addObserver((Observer) reader2);
		subject.addObserver((Observer) reader3);
		
		//Ҫ����ֽ��
		subject.setContent("���������ǹ۲���ģʽ");
		System.out.println("----------->");
	}
}
