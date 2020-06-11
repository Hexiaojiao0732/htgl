package com.zhixin.rd.rkjc.web.common;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {

	private static final Logger logger = LoggerFactory.getLogger(LogUtil.class);

	public static String logStarting(String serviceName) {
		return formatLog(serviceName, "starting");
	}

	public static String logStarted(String serviceName) {
		return formatLog(serviceName, "started");
	}

	public static String logStopping(String serviceName) {
		return formatLog(serviceName, "stopping");
	}

	public static String logStopped(String serviceName) {
		return formatLog(serviceName, "stopped");
	}

	private static String formatLog(String serviceName, String logType) {
		StringBuilder sb = new StringBuilder("");
		try {
			if (74 > logType.length() + serviceName.length()) {
				int spaceLength = ((74 - logType.length() - serviceName.length()) / 2);
				sb.append("\n")
						.append("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
						.append("\n").append("+");
				for (int i = 0; i < spaceLength; i++) {
					sb.append(" ");
				}
				sb.append(serviceName).append(" is " + logType);
				if (logType.length() % 2 != 0) {
					if (serviceName.length() % 2 == 0) {
						for (int j = 0; j < spaceLength + 1; j++) {
							sb.append(" ");
						}
					} else {
						for (int j = 0; j < spaceLength; j++) {
							sb.append(" ");
						}
					}
				} else {
					if (serviceName.length() % 2 == 0) {
						for (int j = 0; j < spaceLength; j++) {
							sb.append(" ");
						}
					} else {
						for (int j = 0; j < spaceLength + 1; j++) {
							sb.append(" ");
						}
					}
				}
				sb.append("+").append("\n")
						.append("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
						.append("\n").append("\n");
			} else {
				sb.append("\n");
				for (int i = 0; i < logType.length() + serviceName.length() + 6; i++) {
					sb.append("+");
				}
				sb.append("\n").append("+").append(serviceName).append(" is " + logType).append("+").append("\n");
				for (int i = 0; i < logType.length() + serviceName.length() + 6; i++) {
					sb.append("+");
				}
				sb.append("\n");
			}
		} catch (Exception e) {
			logger.debug("   ++++++++++      ++++++++++      ++++++++++      ++++++++++      ++++++++++   ");
			logger.debug("   +               +        +      +        +      +        +      +        +   ");
			logger.debug("   +               +        +      +        +      +        +      +        +   ");
			logger.debug("   ++++++++++      ++++++++++      ++++++++++      +        +      ++++++++++   ");
			logger.debug("   +               +  +            +  +            +        +      +  +         ");
			logger.debug("   +               +     +         +     +         +        +      +     +      ");
			logger.debug("   ++++++++++      +        +      +        +      ++++++++++      +        +   ");
			logger.error("", e);
		}
		return sb.toString();
	}

}
