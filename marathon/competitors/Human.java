package lesson1.marathon.competitors;

public class Human implements Competitor {
    public String name;

   public static int maxRunDistance;
    public int maxSwimDistance;
    public int maxJumpHeight;

    public boolean active;

    public Human( String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public Human(String name) {
        this(name,400,15,3);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " успешно пробежал ");
        } else {
            System.out.println( name + " неудача в беге ");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(name + " успешно проплыл ");
        } else {
            System.out.println(name + " неудача в плавании ");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успех в прыжках ");
        } else {
            System.out.println(name + " неудача в прыжках ");
            active = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " "+ active);
    }

    @Override
    public void inforun ()
    {
        System.out.println(name+" Run_ability:" + maxRunDistance);
    }

    public void inforunHuman ()
    {
        System.out.println(name+" Run_ability:" + maxRunDistance);
    }
}
