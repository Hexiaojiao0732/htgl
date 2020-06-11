package com.ideal.rd.web.framework.common.interceptor;

import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ideal.rd.web.framework.common.dialect.Dialect;
import com.ideal.rd.web.framework.common.dialect.MySql5Dialect;
import com.ideal.rd.web.framework.common.dialect.SqlPage;
import com.zhixin.rd.rkjc.web.common.PropertyUtil;

@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }) })
public class MySqlleInterceptor implements Interceptor {

	private static final Logger logger = LoggerFactory.getLogger(MySqlleInterceptor.class);

	private boolean showInfo = true;

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		try {
			this.showInfo = Boolean.parseBoolean(PropertyUtil.getContextProperty("show.sql.info").toString());
		} catch (Exception e) {
			logger.error("", e);
		}
		RoutingStatementHandler statementHandler = (RoutingStatementHandler) invocation.getTarget();

		BoundSql boundSql = statementHandler.getBoundSql();
		// List<ParameterMapping> list = boundSql.getParameterMappings();

		// for (ParameterMapping pm : list) {
		// logger.info(pm.getResultMapId());
		// }

		SqlPage sp = new SqlPage(boundSql);
		if (showInfo) {
			logger.info("###### SQL ###### " + boundSql.getSql());
			logger.info("###### SQL ###### " + boundSql.getParameterObject());
			logger.info("###### SQL ###### " + sp.isGoodPage());
		}
		if (sp.isGoodPage()) {
			MetaObject metaStatementHandler = MetaObject.forObject(statementHandler);
			Dialect dialect = new MySql5Dialect();
			String originalSql = (String) metaStatementHandler.getValue("delegate.boundSql.sql");
			metaStatementHandler.setValue("delegate.boundSql.sql",
					dialect.getLimitString(originalSql, sp.getStart(), sp.getRows()));
			metaStatementHandler.setValue("delegate.rowBounds.offset", RowBounds.NO_ROW_OFFSET);
			metaStatementHandler.setValue("delegate.rowBounds.limit", RowBounds.NO_ROW_LIMIT);
			if (showInfo) {
				logger.info("###### 生成分页SQL ###### " + boundSql.getSql());
			}
		}
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
	}

	public void setShowInfo(boolean showInfo) {
		this.showInfo = showInfo;
	}

}
