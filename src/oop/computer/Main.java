package oop.computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        while(true) {
            String line = sc.nextLine();
            int i;
            if(line.equals("push")) {
                int j = sc.nextInt();
                stack.push(j);

            }
            else if(line.equals("clear")) {
                stack.clear();
                System.out.println("ok");
            }
            else if(line.equals("pop")) {
                try {
                    i = stack.pop();
                }catch(Exception e) {
                    System.out.println("error");
                }

            }
            else if (line.equals("size")) {
                System.out.println(stack.size());
            }
            else if (line.equals("back")) {
                try {
                    System.out.println(stack.back());
                }catch(Exception e) {
                    System.out.println("error");
                }
            } else if (line.equals("exit")) {
                break;
            }

        }

    }
}
