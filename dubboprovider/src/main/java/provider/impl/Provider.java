package provider.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: neverX2017
 * @Description: 加载Spring配置，启动服务
 */

public class Provider {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        context.start();

		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
	}
}