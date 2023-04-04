public class MainClass {

    public static void main(String[] args) {


        // for interface example
        // UserClass typeObject = new UserClass();
        // typeObject.setUserType();
        // UserClass.collectUser();

        // for equals() method example with int and String
        // ScoreClass.compareScore();

        // for equals() method example with objects
        StudentClass stu01 = new StudentClass("Ayobami", "Adedapo", "male");
        StudentClass stu02 = new StudentClass("Oluchi", "Nwenyi", "female");
        StudentClass stu03 = stu01;
        StudentClass stu04 = new StudentClass("Abayomi", "Adedayo", "male");

        stu01.setStudentAverage(80);
		stu02.setStudentAverage(90);
        stu04.setStudentAverage(80);
        
        // int hashCode01 = stu01.hashCode();
        // int hashCode02 = stu02.hashCode();
        // int hashCode03 = stu03.hashCode();
        // int hashCode04 = stu04.hashCode();

        int comparisonResult = stu01.compareTo(stu02);
        int comparisonResult2 = stu01.compareTo(stu04); 
        int comparisonResult3 = stu02.compareTo(stu04);
        int comparisonResult4 = stu01.compareTo(stu03);

        // System.out.println("Comparison stu01.equals(stu02) result is:" + stu01.equals(stu02));
        // System.out.println("Comparison stu01.equals(stu03) result is:" + stu01.equals(stu03));
        // System.out.println("Comparison stu01.equals(stu04) result is:" + stu01.equals(stu04));

        // System.out.println("hashCode01 is:" + hashCode01);
        // System.out.println("hashCode02 is:" + hashCode02);
        // System.out.println("hashCode03 is:" + hashCode03);
        // System.out.println("hashCode04 is:" + hashCode04);

        System.out.println("comparison stu01.compareTo(stu02): is " + comparisonResult);
        System.out.println("comparison stu01.compareTo(stu04): is " + comparisonResult2);
        System.out.println("comparison stu02.compareTo(stu04): is " + comparisonResult3);
        System.out.println("comparison stu01.compareTo(stu03): is " + comparisonResult4);
    }   
        
}
