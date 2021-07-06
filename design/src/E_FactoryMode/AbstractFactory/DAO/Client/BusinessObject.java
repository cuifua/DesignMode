package E_FactoryMode.AbstractFactory.DAO.Client;

import E_FactoryMode.AbstractFactory.DAO.DetailDAO.OrderDetailDAO;
import E_FactoryMode.AbstractFactory.DAO.Factory.DAOFactory;
import E_FactoryMode.AbstractFactory.DAO.Factory.XmlDAOFactory;
import E_FactoryMode.AbstractFactory.DAO.MainDAO.OrderMainDAO;

public class BusinessObject//图很重要，在P148
{
	public static void main(String[] args)
	{
		//创建DAO的抽象工厂
		DAOFactory df = new XmlDAOFactory();

		//通过抽象工厂来获取需要的DAO接口
		OrderMainDAO mainDAO = df.createOrderMainDAO();
		OrderDetailDAO detailDAO = df.createOrderDetailDAO();

		//调用DAO来完成数据存储的功能
		mainDAO.saveOrderMain();
		detailDAO.saveOrderDetail();
	}
}
