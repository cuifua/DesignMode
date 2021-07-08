package G_PrototypeMode.Java_Clone;

import lombok.Data;

/**
 * ���˶�������,����Java��Clone����
 */
@Data
public class PersonalOrder implements Cloneable  , OrderApi
{
	/**
	 * ������Ա����
	 */
	private String customerName;

	/**
	 * ��Ʒ���
	 */
	private String productId;

	/**
	 * ������Ʒ����
	 */
	private int orderProductNum = 0;

	public String toString()
	{
		return "�����˶����Ķ�������="+this.customerName+"��������Ʒ��="+this.productId+"����������Ϊ="+this.orderProductNum;
	}

	//���ʹ��Java�Դ��Ŀ�¡����
	@Override
	public Object clone()
	{
		//��¡����������ʵ�֣�ֱ�ӵ��ø���Ŀ�¡�����Ϳ�����
		Object obj = null;
		try
		{
			obj = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return obj;
	}
}
