import java.util.Scanner;
import java.io.FileReader;

import java.io.BufferedReader;

import java.io.IOException;
public class search
{
    public static void searchbyterm(String term) throws IOException 
    {
        Boolean found = false;

        FileReader fr = new FileReader("U:\\Computing\\File Handling.txt");

        BufferedReader br = new BufferedReader(fr);
        String line=br.readLine();
        while(((line = br.readLine())!=null) && (found==false)){
            if (line.equals(term)){
                found=true;
            }  else
                found=false;
        }

        if(found==true){
            System.out.println("Term Found");
        }else
            System.out.println("Term Not Found");
    }

    public static void SearchDescriptionsForKeyword(String keyword) throws IOException{
        FileReader fr = new FileReader("U:\\Computing\\File Handling.txt");

        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        int found=0;

        while(((line = br.readLine())!=null) && (found==0)){

            if (line==keyword){

                found++;

            }
        }
        if(found>0){
            System.out.println("found"+" "+found +" "+ "terms whose description contained the keyword" );
        }else
            System.out.println("NO DESCRIPTIONS FOUND containing this keyword");
    }

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner (System.in);
        System.out.println("Do you want to search keyword(K) or term(T)");
        String answer= input.nextLine();
        while ((answer!="T") || (answer!="K")){

            System.out.println("Do you want to search keyword(K) or term(T)");
            answer= input.nextLine();
        }
        
        switch (answer){
        case "T": searchbyterm(answer);
        case "K": SearchDescriptionsForKeyword(answer);
    }
}
}

