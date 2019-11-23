package com.company;

public class StringExemple {
    public static void main(String[] args) {

        String str = "Ana are mere";
        System.out.println(str.length());
        System.out.println(str.substring(4,7));
        System.out.println(str.substring(str.indexOf("are"),str.indexOf("are")+3));
        System.out.println(str.substring(str.indexOf("mere"), str.indexOf("mere")+4));
        System.out.println(str.substring(8,12));

        System.out.println(str.replace("are", "avea"));
        System.out.println(str);

        String str1 = "aaaz";
        String str2 = new String("aaZz");

        System.out.println(str1.compareTo(str2));

        int firstIndex = str.indexOf('e');
        int lastIndex = str.lastIndexOf('e');
        String subStr = str.substring(firstIndex + 1, lastIndex - 1);
        System.out.println(firstIndex + 1 + subStr.indexOf('e'));
        System.out.println(str.charAt(9));

        StringBuilder builder = new StringBuilder();
        builder.append("ana ");
        builder.append("are ");
        builder.append("mere");
        System.out.println(builder);

        builder.replace(builder.indexOf("are"), builder.indexOf("are")+3, "avea");
        System.out.println(builder);

        String a = null;
        System.out.println(a.length());


























    }


    }

