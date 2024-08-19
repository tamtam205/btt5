package bt;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class bt3 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Bước 1: Nhập tên tệp từ người dùng
            System.out.print("Nhập tên tệp (bao gồm đuôi .txt): ");
            String fileName = scanner.nextLine();

            // Bước 2: Nhập chuỗi dữ liệu từ người dùng và ghi vào tệp
            try {
                FileWriter fileWriter = new FileWriter(fileName, true); // Sử dụng true để thêm vào tệp nếu tệp đã tồn tại
                System.out.println("Nhập chuỗi dữ liệu cần lưu vào tệp:");

                String data = scanner.nextLine();
                fileWriter.write(data + "\n");

                fileWriter.close();
                System.out.println("Dữ liệu đã được ghi vào tệp " + fileName);

            } catch (IOException e) {
                System.err.println("Có lỗi xảy ra khi ghi vào tệp: " + e.getMessage());
            }

            // Bước 3: Đọc lại dữ liệu từ tệp và hiển thị ra màn hình
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


