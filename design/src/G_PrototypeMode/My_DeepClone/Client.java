package G_PrototypeMode.My_DeepClone;

import G_PrototypeMode.My_DeepClone.ProductClass.Product;

public class Client
{
	public static void main(String[] args)
	{
		//�ȴ���ԭ��ʵ��
		PersonalOrder oa1 = new PersonalOrder();
		//����ԭ��ʵ����ֵ
		Product product = new Product();
		product.setName("�������͡���Ʒ������������1");
		product.setProductId("�������͡���Ʒ���ı������1");

		oa1.setProduct(product);
		oa1.setOrderProductNum(100);
	    System.out.println("���ǵ�һ�λ�ȡ�Ķ���ʵ��="+oa1);


		//ͨ����¡����ȡ�µ�ʵ��
	    PersonalOrder oa2 = (PersonalOrder)oa1.cloneOrder();
		//�޸�����ֵ
	    oa2.getProduct().setName("�������͡���Ʒ�����������Ը�Ϊ2");
	    oa2.getProduct().setProductId("�������͡���Ʒ���ı�����Ը�Ϊ2");
		oa2.setOrderProductNum(80);
		//�����¡�����Ķ����ֵ
		System.out.println("�����¡������ʵ��="+oa2);


		//�ٴ����ԭ��ʵ����ֵ
		System.out.println("�ٴ����ԭ��ʵ��="+oa1);	
	}
}
