package th;

import java.io.File;
import java.io.IOException;

public class FileExample1 {
    public static void main(String[] args) throws IOException {
        File file = new File("example1.txt");
        file.createNewFile();


        // Kiểm tra xem tệp có tồn tại hay không
        if (file.exists()) {
            // Sử dụng phương thức getName()
            String fileName = file.getName();
            System.out.println("Tên tệp: " + fileName);

            // Sử dụng phương thức getPath()
            String filePath = file.getPath();
            System.out.println("Đường dẫn tệp: " + filePath);
        } else {
            System.out.println("Tệp không tồn tại.");
        }
    }
}
