public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Batuhan Hoca " , "AI" , "444");
        Teacher t2 = new Teacher("Zeynep Hoca" , "MTMTK" , "404");
        Teacher t3 = new Teacher("Papatya Hoca" , "JAVA" , "440");

        Course yapayzeka = new Course("Yapay zeka" , "101" , "AI");
        yapayzeka.addTeacher(t1);

        Course matematik = new Course("Matematik" , "102" , "MTMTK");
        matematik.addTeacher(t2);

        Course java = new Course("Java" , "103" , "JAVA");
        java.addTeacher(t3);

        Course sozlu1 = new Course("Yapay zeka" , "101" , "AI");
        Course sozlu2 = new Course("Matematik" , "102" , "MTMTK");
        Course sozlu3 = new Course("Java" , "103" , "JAVA");
        Student s1 = new Student("Churchill Batu" , "4044" , "4", yapayzeka, matematik, java, sozlu1 , sozlu2 , sozlu3);
        s1.addBulkExamNote(100,95,100,100,98,100);
        s1.isPass();

        Student s2 = new Student("Churchill Zeynep" , "4404" , "4" , yapayzeka , matematik, java, sozlu1 , sozlu2 , sozlu3);
        s2.addBulkExamNote(90,100,85,95,100,88);
        s2.isPass();
    }
}
