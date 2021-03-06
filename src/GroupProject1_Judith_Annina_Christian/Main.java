package GroupProject1_Judith_Annina_Christian;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mr. Dark", new String[]{"Math", "Biology", "Physics"});
        Teacher t2 = new Teacher("Mrs. Golightly",new String[]{"English", "Art", "Geography"});
        Teacher t3 = new Teacher("Mr. Just",new String[]{"PhyEdu", "Math", "Physics"});
        Teacher t4 = new Teacher("Mr. Happy", new String[]{"PhyEdu", "Geography", "English"});
        Teacher t5 = new Teacher("Mr. Gloriuous", new String[]{"Art", "Biology", "Geography"});
        Teacher t6 = new Teacher("Mr. Brilliant", new String[]{"English", "Math", "Art"});
        Teacher t7 = new Teacher("Mrs. Absolute", new String[]{"PhyEdu", "Geography", "Math"});
        Teacher t8 = new Teacher("Mrs. Lord", new String[]{"Art", "PhyEdu", "Physics"});
        Teacher t9 = new Teacher("Mrs. King", new String[]{"English", "Biology", "Physics"});
        Teacher t10 = new Teacher("Mrs. Allknows",new String[]{"PhyEdu", "Geography", "English"} );
        Teacher t11 = new Teacher("Mrs. Onpoint", new String[]{"Biology", "Geography", "Art"});
        Teacher t12 = new Teacher("Mrs. Strong", new String[]{"Physics", "PhyEdu", "Math"});
        Teacher t13 = new Teacher("Mr. Nothappy", new String[]{"Biology", "Math", "Physics"});
        Teacher t14 = new Teacher("Mr. Sure", new String[]{"Art", "Biology", "Math"});
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);
        teachers.add(t5);
        teachers.add(t6);
        teachers.add(t7);
        teachers.add(t8);
        teachers.add(t9);
        teachers.add(t10);
        teachers.add(t11);
        teachers.add(t12);
        teachers.add(t13);
        teachers.add(t14);


        String[] subjects = {"Math", "English", "Biology", "Geography", "Physics", "Art", "PhyEdu"};

        HashMap<String, Integer> pointsSt1_1st = new HashMap<>();
        pointsSt1_1st.put("Math",78);
        pointsSt1_1st.put("English",45);
        pointsSt1_1st.put("Biology",88);
        pointsSt1_1st.put("Geography",57);
        pointsSt1_1st.put("Physics",74);
        pointsSt1_1st.put("Art",1);
        pointsSt1_1st.put("PhyEdu",1);

        HashMap<String, Integer> pointsSt1_2nd = new HashMap<>();
        pointsSt1_2nd.put("Math",99);
        pointsSt1_2nd.put("English",72);
        pointsSt1_2nd.put("Biology",40);
        pointsSt1_2nd.put("Geography",63);
        pointsSt1_2nd.put("Physics",94);
        pointsSt1_2nd.put("Art",4);
        pointsSt1_2nd.put("PhyEdu",1);

        HashMap<String, Integer> pointsSt2_1st = new HashMap<>();
        pointsSt2_1st.put("Math",90);
        pointsSt2_1st.put("English", 80);
        pointsSt2_1st.put("Biology",80);
        pointsSt2_1st.put("Geography", 60);
        pointsSt2_1st.put("Physics", 90);
        pointsSt2_1st.put("Art", 100);
        pointsSt2_1st.put("PhyEdu", 2);

        HashMap<String, Integer> pointsSt2_2nd = new HashMap<>();
        pointsSt2_2nd.put("Math", 92);
        pointsSt2_2nd.put("English", 83);
        pointsSt2_2nd.put("Biology", 81);
        pointsSt2_2nd.put("Geography", 82);
        pointsSt2_2nd.put("Physics", 100);
        pointsSt2_2nd.put("Art", 90);
        pointsSt2_2nd.put("PhyEdu", 3);

        HashMap<String, Integer> pointsSt3_1st = new HashMap<>();
        pointsSt3_1st.put("Math", 100);
        pointsSt3_1st.put("English", 79);
        pointsSt3_1st.put("Biology", 79);
        pointsSt3_1st.put("Geography", 59);
        pointsSt3_1st.put("Physics", 99);
        pointsSt3_1st.put("Art", 91);
        pointsSt3_1st.put("PhyEdu", 4);

        HashMap<String, Integer> pointsSt3_2nd = new HashMap<>();
        pointsSt3_2nd.put("Math", 90);
        pointsSt3_2nd.put("English",80);
        pointsSt3_2nd.put("Biology", 80);
        pointsSt3_2nd.put("Geography", 57);
        pointsSt3_2nd.put("Physics", 100);
        pointsSt3_2nd.put("Art", 90);
        pointsSt3_2nd.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt4_1st = new HashMap<>();
        pointsSt4_1st.put("Math", 89);
        pointsSt4_1st.put("English", 82);
        pointsSt4_1st.put("Biology", 79);
        pointsSt4_1st.put("Geography", 53);
        pointsSt4_1st.put("Physics", 99);
        pointsSt4_1st.put("Art", 89);
        pointsSt4_1st.put("PhyEdu", 4);

        HashMap<String, Integer> pointsSt4_2nd = new HashMap<>();
        pointsSt4_2nd.put("Math", 90);
        pointsSt4_2nd.put("English", 80);
        pointsSt4_2nd.put("Biology", 80);
        pointsSt4_2nd.put("Geography", 50);
        pointsSt4_2nd.put("Physics", 100);
        pointsSt4_2nd.put("Art", 75);
        pointsSt4_2nd.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt5_1st = new HashMap<>();
        pointsSt5_1st.put("Math", 93);
        pointsSt5_1st.put("English", 81);
        pointsSt5_1st.put("Biology", 78);
        pointsSt5_1st.put("Geography", 49);
        pointsSt5_1st.put("Physics", 99);
        pointsSt5_1st.put("Art", 73);
        pointsSt5_1st.put("PhyEdu", 6);

        HashMap<String, Integer> pointsSt5_2nd = new HashMap<>();
        pointsSt5_2nd.put("Math", 100);
        pointsSt5_2nd.put("English", 78);
        pointsSt5_2nd.put("Biology", 77);
        pointsSt5_2nd.put("Geography", 40);
        pointsSt5_2nd.put("Physics", 89);
        pointsSt5_2nd.put("Art", 70);
        pointsSt5_2nd.put("PhyEdu", 7);

        HashMap<String, Integer> pointsSt6_1st = new HashMap<>();
        pointsSt6_1st.put("Math", 99);
        pointsSt6_1st.put("English", 74);
        pointsSt6_1st.put("Biology", 70);
        pointsSt6_1st.put("Geography", 39);
        pointsSt6_1st.put("Physics", 82);
        pointsSt6_1st.put("Art", 69);
        pointsSt6_1st.put("PhyEdu", 4);

        HashMap<String, Integer> pointsSt6_2nd = new HashMap<>();
        pointsSt6_2nd.put("Math", 100);
        pointsSt6_2nd.put("English", 70);
        pointsSt6_2nd.put("Biology", 69);
        pointsSt6_2nd.put("Geography",40);
        pointsSt6_2nd.put("Physics", 80);
        pointsSt6_2nd.put("Art", 70);
        pointsSt6_2nd.put("PhyEdu", 5);


        HashMap<String, Integer> pointsSt7_1st = new HashMap<>();
        pointsSt7_1st.put("Math", 100);
        pointsSt7_1st.put("English", 70);
        pointsSt7_1st.put("Biology", 69);
        pointsSt7_1st.put("Geography",40);
        pointsSt7_1st.put("Physics", 80);
        pointsSt7_1st.put("Art", 70);
        pointsSt7_1st.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt7_2nd = new HashMap<>();
        pointsSt7_2nd.put("Math", 100);
        pointsSt7_2nd.put("English", 70);
        pointsSt7_2nd.put("Biology", 69);
        pointsSt7_2nd.put("Geography",40);
        pointsSt7_2nd.put("Physics", 80);
        pointsSt7_2nd.put("Art", 70);
        pointsSt7_2nd.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt8_1st = new HashMap<>();
        pointsSt8_1st.put("Math", 100);
        pointsSt8_1st.put("English", 70);
        pointsSt8_1st.put("Biology", 69);
        pointsSt8_1st.put("Geography",40);
        pointsSt8_1st.put("Physics", 80);
        pointsSt8_1st.put("Art", 70);
        pointsSt8_1st.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt8_2nd = new HashMap<>();
        pointsSt8_2nd.put("Math", 100);
        pointsSt8_2nd.put("English", 70);
        pointsSt8_2nd.put("Biology", 69);
        pointsSt8_2nd.put("Geography",40);
        pointsSt8_2nd.put("Physics", 80);
        pointsSt8_2nd.put("Art", 70);
        pointsSt8_2nd.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt9_1st = new HashMap<>();
        pointsSt9_1st.put("Math", 100);
        pointsSt9_1st.put("English", 70);
        pointsSt9_1st.put("Biology", 69);
        pointsSt9_1st.put("Geography",40);
        pointsSt9_1st.put("Physics", 80);
        pointsSt9_1st.put("Art", 70);
        pointsSt9_1st.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt9_2nd = new HashMap<>();
        pointsSt9_2nd.put("Math", 100);
        pointsSt9_2nd.put("English", 70);
        pointsSt9_2nd.put("Biology", 69);
        pointsSt9_2nd.put("Geography",40);
        pointsSt9_2nd.put("Physics", 80);
        pointsSt9_2nd.put("Art", 70);
        pointsSt9_2nd.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt10_1st = new HashMap<>();
        pointsSt10_1st.put("Math", 100);
        pointsSt10_1st.put("English", 70);
        pointsSt10_1st.put("Biology", 69);
        pointsSt10_1st.put("Geography",40);
        pointsSt10_1st.put("Physics", 80);
        pointsSt10_1st.put("Art", 70);
        pointsSt10_1st.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt10_2nd = new HashMap<>();
        pointsSt10_2nd.put("Math", 100);
        pointsSt10_2nd.put("English", 70);
        pointsSt10_2nd.put("Biology", 69);
        pointsSt10_2nd.put("Geography",40);
        pointsSt10_2nd.put("Physics", 80);
        pointsSt10_2nd.put("Art", 70);
        pointsSt10_2nd.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt11_1st = new HashMap<>();
        pointsSt11_1st.put("Math", 100);
        pointsSt11_1st.put("English", 70);
        pointsSt11_1st.put("Biology", 69);
        pointsSt11_1st.put("Geography",40);
        pointsSt11_1st.put("Physics", 80);
        pointsSt11_1st.put("Art", 70);
        pointsSt11_1st.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt11_2nd = new HashMap<>();
        pointsSt11_2nd.put("Math", 100);
        pointsSt11_2nd.put("English", 70);
        pointsSt11_2nd.put("Biology", 69);
        pointsSt11_2nd.put("Geography",40);
        pointsSt11_2nd.put("Physics", 80);
        pointsSt11_2nd.put("Art", 70);
        pointsSt11_2nd.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt12_1st = new HashMap<>();
        pointsSt12_1st.put("Math", 100);
        pointsSt12_1st.put("English", 70);
        pointsSt12_1st.put("Biology", 69);
        pointsSt12_1st.put("Geography",40);
        pointsSt12_1st.put("Physics", 80);
        pointsSt12_1st.put("Art", 70);
        pointsSt12_1st.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt12_2nd = new HashMap<>();
        pointsSt12_2nd.put("Math", 100);
        pointsSt12_2nd.put("English", 70);
        pointsSt12_2nd.put("Biology", 69);
        pointsSt12_2nd.put("Geography",40);
        pointsSt12_2nd.put("Physics", 80);
        pointsSt12_2nd.put("Art", 70);
        pointsSt12_2nd.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt13_1st = new HashMap<>();
        pointsSt13_1st.put("Math", 100);
        pointsSt13_1st.put("English", 70);
        pointsSt13_1st.put("Biology", 69);
        pointsSt13_1st.put("Geography",40);
        pointsSt13_1st.put("Physics", 80);
        pointsSt13_1st.put("Art", 70);
        pointsSt13_1st.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt13_2nd = new HashMap<>();
        pointsSt13_2nd.put("Math", 100);
        pointsSt13_2nd.put("English", 70);
        pointsSt13_2nd.put("Biology", 69);
        pointsSt13_2nd.put("Geography",40);
        pointsSt13_2nd.put("Physics", 80);
        pointsSt13_2nd.put("Art", 70);
        pointsSt13_2nd.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt14_1st = new HashMap<>();
        pointsSt14_1st.put("Math", 100);
        pointsSt14_1st.put("English", 70);
        pointsSt14_1st.put("Biology", 69);
        pointsSt14_1st.put("Geography",40);
        pointsSt14_1st.put("Physics", 80);
        pointsSt14_1st.put("Art", 70);
        pointsSt14_1st.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt14_2nd = new HashMap<>();
        pointsSt14_2nd.put("Math", 100);
        pointsSt14_2nd.put("English", 70);
        pointsSt14_2nd.put("Biology", 69);
        pointsSt14_2nd.put("Geography",40);
        pointsSt14_2nd.put("Physics", 80);
        pointsSt14_2nd.put("Art", 70);
        pointsSt14_2nd.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt15_1st = new HashMap<>();
        pointsSt15_1st.put("Math", 100);
        pointsSt15_1st.put("English", 70);
        pointsSt15_1st.put("Biology", 69);
        pointsSt15_1st.put("Geography",40);
        pointsSt15_1st.put("Physics", 80);
        pointsSt15_1st.put("Art", 70);
        pointsSt15_1st.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt15_2nd = new HashMap<>();
        pointsSt15_2nd.put("Math", 100);
        pointsSt15_2nd.put("English", 70);
        pointsSt15_2nd.put("Biology", 69);
        pointsSt15_2nd.put("Geography",40);
        pointsSt15_2nd.put("Physics", 80);
        pointsSt15_2nd.put("Art", 70);
        pointsSt15_2nd.put("PhyEdu", 5);

        HashMap<String, Integer> pointsSt16_1st = new HashMap<>();
        pointsSt16_1st.put("Math", 99);
        pointsSt16_1st.put("English", 69);
        pointsSt16_1st.put("Biology", 65);
        pointsSt16_1st.put("Geography", 36);
        pointsSt16_1st.put("Physics", 78);
        pointsSt16_1st.put("Art", 67);
        pointsSt16_1st.put("PhyEdu", 2);

        HashMap<String,Integer> pointsSt16_2nd = new HashMap<>();
        pointsSt16_2nd.put("Math", 100);
        pointsSt16_2nd.put("English", 67);
        pointsSt16_2nd.put("Biology", 64);
        pointsSt16_2nd.put("Geography", 34);
        pointsSt16_2nd.put("Physics", 73);
        pointsSt16_2nd.put("Art", 63);
        pointsSt16_2nd.put("PhyEdu", 1);
















        String [][][] sched1a = {{{"Math", "English", "Biology", "PhyEdu","PhyEdu"},
                                {"Biology", "Physics", "Art", "Math", "English"},
                                {"Geography", "Biology", "Physics", "Art", "Math"},
                                {"Physics", "Geography", "English", "Art", "Physics"}},
                                {{"Mr.Dark", "Mrs.Golightly","Mr. Sure","Mr.Strong","Mr. Strong"},
                                {"Mr.Nothappy","Mr. Just", "Mrs. Onpoint", "Mr. Brilliant","Mr.Dark"},
                                {"Mrs. Absolute", "Mrs. King","Mrs.Lord", "Mrs.Onpoint","Mrs.King" },
                                {"Mr. Lord", "Mrs. Allknows", "Mr. Happy", "Mr. Dark", "Mr.Just"}}};

        String [][][] sched1b = {{{"English", "Biology", "PhyEdu", "Art"},
                                {"Geography", "Biology", "Physics", "Art"},
                                {"Physics", "Geography", "English", "Math"},
                                {"Biology", "Physics", "Art", "Math"}},
                                {{"Mrs. Absolute", "Mrs. King","Mrs.Lord", "Mrs.Onpoint"},
                                {"Mr.Dark", "Mrs.Golightly","Mr. Sure","Mr.Strong"},
                                {"Mr. Lord", "Mrs. Allknows", "Mr. Happy", "Mr. Dark"},
                                {"Mr.Nothappy","Mr. Just", "Mrs. Onpoint", "Mr. Brilliant"}}};

        String [][][] sched2a = {{{"Biology", "Biology", "PhyEdu", "Art"},
                                 {"Geography", "Physics", "Math", "Art"},
                                 {"Physics", "Geography", "English", "Math"},
                                 {"Art", "Physics", "Biology", "Math"}},
                                 {{"Mrs. Absolute", "Mrs. Queen","Mrs.Lord", "Mrs.Onpoint"},
                                  {"Mr.Happy", "Mrs.Star","Mr. Sureright","Mr.Week"},
                                  {"Mr. Lord", "Mrs. Sad", "Mr. Happy", "Mr. Green"},
                                   {"Mr.Nothappyatall","Mr. Fair", "Mrs. Fast", "Mr. Fantastic"}}};

        String [][][] sched2b = {{{"English", "Biology", "PhyEdu", "Art"},
                                    {"Geography", "Biology", "Physics", "Art"},
                                    {"Physics", "Geography", "English", "Math"},
                                    {"Biology", "Physics", "Art", "Math"}},
                                    {{"Mrs. Absolute", "Mrs. King","Mrs.Lord", "Mrs.Onpoint"},
                                    {"Mr.Dark", "Mrs.Golightly","Mr. Sure","Mr.Strong"},
                                    {"Mr. Lord", "Mrs. Allknows", "Mr. Happy", "Mr. Dark"},
                                    {"Mr.Nothappy","Mr. Just", "Mrs. Onpoint", "Mr. Brilliant"}}};

        Student st1 = new Student("Benni", 7, Student.Classroom.A1, sched1a, pointsSt1_1st,
                "benniParents@email.com", "Ada Cool", "Adam Cool");
        Student st2 = new Student ("Jenny",8, Student.Classroom.A1, sched1a,pointsSt2_1st,
                "Jenny.ara.hptmail.com","Mama Ara","Papa Ara" );
        Student st3 = new Student("Laura",9, Student.Classroom.A1, sched1b, pointsSt3_1st,
                "Laura.sim@hotmail.com", "Goa Sim", "Gingy Sim");
        Student st4 = new Student ("Sebastian",7, Student.Classroom.A1, sched1a, pointsSt4_1st,
                "Sebastian.sala@hotmail.com", "Gara Sala", "Papa Sala");
        Student st5 = new Student("Lala", 7, Student.Classroom.A1, sched2a, pointsSt5_1st,
                "LalaParents@email.com", "Ada Grey", "Adam Grey");
        Student st6 = new Student("Ben", 8, Student.Classroom.A1, sched2a, pointsSt6_1st,
                "benlargo@email.com", "Rima Largo", "Adam Largo");
        Student st7 = new Student("Toni", 9, Student.Classroom.A1, sched2b, pointsSt7_1st,
                "tonilahm@email.com", "Haha Happy", "Hihi Happy");
        Student st8 = new Student("Jim", 7, Student.Classroom.A1, sched2b, pointsSt8_1st,
                "jimfans@email.com", "Melani Fans", "Adam Fans");


        st1.setPoints_2nd(pointsSt1_2nd);

        //st1.printSchedule();
        st1.printReport(2);
        st1.printAvgGradeOfSemester(2);
        System.out.println("christian test");
    }
}
