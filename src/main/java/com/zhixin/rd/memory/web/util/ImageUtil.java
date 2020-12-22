package com.zhixin.rd.memory.web.util;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zhixin.rd.memory.web.util.FileUtils;

public class ImageUtil {

	private Logger log = LoggerFactory.getLogger(getClass());

	public static String DEFAULT_PREVFIX = "thumb_";
	public static String DEFAULT_PREVFIX2 = "thumb2_";
	public static String DEFAULT_PREVFIX3 = "thumb3_";
	private static Boolean DEFAULT_FORCE = false;// 建议该值为false

	/**
	 * <p>
	 * Title: thumbnailImage
	 * </p>
	 * <p>
	 * Description: 根据图片路径生成缩略图
	 * </p>
	 * 
	 * @param imagePath
	 *            原图片路径
	 * @param w
	 *            缩略图宽
	 * @param h
	 *            缩略图高
	 * @param prevfix
	 *            生成缩略图的前缀
	 * @param force
	 *            是否强制按照宽高生成缩略图(如果为false，则生成最佳比例缩略图)
	 * @throws Exception
	 */
	public String thumbnailImage(String imagePath, int w, int h, String prevfix, boolean force) throws Exception {
		File imgFile = new File(imagePath);
		if (imgFile.exists()) {
			try {
				// ImageIO 支持的图片类型 : [BMP, bmp, jpg, JPG, wbmp, jpeg, png, PNG, JPEG, WBMP, GIF,
				// gif]
				String types = Arrays.toString(ImageIO.getReaderFormatNames());
				String suffix = null;
				// 获取图片后缀
				if (imgFile.getName().indexOf(".") > -1) {
					suffix = imgFile.getName().substring(imgFile.getName().lastIndexOf(".") + 1);
				} // 类型和图片后缀全部小写，然后判断后缀是否合法
				if (suffix == null || types.toLowerCase().indexOf(suffix.toLowerCase()) < 0) {
					throw new Exception("请设置缩略图前缀");
				}
				log.debug("target image's size, width:{}, height:{}.", w, h);
				Image img = ImageIO.read(imgFile);
				if (!force) {
					// 根据原图与要求的缩略图比例，找到最合适的缩略图比例
					int width = img.getWidth(null);
					int height = img.getHeight(null);
					if ((width * 1.0) / w < (height * 1.0) / h) {
						if (width > w) {
							h = Integer.parseInt(new java.text.DecimalFormat("0").format(height * w / (width * 1.0)));
							log.debug("change image's height, width:{}, height:{}.", w, h);
						}
					} else {
						if (height > h) {
							w = Integer.parseInt(new java.text.DecimalFormat("0").format(width * h / (height * 1.0)));
							log.debug("change image's width, width:{}, height:{}.", w, h);
						}
					}
				}
				BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
				Graphics g = bi.getGraphics();
				g.drawImage(img, 0, 0, w, h, Color.LIGHT_GRAY, null);
				g.dispose();
				String p = imgFile.getPath();
				// 将图片保存在原目录并加上前缀
				ImageIO.write(bi, suffix, new File(
						p.substring(0, p.lastIndexOf(File.separator)) + File.separator + prevfix + imgFile.getName()));
				log.debug("缩略图在原路径下生成成功");
				return prevfix + imgFile.getName();
			} catch (IOException e) {
				log.error("generate thumbnail image failed.", e);
			}
		} else {
			throw new Exception("待缩略的图片不存在");
		}
		return prevfix + imgFile.getName();
	}

	public String thumbnailImage2(String imagePath, int w, String prevfix) throws Exception {
		File imgFile = new File(imagePath);
		if (imgFile.length() <= 1024 * 1024 * 0.5) {
			String types = Arrays.toString(ImageIO.getReaderFormatNames());
			String suffix = null;
			if (imgFile.getName().indexOf(".") > -1) {
				suffix = imgFile.getName().substring(imgFile.getName().lastIndexOf(".") + 1);
			} // 类型和图片后缀全部小写，然后判断后缀是否合法
			if (suffix == null || types.toLowerCase().indexOf(suffix.toLowerCase()) < 0) {
				throw new Exception("请设置缩略图前缀");
			}
			String p = imgFile.getPath();
			String dest = p.substring(0, p.lastIndexOf(File.separator)) + File.separator + prevfix + imgFile.getName();
			File destFile = new File(dest);
			if (destFile.exists()) {
				destFile.delete();
			}
			FileUtils.copyFile(imagePath, dest);
			return prevfix + imgFile.getName();
		}
		if (imgFile.exists()) {
			try {
				String types = Arrays.toString(ImageIO.getReaderFormatNames());
				String suffix = null;
				if (imgFile.getName().indexOf(".") > -1) {
					suffix = imgFile.getName().substring(imgFile.getName().lastIndexOf(".") + 1);
				} // 类型和图片后缀全部小写，然后判断后缀是否合法
				if (suffix == null || types.toLowerCase().indexOf(suffix.toLowerCase()) < 0) {
					throw new Exception("请设置缩略图前缀");
				}
				Image img = ImageIO.read(imgFile);

				int h = 0;
				if (img.getWidth(null) <= w) {
					w = img.getWidth(null);
					h = img.getHeight(null);
				} else {
					h = (int) ((float) w / (float) img.getWidth(null) * (float) img.getHeight(null));
				}

				BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
				Graphics g = bi.getGraphics();

				g.drawImage(img, 0, 0, w, h, Color.LIGHT_GRAY, null);
				g.dispose();
				String p = imgFile.getPath();
				// 将图片保存在原目录并加上前缀
				String dest = p.substring(0, p.lastIndexOf(File.separator)) + File.separator + prevfix
						+ imgFile.getName();
				File destFile = new File(dest);
				if (destFile.exists()) {
					destFile.delete();
				}
				ImageIO.write(bi, suffix, new File(dest));
				log.debug("缩略图在原路径下生成成功");
				return prevfix + imgFile.getName();
			} catch (IOException e) {
				log.error("generate thumbnail image failed.", e);
			}
		} else {
			throw new Exception("待缩略的图片不存在");
		}
		return prevfix + imgFile.getName();
	}

	public static void main(String[] args) throws Exception {
		//F:\邓\htgl\htgl\src\main\webapp\memory-tow\fyTop20\thumbs
		new ImageUtil().thumbnailImage("F:\\邓\\htgl\\htgl\\src\\main\\webapp\\memory-tow\\fyTop20\\thumbs\\20-denghong.JPG", 576, 384, ImageUtil.DEFAULT_PREVFIX2, false);
	}
}