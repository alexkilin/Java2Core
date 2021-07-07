package lesson1.marathon;

import lesson1.marathon.competitors.Cat;

import lesson1.marathon.competitors.Competitor;
import lesson1.marathon.competitors.Dog;
import lesson1.marathon.competitors.Human;
import lesson1.marathon.obstacles.*;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
      //  Competitor[] competitors = {new Human("Bob"),
      //          new Cat("Vaska"), new Dog("Tuzik")};
        Obstacle[] obstacles = {new Cross(80), new Wall(2), new Water(10)};
        Team Team = new Team ("Superteam",new Human("Bob",50,5,1), new Human("Vasya"), new Dog ("Tor"), new Human("Mike"));
//        for (Competitor c : Superteam) {
//            for (Obstacle o : obstacles) {
//                o.doIt(c);
//                if (!c.isOnDistance()) {
//                    break;
//                }
//            }
//        }
//
//       for (Competitor c : Team) {
//            c.info();
//        }
//
        Course course = new Course(obstacles);
        course.go(Team);
        Team.showResults();
        Team.showAbilities();
        Human Tim= new Human( "Tim", 100,200,3);
        Tim.inforunHuman();




      //  Team.ListofTeam();

    }
}
