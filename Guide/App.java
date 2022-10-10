import java.util.Scanner;
import javax.print.attribute.standard.PrinterLocation;
import javax.swing.plaf.ComponentInputMapUIResource;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        studentNumber();
        oddEven();
        totalCharacter();
        pangalan();
        vowelsConsonants();
        myStudentnumber();
        checkName();
        nestedCondition();
        shsStrands();
        studentEmail();

    }
        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        static void studentNumber() {

            System.out.println("1. Last six digits");
            System.out.print("Enter your ten digit student number: ");
            int studentNumber = scan.nextInt();
            int lastsixdigits = studentNumber%1000000;
            System.out.println(" The last 6 digits of your student number is: " + lastsixdigits);
            System.out.println(" ");
        }

        // ==============================================================================

        // 2. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)

        static void oddEven() {    
        System.out.println("2. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();
        if(lastTwoDigits %2 == 0) {
            System.out.println("Even");
            System.out.println(" ");
        }else{
            System.out.println("Odd");
            System.out.println(" ");
        }

    }

        // ==============================================================================

        // 3. Create a method that will return the total character length of your
        // firstname and your surname. (10 pts)
        
        static void totalCharacter() {

        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        int numberOfCharacters = firstName.length();
        System.out.println("The total characters are: " + numberOfCharacters);
        System.out.println(" ");
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        int numberOfCharacters2 = surName.length();
        System.out.println("The total characters are: " + numberOfCharacters2);
        System.out.println(" ");

    }
        // ==============================================================================

        // 4. Create a method to that will return true if your firstname in BOTH
        // UPPERCASE and lowercase are EQUAL.
        // Otherwise, return false.
        
        static void pangalan() {

        System.out.println("4. Check your first name in LOWERCASE and UPPERCASE");
        System.out.print("Enter your first name in lowercase: ");
        String firstNameInLowerCase = scan.next();
        System.out.print("Enter your first name in UPPERCASE: ");
        String firstNameInUpperCase = scan.next();
        
        if (firstNameInLowerCase.equals("luisa") && firstNameInUpperCase.equals("LUISA")) {
        System.out.println("Correct");
        System.out.println(" ");
        }else{
        System.out.println("Wrong ");
        System.out.println(" ");
        }
    }

        // ==============================================================================

        // 5. Create a method that will return true if your name starts with
        // a vowel 'A','E','I','O','U'.
        // Otherwise, return false.
        

        static void vowelsConsonants() {
        System.out.println("5. Vowel or Consonant");
        System.out.print("Enter the first character of your first name: ");
        String firstChar = scan.next();
        
        switch(firstChar) {
            case "A":
                System.out.println("Vowel");
                break;
            case "a":
                System.out.println("Vowel");
                break;
            case "E":
                System.out.println("Vowel");
                break;
            case "e":
                System.out.println("Vowel");
                break;
            case "I":
                System.out.println("Vowel");
                break;
            case "i":
                System.out.println("Vowel");
                break;
            case "O":
                System.out.println("Vowel");
                break;
            case "o":
                System.out.println("Vowel");
                break;
            case "U":
                System.out.println("Vowel");
                break;
            case "u":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                return;
                
        
        }
    System.out.println(" ");
            
    }

        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)

        static void myStudentnumber() {

        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber;
        studentNumber = scan.nextInt();

        if(studentNumber == 2022104745) {
            System.out.println("Valid");
            System.out.println(" ");
        }else{
            System.out.println("Invalid");
            System.out.println(" ");
        }

    }

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        
        static void checkName() {

        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName2 = scan.next();
            
        if(firstName2 == firstName2.toUpperCase()) {
            System.out.println("Correct");
            System.out.println(" ");
        }else{
            System.out.println("Wrong");
            System.out.println(" ");
        }

        System.out.print("Enter your surname in lowercase: ");
        String surName2 = scan.next();

        if(surName2 == surName2.toLowerCase()) {
            System.out.println("Correct");
            System.out.println(" ");
        }else{
            System.out.println("Wrong");
            System.out.println(" ");
        }

    }

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.
        
        static void nestedCondition() {
            System.out.println("8. Nested conditions");
            System.out.print("Enter your enrolled course (BSIT or BSCS): ");
            String course = scan.next();
    
            // If BSIT
            if(course.contains("BSIT")) {
                System.out.println("Confirmed: You are a BSIT Student");
                System.out.print("Enter your specialization (MWA or MAA): ");
                String specialization1 = scan.next();
    
                if(specialization1.contains("MAA")) {
                    System.out.println("Confirmed, You are taking a specilizaiton in MAA");
                    System.out.println(" ");
                }else{
                    System.out.println("Confirmed, You are taking a specilizaiton in MWA");
                    System.out.println(" ");
                }
            }
    
            if(course.contains("BSCS")) {
                System.out.println("Confirmed: You are a BSCS Student");
                System.out.print("Enter your specialization (DF or ML): ");
                String specialization2 = scan.next();
                if(specialization2.contains("DF")) {
                    System.out.println("Confirmed, You are taking a specilizaiton in DF");
                    System.out.println(" ");
                }else{
                    System.out.println("Confirmed, You are taking a specilizaiton in ML");
                    System.out.println(" ");
                }
            }
    }
        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS

        static void shsStrands() {
            System.out.println("9. Selection");
            System.out.println("Select a strands that you want to take:");
            System.out.println("1. STEM");
            System.out.println("2. ABM");
            System.out.println("3. ADT");
            System.out.println("4. ICT");
            System.out.println("5. GAS");
            System.out.println("6. HUMMS");

            String strand = scan.next();

            switch(strand){
                case "STEM":
                    System.out.println("Confirmed");
                break;
                case "ABM":
                    System.out.println("Confirmed");
                break;
                case "ADT":
                    System.out.println("Confirmed");
                break;
                case "ICT":
                    System.out.println("Confirmed");
                break;
                case "GAS":
                    System.out.println("Confirmed");
                break;
                case "HUMMS":
                    System.out.println("Confirmed");
                break;
                default:
                    System.out.println("Strand Unavailable");
                break;
            }
            System.out.println(" ");


    }

    
        // 10. Create a condition to check if your student email address contains your
        // surname. (10 pts)


        static void studentEmail() {
            System.out.println("10. Validate student email address ");
            System.out.print("Enter your student email address: ");
            String studentEmailAddress = scan.next();
            
            if (studentEmailAddress.contains("luisadala59@gmail.com")) {
                System.out.println("Valid");
                System.out.println(" ");
            } else {
            System.out.println("Invalid");
            System.out.println(" ");
            }

        }
        public static Scanner getScan() {
            return scan;
        }
        public static void setScan(Scanner scan) {
            App.scan = scan;
    }
        
        // Programming competition/Job interview level question (20 points)

        // 11. Think like an ATM.

        // You have an N amount of pesos in your savings account and you have decided
        // that you want to withdraw all of your money in the ATM.

        // The denomination of peso bills that the ATM could dispense are 20, 50, 100,
        // 200, 500, 1000.

        // Create a method that will return the minimum number of peso bills that the
        // ATM will dispense after withdrawing all of your money.

        // Example:
        // Elizer has 150 pesos in his bank account. If elizer withdraws 150 pesos in
        // the ATM, the ATM will dispense two peso bills (100 peso bill and 50 peso
        // bill). (Answer is 2)

        //System.out.println("11. Think like an ATM");
        //System.out.print("Enter the total amount of money in your bank account: ");
        //int amount = scan.nextInt();


}





