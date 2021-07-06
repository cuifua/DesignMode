package E_FactoryMode.AbstractFactory.DAO.Client;

import E_FactoryMode.AbstractFactory.DAO.DetailDAO.OrderDetailDAO;
import E_FactoryMode.AbstractFactory.DAO.Factory.DAOFactory;
import E_FactoryMode.AbstractFactory.DAO.Factory.XmlDAOFactory;
import E_FactoryMode.AbstractFactory.DAO.MainDAO.OrderMainDAO;

public class BusinessObject//ͼ����Ҫ����P148
{
	public static void main(String[] args)
	{
		//����DAO�ĳ��󹤳�
		DAOFactory df = new XmlDAOFactory();

		//ͨ�����󹤳�����ȡ��Ҫ��DAO�ӿ�
		OrderMainDAO mainDAO = df.createOrderMainDAO();
		OrderDetailDAO detailDAO = df.createOrderDetailDAO();

		//����DAO��������ݴ洢�Ĺ���
		mainDAO.saveOrderMain();
		detailDAO.saveOrderDetail();
	}
}
