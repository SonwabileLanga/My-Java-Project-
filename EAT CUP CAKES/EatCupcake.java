import java.util.Scanner;
public class EatCupcake{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String answer;

        System.out.println("Did anyone see you?");
        answer = sc.nextLine();

        if(answer.equals("YES.")){
            System.out.println("Was it a boss/lover/parent?");
            answer = sc.nextLine();
            if(answer.equals("YES.")){
                System.out.println("Was it expensive?");
                answer = sc.nextLine();
                if(answer.equals("YES.")){
                    System.out.println("Can you cut off the part that touched the floor?");
                    answer = sc.nextLine();
                    if(answer.equals("YES.")){
                        System.out.println("EAT IT.");
                    } else{
                        System.out.println("YOUR CALL");
                    }
                } else{
                    System.out.println("Is it chocolate?");
                    answer = sc.nextLine();
                    if(answer.equals("YES.")){
                        System.out.println("EAT IT.");
                    } else{
                        System.out.println("DON'T EAT IT.");
                    }
                }
            }else{
                System.out.println("EAT IT.");
            }
        } else{
            System.out.println("Was it sticky?");
            answer = sc.nextLine();
            if(answer.equals("YES.")){
                System.out.println("Is it a raw steak?");
                answer = sc.nextLine();
                if(answer.equals("YES.")){
                    System.out.println("Are you a puma?");
                    answer = sc.nextLine();
                    if(answer.equals("YES.")){
                        System.out.println("EAT IT.");
                    } else{
                        System.out.println("DON'T EAT IT.");
                    }
                } else{
                    System.out.println("Did the cat lick it?");
                    answer = sc.nextLine();
                    if(answer.equals("YES.")){
                        System.out.println("Is your cat healthy?");
                        answer = sc.nextLine();
                        if(answer.equals("YES.")){
                            System.out.println("EAT IT.");
                        } else{
                            System.out.println("YOUR CALL");
                        }
                    } else{
                        System.out.println("EAT IT.");
                    }
                }
            } else{
                System.out.println("Is it an Emausaurus?");
                answer = sc.nextLine();
                if(answer.equals("YES.")){
                    System.out.println("Are you a Megalosaurus?");
                    answer = sc.nextLine();
                    if(answer.equals("YES.")){
                        System.out.println("EAT IT.");
                    } else{
                        System.out.println("DON'T EAT IT.");
                    }
                } else{
                    System.out.println("Did the cat lick it?");
                    answer = sc.nextLine();
                    if(answer.equals("YES.")){
                        System.out.println("Is your cat healthy?");
                        answer = sc.nextLine();
                        if(answer.equals("YES.")){
                            System.out.println("EAT IT.");
                        } else{
                            System.out.println("YOUR CALL");
                        }
                    } else{
                        System.out.println("EAT IT.");
                    }
                }
            }
        }
        sc.close();
    }
}
