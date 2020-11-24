package ChungKhoan.View;

import ChungKhoan.Service.StatementFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        StatementFactory.getStatement(input);
        }
}
