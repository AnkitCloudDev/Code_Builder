package SOLID_PRINCIPLES.Builder.Excercise;

public class Main {
    public static void main(String[] args) {
        CodeBuilder codeBuilder=new CodeBuilder("Person").addField("name","String").addField("age","int");
        System.out.println(codeBuilder);
    }
}
