package F_BuilderMode.Complex;

import F_BuilderMode.Complex.InsuranceContract;
import F_BuilderMode.Complex.ConcreteBuilder;

public class Client
{
	public static void main(String[] args)
	{
		//创建构建器
		ConcreteBuilder builder = new ConcreteBuilder("001",12345L,67890L);

		//设置需要的数据，然后构建保险合同对象
		InsuranceContract contract = builder
				.setPersonName("张三")
				.setOtherData("test")
				.build();
		
		//操作保险合同对象的方法
		contract.someOperation();

		//===========================================================================================
		ConcreteBuilder builder2 = new ConcreteBuilder("001",12345L,67890L);

		InsuranceContract contract2 = builder2
					.setPersonName("李四")
					.setCompanyName("cc")
					.setOtherData("company")
					.build();

		contract2.someOperation();
	}
}
