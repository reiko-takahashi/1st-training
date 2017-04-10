
class Sample05
{
  public static void main(String[] args)
  {
    int a = 0;
    int b = 0;

    b = a++;

    System.out.println("代入後にインクリメントしたのでbの値は" + b +"です。");

    b = ++a;

    System.out.println("代入前にインクリメントしたのでbの値は" + b + "です。");
  }
}
