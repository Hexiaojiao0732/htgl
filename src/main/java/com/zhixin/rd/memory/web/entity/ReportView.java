package com.zhixin.rd.memory.web.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.document.AbstractExcelView;


public class ReportView extends AbstractExcelView {
	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 从model中获取数据对象
		List<WjdcEntity> list = (List<WjdcEntity>) model.get("list");
		System.err.println("-----------------list--------------------" + list);
		System.err.println("-----------------总数--------------------" + list.size());
		// 创建样式
		HSSFFont font = workbook.createFont();
		HSSFCellStyle headerStyle = workbook.createCellStyle();
		// 设置垂直居中
		headerStyle.setAlignment(CellStyle.ALIGN_CENTER);
		headerStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		// 设置边框
		headerStyle.setBorderTop(CellStyle.BORDER_THIN);
		headerStyle.setBorderBottom(CellStyle.BORDER_THIN);
		headerStyle.setBorderLeft(CellStyle.BORDER_THIN);
		headerStyle.setBorderRight(CellStyle.BORDER_THIN);
		// 字体加粗
		font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		// 设置长文本自动换行
		headerStyle.setWrapText(true);
		headerStyle.setFont(font);

		// 创建工作表对象并命名
		HSSFSheet sheet = workbook.createSheet("数据表");
		//获取excel表格的列名称
		//cell1,cell3,cell5,cell7,cell9
		String tempString=	"cell0,cell1,cell2,cell3,cell4,cell5,cell6,cell7,cell8";
		System.err.println("======================tempString=========reportView======"+tempString);
		List<String> tempStringList= new ArrayList<String>();
		if(tempString!=null &&!"".equals(tempString)){
			String []tempStrings=tempString.split(",");
			if(tempStrings!=null && tempStrings.length>0){
				 tempStringList=Arrays.asList(tempStrings);
			}
		}
		
		System.err.println("----------tempStringList.size()----------"+tempStringList.size());
		int colNumber=0;
		// 设置行列的默认宽度和高度
		
		sheet.setColumnWidth(0, 32 * 50);// 对A列设置宽度为80像素
		// 创建表头
		HSSFRow headerRow = sheet.createRow(0);
		// headerRow.setHeightInPoints(25f);//设置行高
		//序号
		HSSFCell xuhaoHeader = headerRow.createCell(0);
		xuhaoHeader.setCellValue("序号");
		xuhaoHeader.setCellStyle(headerStyle);
		sheet.setColumnWidth(tempStringList.size(), 32 * 200);// 对A列设置宽度为80像素
		for(int i = 0 ;i<tempStringList.size(); i++){
			colNumber=0;
			colNumber=i+1;
			sheet.setColumnWidth(i, 32 * 200);// 对A列设置宽度为80像素
			String colName=tempStringList.get(i);
			//biaotouneirong
			//用户姓名
			if("cell0".equals(colName)){
				HSSFCell personNameHeader = headerRow.createCell(colNumber);
				personNameHeader.setCellValue("姓名");
				personNameHeader.setCellStyle(headerStyle);	
			}
			
			//性別
			if("cell1".equals(colName)){
				HSSFCell xbHeader = headerRow.createCell(colNumber);
				xbHeader.setCellValue("性別");
				xbHeader.setCellStyle(headerStyle);	
			}
			
			//出生日期
			if("cell2".equals(colName)){
				HSSFCell csrq = headerRow.createCell(colNumber);
				csrq.setCellValue("出生日期");
				csrq.setCellStyle(headerStyle);
			}
			
			//联系方式
			if("cell3".equals(colName)){
				HSSFCell lxfs = headerRow.createCell(colNumber);
				lxfs.setCellValue("联系方式");
				lxfs.setCellStyle(headerStyle);
			}
			
			//所在地区
			if("cell4".equals(colName)){
				HSSFCell szdq = headerRow.createCell(colNumber);
				szdq.setCellValue("所在地区");
				szdq.setCellStyle(headerStyle);
			}
			
			//关注内容
			if("cell5".equals(colName)){
				HSSFCell gznr = headerRow.createCell(colNumber);
				gznr.setCellValue("关注内容");
				gznr.setCellStyle(headerStyle);
			}
			//专业与相关经验
			if("cell6".equals(colName)){
				HSSFCell zyxgjy = headerRow.createCell(colNumber);
				zyxgjy.setCellValue("专业与相关经验");
				zyxgjy.setCellStyle(headerStyle);
			}
			//掌握语言
			if("cell7".equals(colName)){
				HSSFCell zwyy = headerRow.createCell(colNumber);
				zwyy.setCellValue("掌握语言");
				zwyy.setCellStyle(headerStyle);
			}
			
			//能提供的资源内容
			if("cell8".equals(colName)){
				HSSFCell tgzynr = headerRow.createCell(colNumber);
				tgzynr.setCellValue("能提供的资源内容");
				tgzynr.setCellStyle(headerStyle);
			}
		}
		/*
		sheet.setColumnWidth(0, 32 * 50);// 对A列设置宽度为80像素
		sheet.setColumnWidth(1, 32 * 80);
		sheet.setColumnWidth(2, 32 * 80);
		sheet.setColumnWidth(3, 32 * 50);
		sheet.setColumnWidth(4, 32 * 200);
		sheet.setColumnWidth(5, 32 * 80);
		sheet.setColumnWidth(6, 32 * 200);
		sheet.setColumnWidth(7, 32 * 200);
		sheet.setColumnWidth(8, 32 * 200);
		sheet.setColumnWidth(9, 32 * 200);
		sheet.setColumnWidth(10, 32 * 100);
		sheet.setColumnWidth(11, 32 * 150);
		*/

		
		
		

