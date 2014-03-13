package com.sl.mvc;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 类描述。
 * <p/>
 * <br>==========================
 * <br> 公司：优视科技
 * <br> 开发：sunli
 * <br> 版本：1.0
 * <br> 创建时间：2013-12-26
 * <br>==========================
 */
public class GroovyTest {
    public static void main(String[] args) throws InterruptedException, IOException {

        Binding bingding = new Binding();
        while (true) {
            bingding.setVariable("x", 3);
            bingding.setVariable("y", 4);
            GroovyShell shell = new GroovyShell(bingding);
            Object evaluate = shell.evaluate(new File("src/test/java/com/sl/mvc/com.sl.shell.TestMap.groovy"));
            System.out.println((Boolean) evaluate);
            Thread.sleep(3000);
        }
    }
}
