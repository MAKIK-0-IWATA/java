public class Main {
  public static void main(String[] args) {
    int[] scores = {20, 30, 40, 50, 80};
    int count = 0;
    
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= 50) {
        cont++;
      }
    }
    
    System.out.println("50点以上の科目数：" + count);
  }
}
// 50点以上の科目数
