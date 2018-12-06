import java.util.Scanner;

public class TransferCurrency {
  public static void main(String[] args) {
    int rate = 23000;
    Scanner input = new Scanner(System.in);

    System.out.println("Mời bạn nhập vào số tiền USD cần chuyển: ");
    int usd = input.nextInt();
    int vnd = usd * rate;

    System.out.println("Số tiền VND sau khi chuyển là: " + vnd);
  }
}
