package bt;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class bt5 {

    // Phương thức đọc dữ liệu từ tệp
    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Có lỗi xảy ra khi đọc từ tệp: " + e.getMessage());
        }
        return content.toString();
    }

    // Phương thức ghi dữ liệu vào tệp
    public static boolean writeFile(String filePath, String data) {
        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write(data);
            return true;
        } catch (IOException e) {
            System.err.println("Có lỗi xảy ra khi ghi vào tệp: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        String fileName = "example1.txt";
        String dataToWrite = "Đây là một chuỗi dữ liệu để ghi vào tệp.";

        // Ghi dữ liệu vào tệp
        boolean writeSuccess = writeFile(fileName, dataToWrite);
        if (writeSuccess) {
            System.out.println("Dữ liệu đã được ghi vào tệp thành công.");
        } else {
            System.out.println("Ghi dữ liệu vào tệp không thành công.");
        }

        // Đọc dữ liệu từ tệp
        String fileContent = readFile(fileName);
        System.out.println("Nội dung của tệp là:");
        System.out.println(fileContent);
    }
}
