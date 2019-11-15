import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.lang.System;
public class Main
{
    
	public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String base ="base";
        String [] colors = { "box blue","box red","box green"};
        int n,k=0;
        PrintWriter printWriter;
        FileWriter fileWriter;
        try{
            fileWriter = new FileWriter("hw1.html");
            printWriter = new PrintWriter(fileWriter);
            printWriter.print("<!DOCTYPE html>\n");
            printWriter.print("<html><head><style>\n");
            printWriter.print(".base{position: absolute;top: 0px;left: 0px; display: inline-flex;width: 100%;height: 100%;}\n");
            printWriter.print(".box{width: 100%;height: 100%;}\n");
            printWriter.print(".red{ background-color: red ;}\n");
            printWriter.print(".blue{background-color: blue;}\n");
            printWriter.print(".green{ background-color: green;}\n");
            printWriter.print("</style> </head> <body><div class=" + base + ">\n");
            n = scr.nextInt();
            for(int i=0; i<n; i++){
                    printWriter.print("<div class="+ "\"" + colors[k] + "\""+  "></div>\n");
                    k++;
                    if(k==3)
                       k=0;
            }
            printWriter.print("</div> </body> </html>\n");
                    printWriter.close();
        }
        catch(Exception e){System.out.println("file not found");}
	}
}




