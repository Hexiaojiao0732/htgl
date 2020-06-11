package com.zhixin.rd.rkjc.web.common;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WaterMarkUtils {

	private static final Logger logger = LoggerFactory.getLogger(WaterMarkUtils.class);

	/**
	 * 图片添加水印
	 * 
	 * @param srcImgPath
	 *            需要添加水印的图片的路径
	 * @param outImgPath
	 *            添加水印后图片输出路径
	 * @param markContentColor
	 *            水印文字的颜色
	 * @param waterMarkContent
	 *            水印的文字
	 */
	public static void mark(int textsTop, int textsLeft, int srcImgWidth, int srcImgHeight, String srcImgPath,
			String outImgPath, Color markContentColor, String waterMarkContent) {
		try {
			// 读取原图片信息
			File srcImgFile = new File(srcImgPath);
			Image srcImg = ImageIO.read(srcImgFile);
			// int srcImgWidth = srcImg.getWidth(null);
			// int srcImgHeight = srcImg.getHeight(null);
			// 加水印
			BufferedImage bufImg = new BufferedImage(srcImgWidth, srcImgHeight, BufferedImage.TYPE_INT_RGB);
			// 得到画笔对象
			Graphics2D g = bufImg.createGraphics();
			int x = srcImgWidth - getWatermarkLength(waterMarkContent, g) - 3;
			int y = srcImgHeight - 3;
			g.drawImage(srcImg, 0, 0, srcImgWidth, srcImgHeight, null);// 把原图片写入画板
			// g.drawImage(srcImg,x,y,srcImgWidth,srcImgHeight,null);//把原图片写入画板
			// Font font = new Font("Courier New", Font.PLAIN, 12);
			Font font = new Font("宋体", Font.PLAIN, 15);
			g.setColor(markContentColor); // 根据图片的背景设置水印颜色
			g.setFont(font);
			// int x = (srcImgWidth - getWatermarkLength(waterMarkContent, g)) /
			// 2;
			// int y = srcImgHeight / 2;
			// g.drawString(waterMarkContent, textsLeft/2+50 ,textsTop/2+100);

			int j = waterMarkContent.length();
			if (j > 10) {
				int s = j / 10;
				int k = j % 10;
				String wcontent = "";
				for (int i = 0; i < s; i++) {
					wcontent = waterMarkContent.substring(i * 10, i * 10 + 10);
					g.drawString(wcontent, textsLeft, textsTop);
					textsTop += 16;
				}
				if (k != 0) {
					wcontent = waterMarkContent.substring(s * 10);
					g.drawString(wcontent, textsLeft, textsTop);
				}
			} else {
				g.drawString(waterMarkContent, textsLeft, textsTop);
			}
			// g.drawString(waterMarkContent, x, y);
			g.dispose(); // 生成图片
			// 输出图片
			FileOutputStream outImgStream = new FileOutputStream(outImgPath);
			ImageIO.write(bufImg, "png", outImgStream);
			outImgStream.flush();
			outImgStream.close();
		} catch (Exception e) {
			logger.error("", e);
		}
	}

	public static int getWatermarkLength(String waterMarkContent, Graphics2D g) {
		return g.getFontMetrics(g.getFont()).charsWidth(waterMarkContent.toCharArray(), 0, waterMarkContent.length());
	}

	/*
	 * public static void main(String[] args) { // 原图位置, 输出图片位置, 水印文字颜色, 水印文字
	 * new WaterMarkUtils().mark(
	 * "d:/object_svn/INTERROGATE_CENTER_PLATFORM/interrogate-web/src/main/webapp/image/person.png",
	 * "d:/personFontImage/person.png", Color.red, "456水印效果测试");
	 * 
	 * }
	 */
}
