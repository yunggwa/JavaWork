package Day13;

class Customer{
    private  int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;

    Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }
    int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }
    String showCustomerInfo(){
        return  customerName + "님의 등급은 " + customerGrade + "이며" +
                "보너스 포인트는 : " + bonusPoint + "입니다";
    }
}

class VIPCo extends Customer{
    double saleRatio;
    VIPCo(){
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }
    int calcPrice(int price){
        bonusPoint += price * bonusPoint;
        return price = (int)(price * saleRatio);
    }
}

public class MethodOveridingTest {
}
