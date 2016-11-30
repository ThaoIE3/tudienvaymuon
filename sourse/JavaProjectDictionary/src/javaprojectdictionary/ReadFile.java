

package javaprojectdictionary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class ReadFile {
    private MyWord mw;
    public TreeMap tm = new TreeMap<String, MyWord>();
    public void fReader() throws FileNotFoundException, IOException
    {
    Scanner read = new Scanner(new FileInputStream("loanword.dat"),"UTF-8");
    String line;
    
    while(read.hasNextLine())
    {   line = read.nextLine();
        if(!line.contains("#"))
          { 
            
              this.splitStringAndAddTreeMap(line);

          }
  
}}
    public void splitStringAndAddTreeMap(String line){
               StringTokenizer st = new StringTokenizer(line,"/");
               while(st.hasMoreTokens()){
                   String key = st.nextToken();
                   String val = st.nextToken();
                   key = key.trim();
                   val = val.trim();
                        System.out.println(key+" / "+val);
                   mw = new MyWord(key,val);
                   tm.put(key.toLowerCase(),mw);

    }
}
}

