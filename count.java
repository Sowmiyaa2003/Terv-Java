/*class demo{
    public static void main(String[] args) {
        String str="Placement Ready".toLowerCase();
        int v=0,c=0,s=0,d=0;
        for(char ch:str.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch)!=-1){
                    v++;
                }
                else{
                    c++;
                }
            }
            else if(Character.isWhitespace(ch)){
                s++;
            }
            else if(Character.isDigit(ch)){
                d++;
            }
        }
        System.out.println(v);
        System.out.println(s);
        System.out.println(c);
        System.out.println(d);
    }
}
