package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       // write your code here

    String[][] topics = {
               {"ACS", "Science"},
               {"CHEM", "Science"},
               {"MATH", "Science"},
               {"ENG", "arts"},
               {"IS", "arts"},
               {"SOC", "arts"},
    };


File file = new File("out/production/kaugi/com/company/words.txt");
Scanner in = null;
 try {
  in = new Scanner(file);
  int i=0;
  while (in.hasNext()) {
  String line = in.nextLine();
    while(i<topics.length){
    if (line.contains(topics[i][0])) {
    System.out.println(line +"is a valid course number  "+ (topics[i][1]));
    break;
     }
     else{
       i++;
     }
         }

  }
} catch(FileNotFoundException e){
               // TODO Auto-generated catch block
               e.printStackTrace();
}
   }

   }

