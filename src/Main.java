public class Main {

    public static Watch someFunc(){
        return new Watch(someFunc().getHours(), someFunc().getMinutes(), someFunc().getSeconds());
    }
    public static void main(String[] args) {
        Watch watch = someFunc();
        boolean islife = true;



        while (islife){
            System.out.println(watch.getHours() + ":" + watch.getMinutes() + ":" + watch.getSeconds());
        }
    }
}