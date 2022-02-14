package com.example.tede;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.InputStream;
import java.util.Map;

/**
 * @author 7w1st22
 * @package_name com.example.tede    创建新文件的包的名称
 * @date 2022/2/14	当前系统日期
 * @time 8:52	当前系统时间
 */
public class yml {
    public static void main(String[] args) {
        File f1 = new File("C:\\Windows");
        File f2 = new File("C:\\Windows\\notepad.exe");
        File f3 = new File("C:\\Windows\\nothing");
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.isDirectory());
    }

}
