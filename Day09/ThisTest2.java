package Day09;

class BD{
    int year;
    void setYear(int year){
        this.year = year;
    }
    void printThis(){
        System.out.println(this);
    }
}

public class ThisTest2 {
    public static void main(String[] args) {
        BD bDay = new BD();
        bDay.setYear(2002);
        System.out.println(bDay.year);
        System.out.println(bDay);
        bDay.printThis();
    }
}
