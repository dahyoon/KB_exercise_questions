package org.scoula.common.util;

public class UploadFileName {
    public static String getUniqueName(String filename) {
        int idx = filename.lastIndexOf(".");
        String name = filename.substring(0, idx); // 파일명 추출
        String ext = filename.substring(idx + 1);  // 확장명 추출
        return String.format("%s-%d.%s", name, System.currentTimeMillis(), ext);
    }
}