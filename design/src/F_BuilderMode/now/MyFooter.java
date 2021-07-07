package F_BuilderMode.now;

import F_BuilderMode.now.pojo.ExportFooterModel;

public class MyFooter {

	public String genHeader(ExportFooterModel efm)
	{
		String str = "  <Footer>\n";
		str+="    <ExportUser>"+efm.getExportUser()+"</ExportUser>\n";
		str+="  </Footer>\n";
		str+="</Report>\n";
		return str;
	}
}
