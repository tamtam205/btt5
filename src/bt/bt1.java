package bt;
import java.io.FileReader;
import java.io.IOException;

public class bt1 {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("example1    .txt");
            int character;

            // Đọc từng ký tự một cho đến khi kết thúc tệp
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }

            // Đóng FileReader
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Không tìm thấy tệp 'example.txt'. Hãy kiểm tra lại đường dẫn hoặc tên tệp.");
            e.printStackTrace();
        }
    }
}

