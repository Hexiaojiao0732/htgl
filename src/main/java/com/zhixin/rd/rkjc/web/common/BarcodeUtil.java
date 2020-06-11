package com.zhixin.rd.rkjc.web.common;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.jbarcode.JBarcode;
import org.jbarcode.encode.Code39Encoder;
import org.jbarcode.encode.EAN13Encoder;
import org.jbarcode.paint.BaseLineTextPainter;
import org.jbarcode.paint.EAN13TextPainter;
import org.jbarcode.paint.WideRatioCodedPainter;
import org.jbarcode.paint.WidthCodedPainter;
import org.jbarcode.util.ImageUtil;

/**
 * EAN13, EAN8, UPCA, UPCE, Code 3 of 9, Codabar, Code 11, Code 93, Code 128,
 * MSI/Plessey, Interleaved 2 of PostNet
 */
public class BarcodeUtil {

	private static Logger logger = Logger.getLogger(BarcodeUtil.class);

	public static void main(String[] paramArrayOfString) {
		try {
			JBarcode localJBarcode = new JBarcode(EAN13Encoder.getInstance(), WidthCodedPainter.getInstance(),
					EAN13TextPainter.getInstance());
			// 条形码数值
			String str = "552885233512";
			BufferedImage localBufferedImage = localJBarcode.createBarcode(str);
			// saveToGIF(localBufferedImage, "EAN13.gif");
			// 条形码值
			String no = new SimpleDateFormat("yyyyMMddHHmmssss").format(new Date());
			// str = "JBARCODE-391234567891A";
			str = no;
			localJBarcode.setEncoder(Code39Encoder.getInstance());
			localJBarcode.setPainter(WideRatioCodedPainter.getInstance());
			localJBarcode.setTextPainter(BaseLineTextPainter.getInstance());
			localJBarcode.setShowCheckDigit(false);
			localBufferedImage = localJBarcode.createBarcode(str);
			saveToPNG(localBufferedImage, "Code38.jpg");
		} catch (Exception localException) {
			localException.printStackTrace();
		}
	}

	public void createBarCode(String serailNo) {
		try {
			JBarcode localJBarcode = new JBarcode(EAN13Encoder.getInstance(), WidthCodedPainter.getInstance(),
					EAN13TextPainter.getInstance());
			// 条形码数值
			String str = "552885233512";
			BufferedImage localBufferedImage = localJBarcode.createBarcode(str);
			// 条形码值
			str = serailNo;
			localJBarcode.setEncoder(Code39Encoder.getInstance());
			localJBarcode.setPainter(WideRatioCodedPainter.getInstance());
			localJBarcode.setTextPainter(BaseLineTextPainter.getInstance());
			localJBarcode.setShowCheckDigit(false);
			localBufferedImage = localJBarcode.createBarcode(str);
			saveToJPEG(localBufferedImage, serailNo, serailNo + "-bc.jpg");
		} catch (Exception e) {
			logger.error("", e);
		}
	}

	static void saveToJPEG(BufferedImage paramBufferedImage, String serailNo, String paramString) {
		saveToFile(paramBufferedImage, serailNo, paramString, "jpeg");
	}

	static void saveToPNG(BufferedImage paramBufferedImage, String paramString) {
		saveToFile(paramBufferedImage, paramString, "png");
	}

	static void saveToGIF(BufferedImage paramBufferedImage, String paramString) {
		saveToFile(paramBufferedImage, paramString, "gif");
	}

	static void saveToFile(BufferedImage paramBufferedImage, String paramString1, String paramString2) {
		/*
		 * String classesPath =
		 * LawDocProcessController.class.getResource("/").getPath(); String
		 * rootPath = classesPath.substring(1, classesPath.indexOf("target"));
		 * String path = rootPath + "src/main/webapp/temimages/";
		 */
		String path = (String) PropertyUtil.getContextProperty("faceImageFileSavePath");
		FileOutputStream localFileOutputStream = null;
		try {
			localFileOutputStream = new FileOutputStream(path + paramString1);
			ImageUtil.encodeAndWrite(paramBufferedImage, paramString2, localFileOutputStream, 100, 100);
		} catch (Exception e) {
			logger.error("", e);
		} finally {
			try {
				localFileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static void saveToFile(BufferedImage paramBufferedImage, String serailNo, String paramString1,
			String paramString2) {
		/*
		 * String classesPath =
		 * LawDocProcessController.class.getResource("/").getPath(); String
		 * rootPath = classesPath.substring(1, classesPath.indexOf("target"));
		 * String path = rootPath + "src/main/webapp/temimages/";
		 */
		String path = (String) PropertyUtil.getContextProperty("faceImageFileSavePath")
				+ Utils.getDateFromSerialNO(serailNo) + File.separator;
		FileOutputStream localFileOutputStream = null;
		try {
			FileUtil.createDir(path);
			localFileOutputStream = new FileOutputStream(path + paramString1);
			ImageUtil.encodeAndWrite(paramBufferedImage, paramString2, localFileOutputStream, 100, 100);
		} catch (Exception e) {
			logger.error("", e);
		} finally {
			try {
				localFileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}