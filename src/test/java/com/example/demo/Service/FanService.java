package com.example.demo.Service;
import com.example.demo.FANS.Fans;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class FanService {
    int totalCount=0;
    int countOfFansOn = 0;
    ArrayList<Fans> fansArrayList=new ArrayList<>();
    Fans f1=new Fans();
    public FanService(){
        int i = 1;
        while (i <= 180) {
            Fans f = new Fans();
            fansArrayList.add(f);
            i++;
        }
    }
    public void switchon(int fanNum){
        Fans f1=fansArrayList.get(fanNum);
        if (f1.isOn() == false) {
            System.out.println("Switching on the fan");
            f1.switchOnTheFan();
            countOfFansOn++;
            totalCount++;
        } else {
            System.out.println("Fan is already running");
        }
    }
    public void switchoff(int fanNum){
        Fans f1=fansArrayList.get(fanNum);
        if (f1.isOn() == false) {
            //System.out.println("Fan is already off");
            //System.out.println("Switching off the fan");
        } else {
            f1.switchOffTheFan();
            //System.out.println("Fan is switching off");
            System.out.println("Fan is already off");
            countOfFansOn--;
            totalCount++;
        }
    }
    public void up(int fanNum){
        Fans f=fansArrayList.get(fanNum);
        f1.increase();
        totalCount++;
        System.out.println("Fan speed is : " + f1.getSpeed());
    }
    public void down(int fanNum){
        Fans f=fansArrayList.get(fanNum);
        f1.decrease();
        totalCount++;
        System.out.println("Fan speed is : " + f1.getSpeed());
    }
    public void report(){
        totalCount++;
        System.out.println("No. of fans in switched on status : " + countOfFansOn);
        System.out.println("Total no. of buttons pressed : "+totalCount);
    }
}