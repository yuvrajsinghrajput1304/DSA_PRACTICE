package oops;
public class StudentClass{
    static class Student{
        String name;
        int rollNO;
        float per;
        
    }


    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="yuvraj";
        s1.rollNO=1;
        s1.per=99f;
        Student s2=new Student();
        s2.name="shashank";
        s2.rollNO=2;
        s2.per=99.1f;

        Student[] arr={s1,s2};
        for(Student s:arr){
            System.out.println(s.name);
            System.out.println(s.rollNO);
            System.out.println(s.per);
            System.out.println();
        }
        
    }
}