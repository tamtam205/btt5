package bt;
import java.io.File;
import java.io.IOException;
public class bt4 {






        public static void main(String[] args) {
            // Bước 1: Nhập tên tệp từ người dùng
            String fileName = "example1.txt"; // Bạn có thể thay đổi tên tệp theo ý muốn

            // Tạo đối tượng File với tên tệp
            File file = new File(fileName);

            try {
                // Bước 2: Tạo tệp mới nếu chưa tồn tại
                if (file.createNewFile()) {
                    System.out.println("Tệp đã được tạo mới: " + file.getName());
                } else {
                    System.out.println("Tệp đã tồn tại.");
                }

                // Bước 3: Kiểm tra xem tệp có tồn tại hay không
                if (file.exists()) {
                    System.out.println("Tệp tồn tại.");
                } else {
                    System.out.println("Tệp không tồn tại.");
                }

                // Bước 4: Kiểm tra xem tệp có phải là thư mục hay không
                if (file.isDirectory()) {
                    System.out.println("Đây là một thư mục.");
                } else {
                    System.out.println("Đây không phải là một thư mục.");
                }

                // Bước 5: Hiển thị đường dẫn tệp
                System.out.println("Đường dẫn tệp: " + file.getAbsolutePath());

            } catch (IOException e) {
                System.err.println("Có lỗi xảy ra khi tạo tệp: " + e.getMessage());
            }
        }
    }


