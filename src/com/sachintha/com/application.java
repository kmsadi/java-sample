package com.sachintha.com;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class application {
   public static void main(String[] args) {
      /*   List<String> students=new ArrayList<>();
        students.add("saman");
        students.add("nimal");
        students.add("kamal");
        students.add("kanthi");
        students.add("ruwan");
        students.add("isuri");
        System.out.println(students);

        List<String> filteredata=students.stream()
                .filter(s->s.length()>5)
                .collect(Collectors.toList());
       System.out.println(filteredata);

   */
  List<sensor> sensors= new ArrayList<>();
  sensor sensor1 = new sensor("living sensor",25);
  sensors.add(sensor1);
  sensor sensor2 = new sensor("bath room sensor",26);
  sensors.add(sensor2);
  sensor sensor3 = new sensor("bed sensor",29);
  sensors.add(sensor3);
  sensor sensor4 = new sensor("office sensor",30);
  sensors.add(sensor4);
  sensor sensor5 = new sensor("kitchen sensor",28);
  sensors.add(sensor5);



  List<sensor> hotsensors=sensors.stream()
          .filter(sensor -> sensor.getValue()>28)
          .collect(Collectors.toList());

       System.out.println(hotsensors);


  }


    }



