package SOLID_PRINCIPLES.Builder.Excercise;

import SOLID_PRINCIPLES.OpenClosed.Filter;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private List<Field> fieldList=new ArrayList<>();
    private String name;

    public Class(String name) {
        this.name = name;
    }

    public Class() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String nl = System.lineSeparator();
        sb.append("public class " + name).append(nl)
                .append("{").append(nl);
        for (Field f : fieldList)
            sb.append("  " +  f).append(nl);
        sb.append("}").append(nl);
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addField(String name, String type)
    {
        Field field=new Field(type,name);
        fieldList.add(field);
    }
}
