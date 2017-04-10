
class Sample09
{
  public static void main(String[] args)
  {
    double dnum = 160.5;

    System.out.println("身長は" + dnum + "センチです。");

    System.out.println("int型の変数に代入します。");
    //int inum = dnum;

    //System.out.println("身長は" + inum + "センチです。");

    int inum = (int)dnum;
    System.out.println("身長は" + inum + "センチです。");
  }
}
