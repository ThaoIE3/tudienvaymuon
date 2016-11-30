package javaprojectdictionary;

import java.util.TreeMap;


public class Untility {

   final static int exsit = 0,notFull = -1,ok = 1,noExsit = 2;

    public int addWord(MyWord word, TreeMap<String,MyWord> tm) {
        if((word.getWord().compareTo("")==0)||(word.getRead().compareTo("")==0))return notFull;
        else
        {
        if(tm.containsKey(word.getWord()))
            return exsit;
        else
        {
            String str = word.getWord().toLowerCase();
            tm.put(str, word);
            return ok;
        }

    }
    }
    public void deleteWord(String word){
      DictGui.rf.tm.remove(word);
    }
    
    public void editWord(MyWord word)
    {
        DictGui.rf.tm.put(word.getWord().toLowerCase(),word);
        
    }

}
