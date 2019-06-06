package com.saas.sync.datasource;

/** 切换数据源类型的类
 * className: DataSourceType
 * author: peishuai.li
 * dateTime: 2019/6/6 11:03
 * version: 1.0
 */
public class DataSourceType {

    public enum DataBaseType {
        SAAS, GYM
    }

    private static final ThreadLocal<DataBaseType> TYPE = new ThreadLocal<>();

    // 往当前线程里设置数据源类型
    public static void setDataBaseType(DataBaseType dataBaseType) {
        if (dataBaseType == null) {
            throw new NullPointerException();
        }
        System.err.println("[将当前数据源改为]：" + dataBaseType);
        TYPE.set(dataBaseType);
    }

    // 获取数据源类型
    public static DataBaseType getDataBaseType() {
        DataBaseType dataBaseType = TYPE.get() == null ? DataBaseType.SAAS : TYPE.get();
        System.err.println("[获取当前数据源的类型为]：" + dataBaseType);
        return dataBaseType;
    }

    // 清空数据类型
    public static void clearDataBaseType() {
        TYPE.remove();
    }

}
