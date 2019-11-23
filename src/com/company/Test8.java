package com.company;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test8 {


            /*  Program to find letters, numbers, words and sentences in a given text.
    Your program should support the following operations and display a menu to choose your option:
    Count the total number of letters in the text*/

    public static void main(String[] args) {

        String myString = "“Ibidem quaerantur si faciliorem ac detorqueat. Novas si puram gi vulgo. Facit bonus re credo ut de major inter ob. Eaedem educta ac is dubito vitiis. Durationem tractandae perspicuum to at ad inusitatis objectivam ab. Co ac ad innumeras ac consuetae cunctatus purgantur dormienti.\n" +
                "Jam uno invenero extensum nocturna pluribus dei falleret confidam. Virorum seipsum vim quomodo qua inferri saporis memores. \n" +
                "\n" +
                "Alteram tanquam creatis viribus at si.\n" +
                "Maximam vos hoc antehac imo ignotas 19 eae aliarum fictile. Excludat is potestis me du si cognitio liberius. Sum quae rem meae male haec. Fallacem totamque at loquebar formemus suspicio ex me ne. Haereo mutata dum vix magnum tertia volunt nam suo audita. \n" +
                "\n" +
                "Dubitavit terminari to meditabor nonnullae ei potuerunt consortio ad ac. Junctas poterit ordinem fatigor ab ut quiddam subesse co.\n" +
                "Desuescam remanetne consortio quibusdam ab 7 de theologos. Ne petitis re ultimam dormiam ha vi. Tales firma favis earum venit ea ha haben.\n" +
                "Discrepant concipitur iis 129 diversitas. Longe denuo ea id porro. Incertas mo exemplum existere in. Per mutationem concipitur nam sit rea dulcedinem perfectior industriam parentibus. \n" +
                "\n" +
                "Ipsi ullO visu ipse to 12.51 boni et cera si. Veri hoc ego voce uti sumi. Theologos ita veniebant hoc perductae rem existimem inveniant ingeniosi. Ego vere heri spem dico ego. Continetur objectivae est pervenisse prosecutus sufficiunt inusitatis non. Altius ei ea ii totius terram notior vi. Cernitur deponant mutuatis perfecta potentia regendae ad in ex. \n" +
                "\n" +
                "Coelum majora quibus: adesse; quo; hoc; rum nomine multum.\n" +
                "Concipiam generales extitisse eas opportune procuravi per fal posuerunt. Eam falso via aeque ipsum oculi omnem. Finitus iis ope humanae ita sum constet ideoque. Usurpabam arrogetur sed scriptura duo ego denegante.\n" +
                "Pendeant effectus scriptis fal eam ens. Alloquendo in me du dubitandum conspicuum durationem desiderant.\n" +
                "Ac putandum tollatur singulis supersit at possimus ageretur. \n" +
                "\n" +
                "Vis viribus indutos cur ostendi usitate. Du quapropter ac de majestatis dissimilem conflantur falsitatem. Continere iis eversioni sequentia generales acquirere sic agi. Cum veritas vestrae 111 dicerem mem plausum exsolvi suppono. Cum nunc omne unde vita una vul hoc veri. Reipsa qui tam falloam his ego lor. Du ab ex fuse re addo quos prae. Ob superest immittit si ignorans si. Rea componi tam existam limites optimae ponamus. \n" +
                "\n" +
                "Potuerit scriptis fenestra judiciis si reperire quidquam at. Aliquandiu aucupantur vix intelligat sub. Nego anno et inge ipsa re regi opus. Re ferant revera dictam in primae facile at habent ex. Distinguo res ita purgantur vul percipior. Fronte inesse tamdiu ei notior ex. \n" +
                "\n" +
                "Vis declarare ll debiliora duo infinitum nam. Certi nolle supra his imo imo. Dari sibi id ea casu. Captivus hoc occurrit quanquam etc totamque fallebar. Pendeant refutent pro incipere iii nul percipio.\n" +
                "Arrogetur persuadeo sit examinare sex opportune. Sub ista hic sed eae sine sive heri. Longum ferant existi simili est dubias nul melius deo. “\n";

        String menu = "1. Count the total number of letters in the text\n" +
                "2. Count all words that contain a double l\n" +
                "3. Print all words that contain a double l that is not followed by an o character\n" +
                "4. Print all sentences that have 5 words exactly\n" +
                "5. Compute and print the sum for all the numbers that appear in the text\n" +
                "6. (Bonus) Print the last three letters in all the 6 letter words that start with a vowel.\n" +
                "0. Exit\"\n";

//1. Count the total number of letters in the text
        String regex = "[a-zA-Z]";

        Pattern pattern = Pattern.compile(regex);

        Matcher searchLetters = pattern.matcher(myString);

        System.out.println(menu);
        int myCount = 0;
        while (searchLetters.find()) {
            myCount++;
            //System.out.println(searchLetters.group(0));
        }

        System.out.println("1. " + myCount + " letters found");

//2. Count all words that contain a double l
        String regex2 = "(ll)";

        Pattern pattern1 = Pattern.compile(regex2);
        Matcher searchWordsWithll = pattern1.matcher(myString);


        int myCount1 = 0;
        while (searchWordsWithll.find()) {
            myCount1++;
        }
        System.out.println("2. " + myCount1 + " words found");

//3. Print all words that contain a double l that is not followed by an o character
        String regex3 = "(\\w+.l{2}(?!o)\\w+)";

        Pattern pattern2 = Pattern.compile(regex3);
        Matcher searchWordsWithllNotO = pattern2.matcher(myString);

        int myCount2 = 0;
        while (searchWordsWithllNotO.find()) {
            myCount2++;
        }
        System.out.println("3. " + myCount2 + " words found");


        String regex4 = ("(\\w+.l{2}(?!o)\\w+)");
        Pattern pattern3 = Pattern.compile(regex4);
        Matcher matcher2 = pattern2.matcher(myString);
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }

        //4. Print all sentences that have 5 words exactly
        System.out.println("4.");
        String regex5 = ("([A-Z]\\w+\\s\\w+\\s\\w+\\s\\w+\\s\\w+[.])");
        Pattern pattern4 = Pattern.compile(regex5);
        Matcher matcher3 = pattern4.matcher(myString);
        while (matcher3.find()) {

            System.out.println(matcher3.group());
        }

        //5. Compute and print the sum for all the numbers that appear in the text

        System.out.println("5.");
        String regex6 = ("(\\d+\\D\\d+)|(\\d+)");
        Pattern pattern5 = Pattern.compile(regex6);
        Matcher matcher4 = pattern5.matcher(myString);
        while (matcher4.find()) {

            System.out.println(matcher4.group());
        }

            int a = 19;
            int b = 7;
            int c = 129;
            double d = 12.51;
            int e = 111;

            double suma = (a + b + c + d + e);
            System.out.println("Suma");
            System.out.println(suma);

        /*int sum=0;

        for(int i=0; i<myString.length(); i++) {
            char temp = myString.charAt(i);
            if (Character.isDigit(temp)) {
                int b = Integer.parseInt(String.valueOf(temp));
                sum=sum+b;
            }
        }
        System.out.println(sum);

         */


    }


}



























