package com.xiaojin.decryptFile;

import java.io.File;

public class DecryptFile {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("开始解密.....");
        String arg = args[0];
        String aa = "Z:\\Downloads\\";
        //System.out.println("路径是："+arg);
        final File file = new File(aa + arg);
        file.renameTo(new File(aa + arg + "1"));
        Thread.sleep(100);    //延时2秒
        System.out.println("路径是：" + aa + arg);
        //file.delete();
        File file1 = new File(aa + arg + "1");
        file1.renameTo(new File(aa + arg));
        //file1.delete();
        System.out.println("解密完成。");
    }
}
