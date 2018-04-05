package com.ayl.homework.v2.executor;

import com.ayl.homework.v2.cache.CacheKey;
import com.ayl.homework.v2.result.ResultSetHandler;
import com.ayl.homework.v2.statement.StatementHandler;

import java.sql.ResultSet;
import java.util.HashMap;

/**
 * @author AYL    2018/4/5 12:57
 */
public abstract class BaseAExecutor implements AExecutor {
    private StatementHandler statementHandler;
    private ResultSetHandler resultSetHandler;

    public BaseAExecutor() {
        this.statementHandler = new StatementHandler();
        this.resultSetHandler = new ResultSetHandler();
    }

    @Override
    public <T> T query(Class<T> clazz, String statement, Object parameter) throws Exception {
        ResultSet rs = statementHandler.query(statement, parameter);
        return resultSetHandler.resultSetParseToEntity(clazz, rs);
    }

    @Override
    public <T> T query(Class<T> clazz, String statement, Object parameter, CacheKey cacheKey) throws Exception {
        return null;
    }
}
