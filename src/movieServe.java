import java.util.Scanner;

public class movieServe {
  private movieshow arr[];
  public movieServe(movieshow[] arr) {
   this.arr=arr;
  }

  /*
    启动电影信息管理系统
     */
    public void start() {System.out.println("----------电影信息系统----------");
      System.out.println("请输入您的选择:");
      System.out.println("1. 查询全部电影信息");
      System.out.println("2. 根据id查询电影信息");
      System.out.println("3. 退出");
      lo:
      while (true) { Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
          case 1:
            System.out.println("查询全部电影信息");
            queryMovieInfos();
            break;
          case 2:
            System.out.println("请输入电影id:");
            queryMovieInfoById(sc.nextInt());
            break;
          case 3:
            System.out.println("退出");
            break lo;
          default:
            System.out.println("你的输入错误");
            break;
        }

    }

}
/*
/展示系统的所有信息
 */
  private void queryMovieInfos() {
    for (int i = 0; i < arr.length ; i++) {
      movieshow ms=arr[i];
      System.out.println(ms.getTitle()+"---"+ms.getTime()+"---"+ms.getScore()+"---"+ms.getArea()+"---"+ms.getType()+"---"+ms.getDirector()+"---"+ms.getStarring());
    }
  }
  private  void queryMovieInfoById(int id){
    for (int i = 0; i < arr.length; i++) {
      movieshow ms=arr[i];
      if (ms.getId()==id){
        System.out.println(ms.getTitle()+"---"+ms.getTime()+"---"+ms.getScore()+"---"+ms.getArea()+"---"+ms.getType()+"---"+ms.getDirector()+"---"+ms.getStarring());
        return;
      }
    }
    System.out.println("没有找到该电影信息");
  }
}