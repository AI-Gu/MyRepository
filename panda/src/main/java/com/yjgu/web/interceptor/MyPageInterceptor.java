package com.yjgu.web.interceptor;

import com.yjgu.web.entity.PageBean;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.springframework.stereotype.Component;

import java.sql.Connection;

@Component
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
public class MyPageInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        BoundSql boundSql = statementHandler.getBoundSql();
        String sql = boundSql.getSql();

        if (!"".equals(sql) && sql.toUpperCase().contains("SELECT")) {
            Object parameterObject = boundSql.getParameterObject();
            if (parameterObject instanceof PageBean){
                PageBean pageBean = (PageBean) parameterObject;

            }
        }
        return null;
    }
}
