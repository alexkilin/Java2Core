package L5;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF =SIZE/2;

    public static void main(String[] args) {
    myProcess_1();
    myProcess_2();
    }

    public static void myProcess_1 (){
        float[]arr1=new float[SIZE];
        for (int i = 0; i <SIZE ; i++) {
            arr1[i]=1;
        }
        long a=System.currentTimeMillis();
        for (int i = 0; i <SIZE ; i++) {
            arr1[i]=(float)(arr1[i]*Math.sin(0.2f+i/5)*Math.cos(0.2f+i/5)*Math.cos(0.4f+i/2));
        }
        System.out.println("Время выполнения первого метода: " + (System.currentTimeMillis()-a));

    }
    public static void myProcess_2 (){
        float[]arr2=new float[SIZE];
        for (int i = 0; i <SIZE ; i++) {
            arr2[i]=1;
        }
        long a=System.currentTimeMillis();
        float[]arr3=new float[HALF];
        float[]arr4=new float[HALF];
        System.arraycopy(arr2,0,arr3,0,5000000);
        System.arraycopy(arr2,5000000,arr4,0,5000000);
        Thread t1=new Thread(()->{
            for (int i = 0; i <HALF ; i++) {
                arr3[i]=(float)(arr3[i]*Math.sin(0.2f+i/5)*Math.cos(0.2f+i/5)*Math.cos(0.4f+i/2));
                System.out.println(arr3[i]+"1");
             }
            });


        Thread t2=new Thread(()->{
            for (int i = 0; i <HALF ; i++) {
                arr4[i]=(float)(arr4[i]*Math.sin(0.2f+i/5)*Math.cos(0.2f+i/5)*Math.cos(0.4f+i/2));
                System.out.println(arr4[i]+"2");
            }
            });
        t1.start();
        t2.start();

        System.arraycopy(arr3,0,arr2,0,5000000);
        System.arraycopy(arr4,0,arr2,5000000,5000000);

        System.out.println( "Время выполнения второго метода: " + (System.currentTimeMillis()-a));

    }
}
