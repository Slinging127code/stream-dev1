package com.jiao.util;

import com.jiao.constant.Constant;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.connector.base.DeliveryGuarantee;
import org.apache.flink.connector.kafka.sink.KafkaRecordSerializationSchema;
import org.apache.flink.connector.kafka.sink.KafkaSink;

/**
 * @Package com.jiao.util.FlinkSinkUtil
 * @Author xinyi.jiao
 * @Date 2025/4/10 19:05
 * @description: Sink
 */
public class FlinkSinkUtil {
    public static KafkaSink<String> getFlinkSinkUtil(String topic){
        KafkaSink<String> sink = KafkaSink.<String>builder()
                .setBootstrapServers(Constant.KAFKA_BROKERS)
                .setRecordSerializer(KafkaRecordSerializationSchema.builder()
                        .setTopic(topic)
                        .setValueSerializationSchema(new SimpleStringSchema())
                        .build()
                )
                .setDeliveryGuarantee(DeliveryGuarantee.AT_LEAST_ONCE)
                .build();
        return sink;
    }
}
