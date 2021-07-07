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
		ehm.setDepId("һ�ֹ�˾");
		ehm.setExportDate("2010-05-18");


		//=================Body==================
		Map<String,Collection<ExportDataModel>> mapData = new HashMap<String,Collection<ExportDataModel>>();
		Collection<ExportDataModel> col = new ArrayList<ExportDataModel>();
		
		ExportDataModel edm1 = new ExportDataModel();
		edm1.setProductId("��Ʒ001��");
		edm1.setPrice(100);
		edm1.setAmount(80);
		
		ExportDataModel edm2 = new ExportDataModel();
		edm2.setProductId("��Ʒ002��");
		edm2.setPrice(99);
		edm2.setAmount(55);		
		//��������װ����
		col.add(edm1);
		col.add(edm2);		
		mapData.put("���ۼ�¼��", col);


		//=================Footer==================
		ExportFooterModel efm = new ExportFooterModel();
		efm.setExportUser("����");


		//=================�ı��ļ�Test==================
		TxtBuilder txtBuilder = new TxtBuilder();        				   //����������ı��ļ�
		Director director = new Director(txtBuilder);                      //����ָ���߶���
		director.construct(ehm, mapData, efm);
		System.out.println("������ı��ļ������ݣ�\n"+txtBuilder.getResult()); //��Ҫ������������������̨����
		
		
		//=================xml�ļ�Test===================
		XmlBuilder xmlBuilder = new XmlBuilder();
		Director director1 = new Director(xmlBuilder);
		director1.construct(ehm,mapData,efm);
		/*ԭ���ķ���
		XmlBuilder xmlBuilder = new XmlBuilder();
		xmlBuilder.buildHeader(ehm);
		xmlBuilder.buildBody(mapData);
		xmlBuilder.buildFooter(efm);
		 */
		System.out.println("�����XML�ļ������ݣ�\n"+xmlBuilder.getResult());//��Ҫ������������������̨����
	}
}
