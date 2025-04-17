package Polymorphism;

class Robot {
    public void learn() {
        System.out.println("Robots can learn almost anything!");
    }
    public void charge() {
        System.out.println("Robots need charging to operate.");
    }
     void tasks() {
        System.out.println("Robots complete tasks efficiently!");
    }
}
   class Main3 {
         public static void main(String[] args) {
             Robot robo = new Robot();
             operateRobo(robo);
             Robot robo2 = new Robot();
           //  operateRobo(robo2);
         }

         public static void operateRobo(Robot robo) {
             robo.learn();
             robo.charge();
             robo.tasks();
         }
     }
