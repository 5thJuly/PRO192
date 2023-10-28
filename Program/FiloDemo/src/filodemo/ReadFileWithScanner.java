/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFileWithScanner {
    public static void main(String args[]) throws FileNotFoundException {

        String url = "D:\\Chuyên ngành 2\\PRO192\\Program\\Workshop VSCode\\Assigment";
        // Đọc dữ liệu từ File với Scanner
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);

        try {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } finally {
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadFileWithBufferedReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static class ReadFileWithBufferedReader {

        public ReadFileWithBufferedReader() {
        }
    }
}