package H_MediatorMode.PC_Example.Colleague;

import H_MediatorMode.PC_Example.Mediator.Mediator;

/**
 * CPU�࣬һ��ͬ����
 */
public class CPU extends Colleague
{
	public CPU(Mediator mediator)
	{
		super(mediator);
	}

	/**
	 * �ֽ��������Ƶ����
	 */
	private String videoData = "";

	/**
	 * �ֽ��������������
	 */
	private String soundData = "";

	/**
	 * ��ȡ�ֽ��������Ƶ����
	 * @return �ֽ��������Ƶ����
	 */
	public String getVideoData() {
		return videoData;
	}

	/**
	 * ��ȡ�ֽ��������������
	 * @return �ֽ��������������
	 */
	public String getSoundData() {
		return soundData;
	}

	/**
	 * �������ݣ������ݷֳ���Ƶ����Ƶ������
	 * @param data �����������
	 */
	//ҵ�񷽷���Ҳ�Ǻ��н��߽����ķ���
	//������ִ�е���cpu������Լ��ķ��������Կ���������û���κν�����ϵ������������ǵ����������ݵģ�û�е�������ͬ�µ���˼��
	public void executeData(String data)
	{
		//�����ݷֽ⿪��ǰ�������Ƶ���ݣ����������Ƶ����
		String [] ss = data.split(",");
		this.videoData = ss[0];
		this.soundData = ss[1];

		//֪ͨ���壬CPU�Ĺ������
		this.getMediator().changed(this);
	}
	
}
