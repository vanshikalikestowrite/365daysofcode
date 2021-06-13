import java.util.Scanner;
class Vanshika {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
        
        System.out.println ("Name");
        char Name = scan.next().charAt(0);

        System.out.println ("Marks");
        int M1 = scan.nextInt();
        int M2 = scan.nextInt();
        int M3 = scan.nextInt();

        //Line 1 : Name(Single character)
        //Line 2 : Marks scored in the 3 tests separated by single space. 
        //Output format :
        //First line of output prints the name of the student.
        //Second line of the output prints the average mark.
        //Constraints
        //Marks for each student lie in the range 0 to 100 (both inclusive)

        if ((M1>=0 && M2>=0 && M3>=0) && (M1<=100 && M2<=100 && M3<=100)) {
            int avg = (M1+M2+M3)/3;
            System.out.println(Name);
            System.out.println(avg);
        } else{
            System.out.println("Marks must lie between 0 and 100 (both inclusive)"); 
        }
	}
}