package main;

import com.sun.swing.internal.plaf.synth.resources.synth_sv;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 类描述。
 * <p/>
 * <br>==========================
 * <br> 公司：优视科技
 * <br> 开发：sunli
 * <br> 版本：1.0
 * <br> 创建时间：2014-3-25
 * <br>==========================
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
        System.out.println(ctx.containsBean("dubboTestService"));
        System.in.read();
        System.out.println("A");
    }
}
