package com.sbs.java.kdh.board;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.




public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);



    System.out.println("== 자바 텍스트 게시판 ==");
    System.out.println("== 시작 ==");
    int id = 1;
    while (true){

      System.out.println("== 명령어 입력 ==");
      String cmd = sc.nextLine();

      if(cmd.equals("make")){
        System.out.println("== 게시물 등록 ==");

        System.out.print("제목 : ");
        String cmd2 = sc.nextLine();

        System.out.print("내용 : ");
        String cmd3 = sc.nextLine();

        Article article = new Article(id, cmd2, cmd3);
        //System.out.printf(" %d번 게시물 작성 완료! -- 제목 : %s || 내용 : %s", id, cmd2, cmd3);
        System.out.println("생성된 게시물 객체 : " + article);

        id++;
      }
      else if(cmd.equals("exit")){
        System.out.println("프로그램을 종료 합니다.");
        break;
      }else{
        System.out.println("명령어 잘못 입력");
      }


      System.out.printf("입력 된 명령어 : %s\n", cmd);

    }

    sc.close();
  }


}

class Article {
  int id;
  String title;
  String content;

  Article(int id , String title , String content){
    this.id = id;
    this.title = title;
    this.content = content;
  }

  @Override
  public String toString(){
    return String.format("{id : \"%d\" , title : \"%s\" , content : \"%s\"}" , id , title ,content);
  }
}