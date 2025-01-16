 public class Singleton{
    private static  volatile Singleton singleton;
    
    private Singleton(){

    }

    public static Singleton getinstance(){
        if(singleton == null){
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}