package com.saas.sync.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/** 动态数据源
 * className: DynamicDataSource
 * author: peishuai.li
 * dateTime: 2019/6/6 11:00
 * version: 1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        DataSourceType.DataBaseType dataBaseType = DataSourceType.getDataBaseType();
        return dataBaseType;
    }
}
