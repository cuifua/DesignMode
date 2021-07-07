package F_BuilderMode.Complex;
/**
 * ���պ�ͬ�Ķ���
 */
public class InsuranceContract extends ConcreteBuilder
{
	/**
	 * ���պ�ͬ���
	 */
	private String contractId;

	/**
	 * ��������Ա�����ƣ�ͬһ�ݱ��պ�ͬ��Ҫô����Աǩ����Ҫô����˾ǩ����
	 * Ҳ����˵��"��������Ա"��"�����չ�˾"���������ԣ�������ͬʱ��ֵ
	 */
	private String personName;

	/**
	 * �����չ�˾������
	 */
	private String companyName;

	/**
	 * ���տ�ʼ��Ч������
	 */
	private long beginDate;

	/**
	 * ����ʧЧ�����ڣ�һ������ڱ��տ�ʼ��Ч������
	 */
	private long endDate;

	/**
	 * ʾ������������
	 */
	private String otherData;
	
	/**
	 * ���췽�������ʼ�����ͬ���ܷ���
	 */
	InsuranceContract(ConcreteBuilder builder)
	{
		this.contractId = builder.getContractId();
		this.personName = builder.getPersonName();
		this.companyName = builder.getCompanyName();
		this.beginDate = builder.getBeginDate();
		this.endDate = builder.getEndDate();
		this.otherData = builder.getOtherData();
	}
	
	/**
	 * ʾ�⣺���պ�ͬ��ĳЩ����
	 */
	public void someOperation()
	{
		System.out.println("Now in Insurance Contract someOperation=="+this.contractId+",personName="+this.personName+" , cmpanyName="+this.companyName);
	}

	//=====================================���Լ��==================================
	public InsuranceContract build()
	{
		if(contractId==null || contractId.trim().length()==0)
			throw new IllegalArgumentException("��ͬ��Ų���Ϊ��");

		boolean signPerson = personName!=null && personName.trim().length()>0;

		boolean signCompany = companyName!=null && companyName.trim().length()>0;

		if(signPerson && signCompany)
			throw new IllegalArgumentException("һ�ݱ��պ�ͬ����ͬʱ���˺͹�˾ǩ��");

		if(signPerson==false && signCompany==false)
			throw new IllegalArgumentException("һ�ݱ��պ�ͬ����û��ǩ������");

		if(beginDate<=0)
			throw new IllegalArgumentException("��ͬ�����б��տ�ʼ��Ч������");

		if(endDate<=0)
			throw new IllegalArgumentException("��ͬ�����б���ʧЧ������");

		if(endDate<=beginDate)
			throw new IllegalArgumentException("����ʧЧ�����ڱ�����ڱ�����Ч����");

		return new InsuranceContract(this);
	}
}
