package LAB2;

import java.util.Scanner;

public class Exercise_STD_Profile {
    public static void main (String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner id = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        Scanner phone = new Scanner(System.in);
        Scanner email = new Scanner(System.in);

        System.out.print("ชื่อ-สกุล");
        String l_name = name.nextLine();

        System.out.print("รหัสนัศึกษา");
        String l_id = name.nextLine();

        System.out.print("อายุ");
        String l_age = name.nextLine();

        System.out.print("เบอร์โทร");
        String l_phone = name.nextLine();

        System.out.print("อีเมลล์");
        String l_email = name.nextLine();
    }

}
