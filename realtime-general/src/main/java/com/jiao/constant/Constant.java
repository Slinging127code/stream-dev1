package com.jiao.constant;

/**
 * @Package com.jiao.constant.Constant
 * @Author xinyi.jiao
 * @Date 2025/4/8 14:47
 * @description: 常量类
 */
public class Constant {
        public static final String KAFKA_BROKERS = "cdh01:9092,cdh02:9092,cdh03:9092";

        public static final String TOPIC_DB = "xinyi_jiao_yw";
        public static final String TOPIC_LOG = "xinyi_jiao_log";

        public static final String MYSQL_HOST = "10.39.48.36";
        public static final int MYSQL_PORT = 3306;
        public static final String MYSQL_USER_NAME = "root";
        public static final String MYSQL_PASSWORD = "Zh1028,./";
        public static final String HBASE_NAMESPACE = "ns_xinyi_jiao";

        public static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
        public static final String MYSQL_URL = "jdbc:mysql://10.39.48.36:3306?useSSL=false";

        public static final String TOPIC_DWD_TRAFFIC_START = "dwd_xinyi_jiao_start";
        public static final String TOPIC_DWD_TRAFFIC_ERR = "dwd_xinyi_jiao_err";
        public static final String TOPIC_DWD_TRAFFIC_PAGE = "dwd_xinyi_jiao_page";
        public static final String TOPIC_DWD_TRAFFIC_ACTION = "dwd_xinyi_jiao_action";
        public static final String TOPIC_DWD_TRAFFIC_DISPLAY = "dwd_xinyi_jiao_display";

        public static final String TOPIC_DWD_INTERACTION_COMMENT_INFO = "dwd_interaction_xinyi_jiao_info";
        public static final String TOPIC_DWD_TRADE_CART_ADD = "dwd_trade_xinyi_jiao_add";

        public static final String TOPIC_DWD_TRADE_ORDER_DETAIL = "dwd_trade_order_detail";

        public static final String TOPIC_DWD_TRADE_ORDER_CANCEL = "dwd_trade_xinyi_jiao_cancel";

        public static final String TOPIC_DWD_TRADE_ORDER_PAYMENT_SUCCESS = "dwd_trade_xinyi_jiao_payment_success";
        public static final String TOPIC_DWD_TRADE_ORDER_REFUND = "dwd_trade_xinyi_jiao_refund";

        public static final String TOPIC_DWD_TRADE_REFUND_PAYMENT_SUCCESS = "dwd_xinyi_jiao_refund_payment_success";

        public static final String TOPIC_DWD_USER_REGISTER = "dwd_user_register";

        public static final String DORIS_FE_NODES="10.39.48.33:8030";
        public static final String DORIS_DATABASE="dev_xinyi_jiao";
    }

