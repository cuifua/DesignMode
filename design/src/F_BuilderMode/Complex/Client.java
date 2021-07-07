package F_BuilderMode.Complex;

import F_BuilderMode.Complex.InsuranceContract;
import F_BuilderMode.Complex.ConcreteBuilder;

public class Client
{
	public static void main(String[] args)
	{
		//����������
		ConcreteBuilder builder = new ConcreteBuilder("001",12345L,67890L);

		//������Ҫ�����ݣ�Ȼ�󹹽����պ�ͬ����
		InsuranceContract contract = builder
				.setPersonName("����")
				.setOtherData("test")
				.build();
		
		//�������պ�ͬ����ķ���
		contract.someOperation();

		//===========================================================================================
		ConcreteBuilder builder2 = new ConcreteBuilder("001",12345L,67890L);

		InsuranceContract contract2 = builder2
					.setPersonName("����")
					.setCompanyName("cc")
					.setOtherData("company")
					.build();

		contract2.someOperation();
	}
}
