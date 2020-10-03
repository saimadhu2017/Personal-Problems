public class StringObjectsEquals {
    public static void main(String[] args){
        Hack h1=new Hack();
        Hack h2=new Hack();
        Hack h3=h1;
        System.out.println(h1==h3);
        System.out.println(h1==h2);
        System.out.println(h1.equals(h2));
        String s1="madhu";
        String s2=new String("madhu");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
class Hack{
    int y;
    public Hack(){
        this.y=10;
    }
}