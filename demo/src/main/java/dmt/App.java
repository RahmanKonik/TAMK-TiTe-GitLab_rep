package dmt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new wildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        
        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();
    
        System.out.println("\nThe Duck says...");
        testDuck(duck);
        
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
      }
      static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
      }
}
