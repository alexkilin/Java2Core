package lesson1.marathon.obstacles;

import lesson1.marathon.Team;
import lesson1.marathon.competitors.Competitor;

public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void go(Team team){
        for (Competitor c:team.getDreamTeam()) {
            for (Obstacle o:obstacles) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }
    }
}
