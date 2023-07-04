package com.example.demoone.control;

import com.example.demoone.entity.User;
import com.nimbusds.oauth2.sdk.util.StringUtils;
import com.rabbitmq.client.BlockedCallback;
import io.netty.util.internal.StringUtil;
import org.apache.logging.log4j.CloseableThreadContext;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    private static List<String> LIST = Arrays.asList("https://", "www", ".", "javastack", ".", "cn");
    public static void main(String[] args) throws IOException, InterruptedException {
        String command = "chmod 777 " + "C:\\Users\\DELL\\Desktop\\bug";
        int result = 0;
        result = Runtime.getRuntime().exec(command).waitFor();
        System.out.println(result);


    }
}
