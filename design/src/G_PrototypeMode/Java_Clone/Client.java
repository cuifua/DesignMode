package G_PrototypeMode.Java_Clone;

public class Client
{
	public static void main(String[] args)
	{
		//�ȴ���ԭ��ʵ��
		PersonalOrder oa1 = new PersonalOrder();
		//����ԭ��ʵ���Ķ���������ֵ
		oa1.setOrderProductNum(100);
		//Ϊ�˼򵥣���������������
	    System.out.println("���ǵ�һ�λ�ȡ�Ķ���ʵ��==="+oa1.getOrderProductNum());


		//ͨ����¡����ȡ�µ�ʵ��
		//��ע�������  ��PersonalOrder oa2 = ...��  ������  ��OrderApi oa2����
		//��ԭ����OrderApi�ӿ���û�п�¡�ķ������������ʹ�õ���Java�Դ��Ŀ�¡������
	    PersonalOrder oa2 = (PersonalOrder)oa1.clone();
		//�޸���������
		oa2.setOrderProductNum(80);
		//�����¡�����Ķ����ֵ
		System.out.println("�����¡������ʵ��==="+oa2.getOrderProductNum());

		
		//�ٴ����ԭ��ʵ����ֵ
		System.out.println("�ٴ����ԭ��ʵ��==="+oa1.getOrderProductNum());	
	}
}
