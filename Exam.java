import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        numberType();
        primeComposite();
        nameLength();
        largestNumber();
        vowelsConsonants();
        myStudentnumber();
        checkName();
        nestedCondition();
        shsStrands();
        studentEmail();
        aTM();

    }
        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "POSITIVE" if the number is a positive number. 
        // print "NEGATIVE" if the number is a negative number. 
        // print "ZERO" if the number is ZERO. 
        //(10 pts)
        
    static void numberType() {
        System.out.println("1. Positive, Negative, Zero");
        System.out.print("Enter a number: ");
        int number;
        number = scan.nextInt(); 
        
        if(number >= 0) {
            System.out.println("Positive");
        }else if(number == 0){
            System.out.println("Zero");
        }else {
            System.out.println("Negative");
        }
        System.out.println(" ");
    }
   
        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // or a composite number.
        // (10 pts)

    static void primeComposite() {

        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();
        
        switch(lastDigit){
            case 2:
                System.out.println("PRIME");
            break;
            case 3:
                System.out.println("PRIME");
            break;
            case 5:
                System.out.println("PRIME");
            break;
            case 7:
                System.out.println("PRIME");
            break;
            case 1:
                System.out.println("NEITHER");
            break;
            case 0:
                System.out.println("NEITHER");
            break;
            default:
                System.out.println("COMPOSITE");
            break;

        }
        System.out.println(" ");
    }
     

        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
    
    static void nameLength() {

        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        int lengthfirstname = firstName.length();
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        int lengthSurname = surName.length();
        int sum;
        sum = lengthSurname + lengthfirstname;
        System.out.println("The total is " + sum + " characters");
        System.out.println(" ");

  }
        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest number.
    static void largestNumber() {

        System.out.println("4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt(); 
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();

        if( firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println( firstNumber + " is the largest number");
        }else if(secondNumber >= firstNumber && secondNumber >= thirdNumber){
            System.out.println(secondNumber + " is the largest number");
        }else {
            System.out.println(thirdNumber + " is the largest number");
    }
    System.out.println(" ");

}
        // ==============================================================================

        // 5. Create a method that will print "VOWEL" if your name starts with
        // a vowel and "CONSONANT" if your name starts with a consonant.
        
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
            break;
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
        int studentNumber = scan.nextInt();

        if(studentNumber == 2022104745){
            System.out.println("Valid StudentNumber");
        }else {
            System.out.println("Invalid StudentNumber");
        }
        System.out.println(" ");
    }
        

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        
    static void checkName() {

            System.out.println("7. Case sensitivity check");
            System.out.print("Enter your firstname in UPPERCASE: ");
            String firstName2 = scan.next();
                
            if(firstName2 == firstName2.toUpperCase()) {
                System.out.println("Valid");
                System.out.println(" ");
            }else{
                System.out.println("Invalid");
                System.out.println(" ");
            }
    
            System.out.print("Enter your surname in lowercase: ");
            String surName2 = scan.next();
    
            if(surName2 == surName2.toLowerCase()) {
                System.out.println("Valid");
                System.out.println(" ");
            }else{
                System.out.println("Invalid");
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
                System.out.println("Valid: You are a BSIT Student");
                System.out.print("Enter your specialization (MWA or MAA): ");
                String specialization1 = scan.next();
    
                if(specialization1.contains("MAA")) {
                    System.out.println("Valid: You are taking a specilizaiton in MAA");
                    System.out.println(" ");
                }else{
                    System.out.println("Valid: You are taking a specilizaiton in MWA");
                    System.out.println(" ");
                }
            }
    
            if(course.contains("BSCS")) {
                System.out.println("Valid: You are a BSCS Student");
                System.out.print("Enter your specialization (DF or ML): ");
                String specialization2 = scan.next();
                if(specialization2.contains("DF")) {
                    System.out.println("Valid: You are taking a specilizaiton in DF");
                    System.out.println(" ");
                }else{
                    System.out.println("Valid: You are taking a specilizaiton in ML");
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
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

    static void shsStrands() {
        System.out.println("9. Selection");
        System.out.println("Select the strand you take in SHS:");
        System.out.println("1. STEM");
        System.out.println("2. ABM");
        System.out.println("3. ADT");
        System.out.println("4. ICT");
        System.out.println("5. GAS");
        System.out.println("6. HUMMS");
        System.out.println("7. TVL MARITIME");
        System.out.println("8. HOME ECONOMICS");
        System.out.println("Enter Strand: ");

        String strand = scan.next();

        switch(strand){
                case "STEM":
                    System.out.println("Valid");
                break;
                case "ABM":
                    System.out.println("Valid");
                break;
                case "ADT":
                    System.out.println("Valid");
                break;
                case "ICT":
                    System.out.println("Valid");
                break;
                case "GAS":
                    System.out.println("Valid");
                break;
                case "HUMMS":
                    System.out.println("Valid");
                break;
                case "TVL MARINETIME":
                    System.out.println("Valid");
                break;
                case "HOME ECONOMICS":
                    System.out.println("Valid");
                break;
                default:
                    System.out.println("Invalid");
                break;
            }
            System.out.println(" ");

        }
        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the following pattern:
        // - Your surname
        // - The string "@student.national-u.edu.ph"
        //(10 pts)
        
    static void studentEmail() {
        
        System.out.println("10. Validate student email address ");
            System.out.print("Enter your student email address: ");
            String email = "@students.national-u.edu.ph";
            String studentEmailAddress = scan.next();

        if(studentEmailAddress.contains("dala" + email)) {
            System.out.println("Valid Email Adress");
            System.out.println(" ");
        }else{
            System.out.println("Invalid Email Adress");
            System.out.println(" ");
        }
    }
    

        
        // ==============================================================================
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


        // Close scanner
        //a=1000
        //b=500
        //c=200
        //d=100
        //e=50
        //f=20

    static void aTM() {
        System.out.println("11. Think like an ATM");
        System.out.print("Enter the total amount of savings in your bank account: ");
        int amount = scan.nextInt();
        System.out.print("Enter the total amount of money you want to withdraw: ");
        int withdraw = scan.nextInt();
        int leftsavings;
        int a,b,c,d,e,f;
        int a1,b1,c1,d1,e1,f1;
        int a2,b2,c2,d2,e2;
        int totalbills;
        a = 1000;
        b = 500;
        c = 200;
        d = 100;
        e = 50;
        f = 20;
        
        if (withdraw >= 1000) {
            a1 = withdraw / a;
            a2 = withdraw -= (a1 * 1000);
            b1 = a2/b;
            b2 = withdraw -= (b1 * 500);
            c1 = b2/c;
            c2 = withdraw -= (c1 * 200);
            d1 = c2/d;
            d2 = withdraw -= (d1 * 100);
            e1 = d2/e;
            e2 = withdraw -= (e1 * 50);
            f1 = e2/f;
            

            System.out.println("Total 1000: " + a1);
            System.out.println("Total 500: " + b1);
            System.out.println("Total 200: " + c1);
            System.out.println("Total 100: " + d1);
            System.out.println("Total 50: " + e1);
            System.out.println("Total 20: " + f1);
            totalbills = a1 + b1 + c1 + d1 + e1+ f1;
            System.out.println("Total bills: " + totalbills);

            leftsavings = amount - withdraw;
            System.out.println("Savings left: " +  leftsavings);
            

        }else if (withdraw <= 1000) {
            a1 = withdraw / a;
            a2 = withdraw -= (a1 * 1000);
            b1 = a2/b;
            b2 = withdraw -= (b1 * 500);
            c1 = b2/c;
            c2 = withdraw -= (c1 * 200);
            d1 = c2/d;
            d2 = withdraw -= (d1 * 100);
            e1 = d2/e;
            e2 = withdraw -= (e1 * 50);
            f1 = e2/f;
           
            System.out.println("Total 1000: " + a1);
            System.out.println("Total 500: " + b1);
            System.out.println("Total 200: " + c1);
            System.out.println("Total 100: " + d1);
            System.out.println("Total 50: " + e1);
            System.out.println("Total 20: " + f1);
            totalbills = a1 + b1 + c1 + d1 + e1+ f1;
            System.out.println("Total bills: " + totalbills);

            leftsavings = amount - withdraw;
            System.out.println("Savings left: " +  leftsavings );
        
    
        scan.close();
    }
 
} 
}
