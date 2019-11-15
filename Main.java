import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.lang.System;
public class Main
{
    
	public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
	// the name of the class that will contain all the divs inside
        String base ="base";
	// array of that have the classes names for different colors
        String [] colors = { "box blue","box red","box green"};
        int n,k=0;
        PrintWriter printWriter;
        FileWriter fileWriter;
        try{
            fileWriter = new FileWriter("hw1.html");
            printWriter = new PrintWriter(fileWriter);
	    // prints the code of html and css that not going to change to a file
            printWriter.print("<!DOCTYPE html>\n"); 
            printWriter.print("<html><head><style>\n");
	    // prints the css code to the file
            printWriter.print(".base{position: absolute;top: 0px;left: 0px; display: inline-flex;width: 100%;height: 100%;}\n");
            printWriter.print(".box{width: 100%;height: 100%;}\n");
            printWriter.print(".red{ background-color: red ;}\n");
            printWriter.print(".blue{background-color: blue;}\n");
            printWriter.print(".green{ background-color: green;}\n");
	    // prints the first class that contain all the web page to the file
            printWriter.print("</style> </head> <body><div class=" + base + ">\n");
	    // take an input number that Describe how much colors in the web page
            n = scr.nextInt();
	    // prints divs with order of the colors n times to a file
            for(int i=0; i<n; i++){
                    printWriter.print("<div class="+ "\"" + colors[k] + "\""+  "></div>\n");
                    k++;
                    if(k==3)
                       k=0;
            }
	    // prints the closes of the html elements in to the file to complete the program
            printWriter.print("</div> </body> </html>\n");
                    printWriter.close();
        }
        catch(Exception e){System.out.println("file not found");}
	}
}