		// 设置表体样式
		HSSFCellStyle bodyStyle = workbook.createCellStyle();
		bodyStyle.setAlignment(CellStyle.ALIGN_CENTER);
		bodyStyle.setBorderTop(CellStyle.BORDER_THIN);
		bodyStyle.setBorderBottom(CellStyle.BORDER_THIN);
		bodyStyle.setBorderLeft(CellStyle.BORDER_THIN);
		bodyStyle.setBorderRight(CellStyle.BORDER_THIN);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int rownum = 0;
		// 遍历集合对象创建行和单元格
		for (int i = 0; i < list.size(); i++) {
			// 取出SysUser对象
			WjdcEntity exportEntity = list.get(i);
			// 创建行
			Row row = sheet.createRow(i + 1);
			rownum = 0;
			rownum = i;
			// System.err.println("------------------rownum--------------------------------"+rownum);
			// 开始创建单元格并赋值 ,序号
			Cell xuhaoCell = row.createCell(0);
			xuhaoCell.setCellValue(i + 1);
			xuhaoCell.setCellStyle(bodyStyle);
			int temColNum=0;
			for(int j = 0 ;j<tempStringList.size(); j++){
				String  temColName=tempStringList.get(j);
				temColNum=j+1;
//				yhXm=system, ajAjmc=王有贵被盗案, jzJzbh=null, jzgMc=null, gmXsbh=null, z=卷宗打印, zplj=null, czsj=null
				if("cell0".equals(temColName)){
					// 姓名
					Cell personNameCell = row.createCell(temColNum);
					if (exportEntity.getXm() != null) {
						personNameCell.setCellValue(exportEntity.getXm());
					}
					personNameCell.setCellStyle(bodyStyle);
				}
				 
				if("cell1".equals(temColName)){
					// 性别
					Cell xbCell = row.createCell(temColNum);
					if (exportEntity.getXb() != null) {
						xbCell.setCellValue(exportEntity.getXb());
					}
					xbCell.setCellStyle(bodyStyle);
				}

				// 出生日期
				if("cell2".equals(temColName)){
					Cell csrqCell = row.createCell(temColNum);
					if (exportEntity.getCsrq() != null) {
						csrqCell.setCellValue(exportEntity.getCsrq());
					}
					csrqCell.setCellStyle(bodyStyle);
				}
				//联系方式
				if("cell3".equals(temColName)){
					Cell lxfsCell = row.createCell(temColNum);
					if (exportEntity.getLxfs() != null) {
						lxfsCell.setCellValue(exportEntity.getLxfs());
					}
					lxfsCell.setCellStyle(bodyStyle);
				}
				//所在地区
				if("cell4".equals(temColName)){
					Cell szdqCell = row.createCell(temColNum);
					if (exportEntity.getSzdq() != null) {
						szdqCell.setCellValue(exportEntity.getSzdq());
					}
					szdqCell.setCellStyle(bodyStyle);
				}
				//关注内容
				if("cell5".equals(temColName)){
					Cell gznrCell = row.createCell(temColNum);
					if (exportEntity.getGznr() != null) {
						gznrCell.setCellValue(exportEntity.getGznr());
					}
					gznrCell.setCellStyle(bodyStyle);
				}
				//关注内容
				if("cell5".equals(temColName)){
					Cell gznrCell = row.createCell(temColNum);
					if (exportEntity.getGznr() != null) {
						gznrCell.setCellValue(exportEntity.getGznr());
					}
					gznrCell.setCellStyle(bodyStyle);
				}
				//专业与相关经验
				if("cell6".equals(temColName)){
					Cell zyxgjyCell = row.createCell(temColNum);
					if (exportEntity.getZyyxgjy() != null) {
						zyxgjyCell.setCellValue(exportEntity.getZyyxgjy());
					}
					zyxgjyCell.setCellStyle(bodyStyle);
				}
				//掌握语言
				if("cell7".equals(temColName)){
					Cell zwyyCell = row.createCell(temColNum);
					if (exportEntity.getZwyy() != null) {
						zwyyCell.setCellValue(exportEntity.getZwyy());
					}
					zwyyCell.setCellStyle(bodyStyle);
				}
				//能提供的资源内容
				if("cell8".equals(temColName)){
					Cell tgzynrCell = row.createCell(temColNum);
					if (exportEntity.getTgzynr() != null) {
						tgzynrCell.setCellValue(exportEntity.getTgzynr());
					}
					tgzynrCell.setCellStyle(bodyStyle);
				}
				//操作时间
//				if("cell6".equals(temColName)){
//					Cell czsj = row.createCell(temColNum);
//					if (exportEntity.getCzsj() != null) {
//						czsj.setCellValue(sdf.format(exportEntity.getCzsj()));
//					}
//					czsj.setCellStyle(bodyStyle);
//				}
			}
		}
		// 循环结束
		// 添加合计-------
		// 开始创建单元格并赋值 ,序号
		if (rownum == list.size() - 1) {
			System.err.println("==========统计开始=================");
			Row row = sheet.createRow(rownum + 2);
			Cell xuhaoCell = row.createCell(0);
			xuhaoCell.setCellValue("合计");
			xuhaoCell.setCellStyle(bodyStyle);

			// 以下是为每一列赋值,人员类型0 嫌疑人 1事主 2证人 3其它
			Cell PersonTypeCell = row.createCell(1);
			PersonTypeCell.setCellValue(list.size());
			PersonTypeCell.setCellStyle(bodyStyle);
			/*
			// 姓名
			Cell personNameCell = row.createCell(2);
			personNameCell.setCellValue("");
			personNameCell.setCellStyle(bodyStyle);
			// 性别
			Cell personSexCell = row.createCell(3);
			personSexCell.setCellValue("");
			personSexCell.setCellStyle(bodyStyle);
			// 证件号码
			Cell PersonCertificateNo = row.createCell(4);
			PersonCertificateNo.setCellValue("");
			PersonCertificateNo.setCellStyle(bodyStyle);
			// 案件类型 0刑事 1行政
			Cell caseTypeCell = row.createCell(5);
			caseTypeCell.setCellValue("");
			caseTypeCell.setCellStyle(bodyStyle);
			// 案件性质
			Cell casePropertiesCell = row.createCell(6);
			casePropertiesCell.setCellValue("");
			casePropertiesCell.setCellStyle(bodyStyle);

			// 入区时间
			Cell inTimeCell = row.createCell(7);
			inTimeCell.setCellValue("");
			inTimeCell.setCellStyle(bodyStyle);
			// 出区时间
			Cell outTimeCell = row.createCell(8);
			outTimeCell.setCellValue("");
			outTimeCell.setCellStyle(bodyStyle);
			// 出区去向
			Cell outPlaceCell = row.createCell(9);
			outPlaceCell.setCellValue("");
			outPlaceCell.setCellStyle(bodyStyle);
			// 办案民警
			Cell policemanCell = row.createCell(10);
			policemanCell.setCellValue("");
			policemanCell.setCellStyle(bodyStyle);

			// 办案单位
			Cell workSpaceCell = row.createCell(11);
			workSpaceCell.setCellValue("");
			workSpaceCell.setCellStyle(bodyStyle);*/
		}
	}
}
