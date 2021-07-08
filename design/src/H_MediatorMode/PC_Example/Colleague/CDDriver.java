package H_MediatorMode.PC_Example.Colleague;

import H_MediatorMode.PC_Example.Mediator.Mediator;

/**
 * �����࣬һ��ͬ����
 */
public class CDDriver extends Colleague
{
	//��˼��ע��һ���н���
	public CDDriver(Mediator mediator)
	{
		super(mediator);
	}

	/**
	 * ������ȡ����������
	 */
	private String data = "";  // ����� �� �� ָ��������ҵ��״̬����

	/**
	 * ��ȡ������ȡ����������
	 * @return ������ȡ����������
	 */
	public String getData()
	{
		return this.data;
	}

	/**
	 * ��ȡ����
	 */
	//ҵ�񷽷���Ҳ�Ǻ��н��߽����ķ���
	public void readCD()
	{
		//����ǰ����Ƶ��ʾ�����ݣ����ź�������
		this.data = "���ģʽ,ֵ�úú��о�";

		//֪ͨ���壬�Լ���״̬�����˸ı�
		this.getMediator().changed(this);
	}
}
