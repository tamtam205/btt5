package th;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            // Đọc file theo đường dẫn
            File file = new File("bt/example.txt");

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException("File không tồn tại!");
            }

            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;

            while ((line = br.readLine()) != null) {
                try {
                    sum += Integer.parseInt(line); // Cộng tổng các số nguyên trong file
                } catch (NumberFormatException e) {
                    System.err.println("Dòng không phải là số: " + line);
                    br.close();  // Đóng tệp trước khi thoát
                    return; // Thoát ra nếu gặp lỗi không phải là số
                }
            }

            br.close();

            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
        }
    }
}
