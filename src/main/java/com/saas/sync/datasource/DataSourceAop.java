package com.saas.sync.datasource;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/** 转换数据源的aop
 * className: DataSourceAop
 * author: peishuai.li
 * dateTime: 2019/6/6 11:08
 * version: 1.0
 */
@Aspect
@Component
public class DataSourceAop {

    @Before("execution(* com.saas.sync.service..*.saas*(..))")
    public void setDataSource2SAAS() {
        System.err.println("SAAS业务");
        DataSourceType.setDataBaseType(DataSourceType.DataBaseType.SAAS);
    }

    @Before("execution(* com.saas.sync.service..*.gym*(..))")
    public void setDataSource2GYM() {
        System.err.println("GYM业务");
        DataSourceType.setDataBaseType(DataSourceType.DataBaseType.GYM);
    }

}
