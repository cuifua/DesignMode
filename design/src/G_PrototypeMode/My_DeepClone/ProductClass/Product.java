package G_PrototypeMode.My_DeepClone.ProductClass;

import lombok.Data;

/**
 * ��Ʒ����
 */
@Data
public class Product implements ProductPrototype
{
	/**
	 * ��Ʒ���
	 */
	private String productId;

	/**
	 * ��Ʒ����
	 */
	private String name;

	public String toString()
	{
		return "��Ʒ���="+this.productId+"����Ʒ����="+this.name;
	}

	public ProductPrototype cloneProduct()
	{
		//����һ���µĶ�����Ȼ��ѱ�ʵ�������ݸ��ƹ�ȥ
		Product product = new Product();
		product.setProductId(this.productId);
		product.setName(this.name);		
		return product;
	}	
}
