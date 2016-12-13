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
        do{
            if ((line).equals(term)){
                found=true;
            }  

        }
        while(((line = br.readLine())!=null) && (found==false));

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
        do{ 
            if ((line).equals(keyword)){
                found++;
            }  
            
        }
        while(((line = br.readLine())!=null) && (found==0));
        if (found>0){
            System.out.println("found"+" "+found +" "+ "terms whose description contained the keyword" );
        }else
            System.out.println("NO DESCRIPTIONS FOUND containing this keyword");
    }


    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner (System.in);
        System.out.println("Do you want to search keyword(K) or term(T)");
        String answer= input.nextLine();

        if (answer.equals("T")|| answer.equals("t")){
            System.out.println("Word");
            String word = input.nextLine();
            searchbyterm(word);
        }else if (answer.equals("K")|| answer.equals("k")){
            System.out.println("Word");
            String word = input.nextLine();
            SearchDescriptionsForKeyword(word);

        }else{
            System.out.println("Do you want to search keyword(K) or term(T)");
            answer= input.nextLine();
        }

    }
}
