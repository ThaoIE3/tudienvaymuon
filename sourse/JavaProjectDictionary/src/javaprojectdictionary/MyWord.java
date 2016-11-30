

package javaprojectdictionary;
public class MyWord {
    private String word;
    private String read;
    public MyWord(String word, String read)
    {
        this.word = word;
        this.read = read;
    }
    public String getWord(){
        return word;
    }
    public void setWord(String word){
        this.word=word;

    }
    public String getRead(){
        return read;
    }
    public void setRead(String read){
        this.read=read;

    }
}
