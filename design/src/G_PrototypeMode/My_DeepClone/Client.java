package G_PrototypeMode.My_DeepClone;

import G_PrototypeMode.My_DeepClone.ProductClass.Product;

public class Client
{
	public static void main(String[] args)
	{
		//先创建原型实例
		PersonalOrder oa1 = new PersonalOrder();
		//设置原型实例的值
		Product product = new Product();
		product.setName("引用类型【产品】的名字属性1");
		product.setProductId("引用类型【产品】的编号属性1");

		oa1.setProduct(product);
		oa1.setOrderProductNum(100);
	    System.out.println("这是第一次获取的对象实例="+oa1);


		//通过克隆来获取新的实例
	    PersonalOrder oa2 = (PersonalOrder)oa1.cloneOrder();
		//修改它的值
	    oa2.getProduct().setName("引用类型【产品】的名字属性改为2");
	    oa2.getProduct().setProductId("引用类型【产品】的编号属性改为2");
		oa2.setOrderProductNum(80);
		//输出克隆出来的对象的值
		System.out.println("输出克隆出来的实例="+oa2);


		//再次输出原型实例的值
		System.out.println("再次输出原型实例="+oa1);	
	}
}
