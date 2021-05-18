import java.io.*;
class do_while{
	voidCalculate()throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch='n';

        do {
            System.out.println("Enter First Number:");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Enter Second Number:");
            int b = Integer.parseInt(br.readLine());
            System.out.println("Select 1) Add\n2) Sub\n3) Multiply\n4) Divide");
            System.out.print("Enter your choice here:");
            int c = Integer.parseInt(br.readLine());
            switch (c) {
                case 1:
                    c = a + b;
                    System.out.println("The addition is " + c);
                    break;
                case 2:
                    c = a - b;
                    System.out.println("The addition is " + c);
                    System.out.println();
                    break;
                case 3:
                    c = a * b;
                    System.out.println("The addition is " + c);
                    break;
                case 4:
                    c = a / b;
                    System.out.println("The addition is " + c);
                    break;
                default:
                    System.out.println("Invalid Input");
            }

            System.out.println("Enter 'Y' to continue.");
            ch = (char)(br.read());

        }while (ch == 'y' || ch=='Y') ;


    }
}