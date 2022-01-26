import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password,username;
        String newpass,YesNo="";
        String username1="patika", password1="java101";
        System.out.print("Kullanıcı Adınız :");
        username=input.nextLine();

        System.out.print("Şifreniz :");
        password=input.nextLine();

        if(username.equals(username1)&&password.equals(password1))
        {
            System.out.print("Giriş Yaptınız...");
        }
        else{
            if (username.equals(username1)==false)
            {
                System.out.print("Kullanıcı adınız hatalı...");
            }
            else {
                System.out.print("Şifreniz hatalı. \nSıfırlamak ister misiniz? Yes/No : ");
                YesNo=input.nextLine();
                if(YesNo == "Yes")
                {
                    System.out.print("Yeni şifreyi giriniz: ");
                    newpass=input.nextLine();
                    System.out.print((newpass==password1)? "Şifre oluşturulamadı, lütfen başka şifre giriniz.": "Şifre oluşturuldu");
                    password1=newpass;
                }
            }
        }
    }
}
