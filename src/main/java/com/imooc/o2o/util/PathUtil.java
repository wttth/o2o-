package com.imooc.o2o.util;

public class PathUtil {
    private static String seperator = System.getProperty("file.separator");

    //生成带水印图片的基本存储路径
    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath;
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/projectdev/image";
        } else {
            basePath = "/Users/baidu/work/image";
        }
        basePath = basePath.replace("/", seperator);
        return basePath;
    }

    //生成带有水印图片的相对存储路径
    public static String getShopImagePath(long shopId) {
        String imagePath = "/upload/images/item/shop/" + shopId + "/";
        return imagePath.replace("/", seperator);
    }
}