public class Student{
    public static void main (String[] args) 
    {
        String name = "Prabal Gurung";
        int rollNo = 24;
        String address = "Nayagaun";
        boolean attendance = true;
        float lectureHours = 1.5f;
        char gender = 'm';
    
        System.out.println("Student name is " + name);
        System.out.println("Student Roll Number is " + rollNo);
        System.out.println("Student address is " + address);
        if ( gender == 'm' ){
        System.out.println("Gender = Male");
        }else if (gender == 'f' ){
        System.out.println("Gender = Female");
        }else{
        System.out.println("Gender=Other");
        }
        if (attendance = true){
            System.out.println("Present");
        }else{
            System.out.println("Absent");
        }
        System.out.println("Lecture Hours " + lectureHours + "Hours");  
    }
}
