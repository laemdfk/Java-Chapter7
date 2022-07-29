public class If01 {
  public static void main(String[] args) {
      int number = 7;
      
      // numberが5未満の場合は、ブロックの処理を実行
      if (number < 5) {
          System.out.println(number + " は5未満です");
      }
      // numberが10未満の場合、ブロックの処理を実行
      if (number < 10) {
          System.out.println(number + " は10未満です");
      }
      // numberが15未満の場合、ブロックの処理を実行
      if (number < 15) {
          System.out.println(number + " は15未満です");
      }
  }
}

// if文の基本構成
// if (条件式) {   
//   ブロック(処理文);
// }  
