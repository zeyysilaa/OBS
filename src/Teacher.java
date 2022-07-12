public class Teacher {
    String name, mpno, branch;

    Teacher (String name, String branch, String mpno){
    this.name = name;
    this.branch = branch;
    this.mpno = mpno;
    }
    void print(){
        System.out.println("Adi : " + this.name);
        System.out.println("Bolumu : " + this.branch);
        System.out.println("Telefonu : "+ this.mpno);
    }
}
