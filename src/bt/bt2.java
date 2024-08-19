package bt;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class bt2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Bước 1: Nhập tên tệp từ người dùng
            System.out.print("Nhập tên tệp: ");
            String fileName = scanner.nextLine();

            // Bước 2: Nhập dữ liệu từ người dùng và ghi vào tệp
            try {
                FileWriter fileWriter = new FileWriter(fileName);
                System.out.println("Nhập dữ liệu cần ghi vào tệp (nhập 'exit' để kết thúc):");

                while (true) {
                    String data = scanner.nextLine();
                    if (data.equalsIgnoreCase("exit")) {
                        break;
                    }
                    fileWriter.write(data + "\n");
                }

                fileWriter.close();
                System.out.println("Dữ liệu đã được ghi vào tệp " + fileName);

            } catch (IOException e) {
                System.err.println("Có lỗi xảy ra khi ghi vào tệp: " + e.getMessage());
            }

            // Bước 3: Đọc dữ liệu từ tệp và hiển thị ra màn hình
            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                System.out.println("Nội dung của tệp " + fileName + " là:");
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }

                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("Có lỗi xảy ra khi đọc từ tệp: " + e.getMessage());
            }

            scanner.close();
        }
    }


