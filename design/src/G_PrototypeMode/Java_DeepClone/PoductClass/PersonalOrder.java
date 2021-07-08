package G_PrototypeMode.Java_DeepClone.PoductClass;

import G_PrototypeMode.Java_DeepClone.OrderApi;
import lombok.Data;

/**
 * ���˶�������
 */
@Data
public class PersonalOrder implements Cloneable , OrderApi
{
	/**
	 * ������Ա����
	 */
	private String customerName;

	/**
	 * ��Ʒ����
	 */
	private Product product = null;

	/**
	 * ������Ʒ����
	 */
	private int orderProductNum = 0;
	

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String toString()
	{
		//�򵥵����
		return "������Ʒ��="+this.product.getName()+"����������Ϊ="+this.orderProductNum;
	}
	
	public Object clone()
	{
		PersonalOrder obj=null;
		try
		{
			obj =(PersonalOrder)super.clone();
			//��һ�仰������
			obj.setProduct((Product)this.product.clone());
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}		
		return obj;
	}

}
