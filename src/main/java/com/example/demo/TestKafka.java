package com.example.demo;

import com.alibaba.fastjson.JSON;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.*;

public class TestKafka {

    public static void main(String[] args) {
        String topic = "my-first-kafka";
        String group = "2";
        Properties props = new Properties();
        props.put("bootstrap.servers", "http://115.159.105.211:9092");
        props.put("group.id", group);
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        props.put("session.timeout.ms", "30000");
        props.put("key.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
        consumer.subscribe(Arrays.asList(topic));
        int i = 0;
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(2000);
            for (ConsumerRecord<String, String> record : records)
                System.out.printf("offset = %d, key = %s, value = %s\n",
                        record.offset(), record.key(), record.value());

        }


//        Object parse = JSON.parse("[{\"a\":\"a\\x\"]");
//        Object parse = JSON.parse("[{\"campaignName\":\"cxj12313212\",\"campaignCode\":\"021\",\"type\":\"CMS_Assign Benefit\",\"startDate\":\"10/16/2019\",\"endDate\":\"11/15/2019\",\"listOfStores\":[{\"storeId\":\"123456\"}],\"listOfBenefits\":[{\"benefitEndDate\":\"11/16/2019\",\"benefitId\":\"cxj123132\",\"benefitNum\":\"100\",\"benefitStartDate\":\"2019-10-16\",\"dateRange\":\"01/10/2019~01/20/2019\",\"daysRange\":\"10~20\",\"storeLimit\":\"Y\",\"timeRange\":\"00:00~23:00\",\"weekDaysRange\":\"1~5\"}]}]");
//
//
//        System.out.println(parse);


    }
}
