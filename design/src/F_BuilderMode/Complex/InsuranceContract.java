package F_BuilderMode.Complex;
/**
 * 保险合同的对象
 */
public class InsuranceContract extends ConcreteBuilder
{
	/**
	 * 保险合同编号
	 */
	private String contractId;

	/**
	 * 被保险人员的名称，同一份保险合同，要么跟人员签订，要么跟公司签订，
	 * 也就是说，"被保险人员"和"被保险公司"这两个属性，不可能同时有值
	 */
	private String personName;

	/**
	 * 被保险公司的名称
	 */
	private String companyName;

	/**
	 * 保险开始生效的日期
	 */
	private long beginDate;

	/**
	 * 保险失效的日期，一定会大于保险开始生效的日期
	 */
	private long endDate;

	/**
	 * 示例：其它数据
	 */
	private String otherData;
	
	/**
	 * 构造方法，访问级别是同包能访问
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
	 * 示意：保险合同的某些操作
	 */
	public void someOperation()
	{
		System.out.println("Now in Insurance Contract someOperation=="+this.contractId+",personName="+this.personName+" , cmpanyName="+this.companyName);
	}

	//=====================================添加约束==================================
	public InsuranceContract build()
	{
		if(contractId==null || contractId.trim().length()==0)
			throw new IllegalArgumentException("合同编号不能为空");

		boolean signPerson = personName!=null && personName.trim().length()>0;

		boolean signCompany = companyName!=null && companyName.trim().length()>0;

		if(signPerson && signCompany)
			throw new IllegalArgumentException("一份保险合同不能同时与人和公司签订");

		if(signPerson==false && signCompany==false)
			throw new IllegalArgumentException("一份保险合同不能没有签订对象");

		if(beginDate<=0)
			throw new IllegalArgumentException("合同必须有保险开始生效的日期");

		if(endDate<=0)
			throw new IllegalArgumentException("合同必须有保险失效的日期");

		if(endDate<=beginDate)
			throw new IllegalArgumentException("保险失效的日期必须大于保险生效日期");

		return new InsuranceContract(this);
	}
}
