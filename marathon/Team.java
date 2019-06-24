package lesson1.marathon;

import lesson1.marathon.competitors.Competitor;
import lesson1.marathon.obstacles.Obstacle;



public class Team {

    public String name;
    Competitor[] DreamTeam;

    public Team (String name, Competitor...DreamTeam) {
        this.name=name;
        this.DreamTeam=DreamTeam;
    }

    public  void go (Obstacle[] obstacles) {
        for (Competitor c:DreamTeam) {
            for (Obstacle o:obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()){
                    break;
                }
            }
        }

    }
   public Competitor [] getDreamTeam() {
      return  DreamTeam;
   }
//    public void ListofTeam (){
//        for (Competitor c:DreamTeam) {
//            if(c.isOnDistance()) {
//                c.info();
//            }
//        }
//    }




    public void showResults() {
        for (Competitor c:DreamTeam) {
            if(c.isOnDistance()) {
                c.info();
            }
        }
    }

//    public void showAbilities () {
  //      for (Competitor c:DreamTeam) {
   //         System.out.println(c.maxRunDisctance());
   //         }
   //     }
        public void showAbilities () {
          for (Competitor c:DreamTeam) {
             c.inforun();
             }
         }




   //    public void ListofBestMembers (){ //второй вариант метода
//        for (int i = 0; i<4; i++) {
//            if (DreamTeam[i].isOnDistance()) {
//                DreamTeam[i].info();
//            }
//        }
//
//    }


}

