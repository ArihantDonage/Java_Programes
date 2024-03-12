
public class GradeApp {
public static void Gradechecker(int marks)
{if(marks<0 || marks>100) {System.out.println("Invalid marks");
}
else if(marks>=90) {System.out.println("A grade");
}
else if(marks>=80 && marks<90) {System.out.println("B grade");}

else if(marks>=70 && marks<89) {System.out.println("C gradee");
}
else if(marks>=50 && marks<69) {System.out.println("D grade");
}
else if(marks>=40 && marks<59) {System.out.println("E grade");
}
else if(marks<40 && marks>0) {System.out.println("F grade");
}}
}