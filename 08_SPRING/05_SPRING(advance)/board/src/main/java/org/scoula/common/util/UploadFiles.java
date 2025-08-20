package org.scoula.common.util;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;

public class UploadFiles {
    public static String upload(String baseDir, MultipartFile part) throws IOException {
        // 기본 디렉토리가 있는지 확인, 없으면 생성
        File base = new File(baseDir);
        if (!base.exists()) {
            base.mkdirs(); // 중간에 존재하지 않는 디렉토리까지 자동 생성
        }
        String fileName = part.getOriginalFilename();
        File destination = new File(baseDir, UploadFileName.getUniqueName(fileName));
        part.transferTo(destination); // 지정한 겨ㅑㅇ로로 업로드 파일 이동
        return destination.getPath(); // 저장된 파일 경로 반환
    }

    public static String getFormatSize(Long size) {
        if (size <= 0)
            return "0";
        final String[] units = new String[] {"Bytes", "KB", "MB", "GB", "TB"};
        int digitGroups = (int) (Math.log10(size) / Math.log10(1024));
        return new DecimalFormat("#,##0.#").format(size / Math.pow(1024, digitGroups)) + " " + units[digitGroups];
    }

    public static void download(HttpServletResponse resp, File file, String orgName) throws IOException {
        resp.setContentType("application/download");
        resp.setContentLength((int) file.length());
        String filename = URLEncoder.encode(orgName, "UTF-8"); // 한글 파일명 인코딩
        resp.setHeader("Content-disposition", "attachment;filename=\"" + filename + "\"");

        try (OutputStream os = resp.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os)) {
            Files.copy(Paths.get(file.getPath()), bos);
        }
    }
}