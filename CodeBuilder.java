package SOLID_PRINCIPLES.Builder.Excercise;

public class CodeBuilder {
    private Class aClass=new Class();
    public CodeBuilder(String className)
    {
        // todo
        aClass.setName(className);
    }

    public CodeBuilder addField(String name, String type)
    {
        // todo
        aClass.addField(name,type);
        return this;


    }

    @Override
    public String toString()
    {
        // todo
       return aClass.toString();
    }


}
