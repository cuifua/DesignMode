package F_BuilderMode.now.Role;

import F_BuilderMode.now.Bulider.TxtBuilder;
import F_BuilderMode.now.Bulider.XmlBuilder;
import F_BuilderMode.now.pojo.ExportDataModel;
import F_BuilderMode.now.pojo.ExportFooterModel;
import F_BuilderMode.now.pojo.ExportHeaderModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Client
{
	public static void main(String[] args)
	{
		//=================Head==================
		ExportHeaderModel ehm = new ExportHeaderModel();
		ehm.setDepId("一分公司");
		ehm.setExportDate("2010-05-18");


		//=================Body==================
		Map<String,Collection<ExportDataModel>> mapData = new HashMap<String,Collection<ExportDataModel>>();
		Collection<ExportDataModel> col = new ArrayList<ExportDataModel>();
		
		ExportDataModel edm1 = new ExportDataModel();
		edm1.setProductId("产品001号");
		edm1.setPrice(100);
		edm1.setAmount(80);
		
		ExportDataModel edm2 = new ExportDataModel();
		edm2.setProductId("产品002号");
		edm2.setPrice(99);
		edm2.setAmount(55);		
		//把数据组装起来
		col.add(edm1);
		col.add(edm2);		
		mapData.put("销售记录表", col);


		//=================Footer==================
		ExportFooterModel efm = new ExportFooterModel();
		efm.setExportUser("张三");


		//=================文本文件Test==================
		TxtBuilder txtBuilder = new TxtBuilder();        				   //测试输出到文本文件
		Director director = new Director(txtBuilder);                      //创建指导者对象
		director.construct(ehm, mapData, efm);
		System.out.println("输出到文本文件的内容：\n"+txtBuilder.getResult()); //把要输出的内容输出到控制台看看
		
		
		//=================xml文件Test===================
		XmlBuilder xmlBuilder = new XmlBuilder();
		Director director1 = new Director(xmlBuilder);
		director1.construct(ehm,mapData,efm);
		/*原来的方法
		XmlBuilder xmlBuilder = new XmlBuilder();
		xmlBuilder.buildHeader(ehm);
		xmlBuilder.buildBody(mapData);
		xmlBuilder.buildFooter(efm);
		 */
		System.out.println("输出到XML文件的内容：\n"+xmlBuilder.getResult());//把要输出的内容输出到控制台看看
	}
}
