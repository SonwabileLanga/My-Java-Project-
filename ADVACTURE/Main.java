import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.File;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("You awake in what seems to be a dark, damp cave...");
        System.out.println("You have no memory of how you got here or who you are.");
        System.out.println("You decide to try and remember who you are before doing anything else...");
        System.out.println();
        System.out.println("Enter your name:");
        String playerName = sc.next();
        System.out.println("Yes..." + playerName + " is your name. But who ARE you?");
        System.out.println();
        System.out.println("Choose your class (enter 'wizard', 'rogue', or 'knight'):");
        String playerClass = sc.next();
        sc.nextLine();
        Player player;
        switch (playerClass){
            case "wizard":
                System.out.print("Yes, that's right...");
                try{
                    player = new Wizard(playerName);
                    pause(sc);
                }catch(Exception e){
                    System.out.println("No...that's not it...");
                    player = new Player(playerName);
                }
                try{
                    printAscii("wizard.txt");
                    System.out.println();
                }catch(Exception e){
                    return;
                }
                break;
            case "rogue":
                System.out.print("Yes, that's right...");
                try{
                    player = new Rogue(playerName);
                    pause(sc);
                }catch(Exception e){
                    System.out.println("No...that's not it...");
                    player = new Player(playerName);
                }
                try{
                    printAscii("rogue.txt");
                    System.out.println();
                }catch(Exception e){
                    return;
                }
                break;
            case "knight":
                System.out.print("Yes, that's right...");
                try{
                    player = new Knight(playerName);
                    pause(sc);
                }catch(Exception e){
                    System.out.println("No...that's not it...");
                    player = new Player(playerName);
                }
                try{
                    printAscii("knight.txt");
                    System.out.println();
                }catch(Exception e){
                    return;
                }
                break;
            default:
                System.out.println("No...that's not it...");
                player = new Player(playerName);
                pause(sc);
                try{
                    printAscii("peasant.txt");
                    System.out.println();
                }catch(Exception e){
                    return;
                }
                break;
        }
        try{
            if(player.getPlayerClass().equals("dirty peasant")){
                System.out.println("Being a dirty peasant, you are too feeble of body and mind");
                System.out.println("to do anything about your situation. You slowly perish in the cave.");
                return;
            }
        }catch(Exception e){
            whoops();
            return;
        }
        pause(sc);
        System.out.println("You try to leave the cave...");
        try{
            int oldLocation = player.getLocation();
            player.move();
            int newLocation = player.getLocation();
           if(newLocation <= oldLocation){
                System.out.println("For some reason, you are unable to move. You slowly perish in the cave.");
                return;
            }
        }catch(Exception e){
            whoops();
            return;
        }
        System.out.println("You manage to find the exit. You walk through and find yourself in a dense jungle.");
        System.out.println("You hear a rustle in the bushes nearby...");
        pause(sc);
        Monster firstMonster;
        try{
            try{
                firstMonster = new Ant("weak");
            }catch(Exception e){
                firstMonster = new Ant();
            }
        }catch(Exception e){
            whoops();
            return;
        }
        if(firstMonster.getSpecies().equals("monster")){
            System.out.println("Before you can even blink, a monster too terrible to describe leaps out of the bushes and ends your life.");
            return;
        }
        System.out.println("A giant ant leaps out of the bushes attacks you!");
        System.out.println();
        try{
            printAscii("ant.txt");
            System.out.println();
        }catch(Exception e){
            return;
        }
        pause(sc);
        firstMonster.attack(player);
        if(player.getHP() < 0){
            System.out.println("The giant ant's deadly attack makes quick work of you. You are eaten.");
            return;
        }
        pause(sc);
        System.out.println("You try to fight back...");
        System.out.println();
        try{
            int hpBefore = firstMonster.getHP();
            player.attack(firstMonster);
            int hpAfter = firstMonster.getHP();
            System.out.println();
            if(hpBefore<=hpAfter){
                System.out.println("The ant is impervious to your attacks, and you are quickly slain.");
            }else{
                System.out.println("Your strike is true, and the ant is defeated.");
            }
        }catch(Exception e){
            System.out.println("The ant is impervious to your attacks, and you are quickly slain.");
            return;
        }
        pause(sc);
        System.out.println("A glimmer catches your eye, from beneath the remains of the giant ant...");
        Item weapon = new Item("nothing", 0);
        try{
            weapon = new Weapon();
        }catch(Exception e){
            whoops();
            return;
        }
        try{
            System.out.println("You try to pick up the shining object");
            pause(sc);
            player.pickUp(weapon);
        }catch(Exception e){
            whoops();
            return;
        }

        if(player.checkInventory(0).toString().equals("junk")){
            System.out.println("It turns out to be just junk. You move on.");
        } else{
            if(player.getPlayerClass().equals("Wizard")){
                System.out.println("An ancient wizard's staff, crackling with arcane power!");
                System.out.println("An inscription on the weapon reads: " + player.checkInventory(0).toString());
            }else if(player.getPlayerClass().equals("Knight")){
                System.out.println("An exquisite sword, arcane runes etched into the blade!");
                System.out.println("An inscription on the weapon reads: " + player.checkInventory(0).toString());
            }else if(player.getPlayerClass().equals("Rogue")){
                System.out.println("An elvish bow of living wood, strung with unicorn hair!");
                System.out.println("An inscription on the weapon reads: " + player.checkInventory(0).toString());
            }
        }
        pause(sc);

        System.out.println("Through a gap in the tree canopy, you see a mountain in the distance.");
        System.out.println("You decide to start making your way towards it...");
        pause(sc);

        System.out.println("You stumble into a clearing and find yourself face to face with a ferocious tiger!");

        Monster secondMonster;
        try{
            try{
                secondMonster = new Tiger("weak");
            }catch(Exception e){
                secondMonster = new Tiger();
            }
        }catch(Exception e){
            whoops();
            return;
        }
        if(secondMonster.getSpecies().equals("monster")){
            System.out.println("Before you can even blink, a monster too terrible to describe leaps out of the bushes and ends your life.");
            return;
        }
        System.out.println();
        try{
            printAscii("tiger.txt");
            System.out.println();
        }catch(Exception e){
            return;
        }
        pause(sc);

        if(player.getAttackStrength() > 500){
            System.out.println("As the tiger is about to pounce, it notices your magnificent new weapon.");
            System.out.println("Instead of attacking, the tiger purrs and places a small glass bottle of");
            System.out.println("blue liquid at your feet before walking into the jungle...");
        }else{
            secondMonster.attack(player);
            System.out.println("The tiger's deadly attack makes quick work of you. You are eaten.");
            return;
        }
        pause(sc);

        Potion potionOfDefence;
        try{
            potionOfDefence = new Potion();
        }catch(Exception e){
            whoops();
            return;
        }

        try{
            System.out.println("You pick up the bottle.");
            player.pickUp(potionOfDefence);
        }catch(Exception e){
            whoops();
            return;
        }

        if(player.checkInventory(1).toString().equals("junk")){
            System.out.println("The liquid inside looks gross, and you throw the bottle away.");
        } else{
            System.out.println("A potion of fire resistance! This will be very useful if you are attacked by a dragon!");
        }
        pause(sc);

        System.out.println("You leave the clearing and carry on heading toward the mountain.");
        System.out.println("After hours of stumbling over roots and hacking through branches,");
        System.out.println("the trees begin to thin. You are finally out of the jungle, and");
        System.out.println("begin your ascent of the mountain.");

        pause(sc);

        System.out.println("As you near the summit, you notice a large cave. As you approach it,");
        System.out.println("you hear a roar in the distance and the sound of....wing beats...?");

        pause(sc);

        Monster thirdMonster;
        try{
            try{
                thirdMonster = new Dragon();
            }catch(Exception e){
                thirdMonster = new Ant();
            }
        }catch(Exception e){
            whoops();
            return;
        }
        if(thirdMonster.getSpecies().equals("monster")){
            System.out.println("Before you can even blink, a monster too terrible to describe leaps out from behind a rock and ends your life.");
            return;
        }
        System.out.println("A fire breathing dragon! How unexpected!");
        try{
            printAscii("dragon.txt");
            System.out.println();
        }catch(Exception e){
            return;
        }
        pause(sc);

        System.out.println("Before the dragon can attack, you quickly drink the potion...");
        try{
            player.setDefence(((Potion)player.checkInventory(1)).consume());
        }catch(Exception e){
            System.out.println("* splutter * Oh no! It was poison!!");
            return;
        }
        pause(sc);

        thirdMonster.attack(player);
        if(player.getHP() > 0){
            System.out.println("The fire washes over you. You are unharmed.");
        } else{
            System.out.println("You are burnt to a crisp.");
            return;
        }
        pause(sc);

        System.out.println("You launch a daring counter-attack as the dragon swoops past...");
        player.attack(thirdMonster);
        pause(sc);

        System.out.println("Your strike is true, and the dragon is defeated.");
        System.out.println("You go into the cave expecting  treasure. Instead,");
        System.out.println("you find only a flash drive. After returning to civilization,");
        System.out.println("you discover that the flash drive contains a million bitcoin.");
        System.out.println("You live happily ever after.");
        System.out.println();

        try{
            printAscii("gameOver.txt");
            System.out.println();
        }catch(Exception e){
            return;
        }
        sc.close();
    }

    public static void printAscii(String fileName) throws IOException {
        File dir = new File(".");
        File fin = new File(dir.getCanonicalPath() + File.separator + fileName);
        FileInputStream fis = new FileInputStream(fin);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void pause(Scanner sc){
        System.out.println();
        System.out.println("Press enter to continue...");
        System.out.println();
        sc.nextLine();
    }

    public static void whoops(){
        System.out.println("Wait...something doesn't feel right!");
        System.out.println("You are swallowed up by a shadowy terror.");
    }
}
