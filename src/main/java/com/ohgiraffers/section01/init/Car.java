package com.ohgiraffers.section01.init;

public class Car {

    //필드에 값 선언
    private String modelName;
    private int maxSpeed;

    //필드에 있는 매개변수들을 대입_간접접근
    public Car(String modelName, int maxSpeed){
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;

    }

    //메소드
    public void driveMaxSpeed(){
        System.out.println(modelName + " 이(가) 최고시속 " + maxSpeed + "km/h 로 달려갑니다. ");

    }

}
