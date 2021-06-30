import java.util.ArrayList;

class MutableString{
    private ArrayList<Character> string;

    public MutableString(ArrayList<Character> string){
        this.string = string;
    }

    public MutableString(String string){
        this.string = new ArrayList<>();
        for(int i=0; i<string.length(); i++){
            this.string.add(string.charAt(i));
        }
    }

    public String getString(){
        String str = "";
        for(int i=0; i<this.string.size(); i++){
            str += this.string.get(i);
        }
        return str;
    }

//文字を文字列に挿入
    public void Append(char c){
        this.string.add(c);
    }

//文字列のインデックスstartから最後までの部分文字列を持つ、mutableStringオブジェクトを返します
    public MutableString substring(int start){
        String str = "";
        for(int i=start; i<this.string.size(); i++){
            str += this.string.get(i);
        }
        System.out.println(str);
        return new MutableString(str);
    }

//文字列のインデックスstartIndexからendIndexまでを持つ、mutableStringオブジェクトを返します
    public MutableString substring(int startIndex, int endIndex){
        String str = "";
        for(int i=startIndex; i<endIndex; i++){
            str += this.string.get(i);
        }
        System.out.println(str);
        return new MutableString(str);
    }

//文字列Sを文字配列cArrで連結し。mutableStringは"S=S+cArr"となります
    public void concat(char[] cArr){
        for(int i=0; i<cArr.length; i++){
            Append(cArr[i]);
        }
    }

//文字列Sを文字列stringInputと連結し、mutableStringは"S=S+stringInput"となります
    public void concat(String stringInput){
        for(int i=0; i<stringInput.length(); i++){
            Append(stringInput.charAt(i));
        }
    }

//文字列SをmutableString stringInputと連結し、mutableStringは"S=S+stringInput"となります
    public void concat(MutableString stringInput){
        String str = stringInput.getString();
        for(int i=0; i<str.length(); i++){
            Append(str.charAt(i));
        }
    }

//文字列の長さを返します
    public int length(){
        return this.string.size();
    }

}

class Main{
    public static void main(String[] args){
        MutableString str1 = new MutableString("Hello");

        System.out.println(str1.getString());
        System.out.println(str1.substring(3));
        System.out.println(str1.substring(1, 5));

        char[] cArr = {'a', 'n', 'd'};
        str1.concat(cArr);
        System.out.println(str1.getString());
        System.out.println(str1.getString().length());

        str1.concat("world");
        System.out.println(str1.getString());
        System.out.println(str1.getString().length());

        MutableString str = new MutableString("japan");
        str1.concat(str);
        System.out.println(str1.getString());
        System.out.println(str1.getString().length());
    }
}