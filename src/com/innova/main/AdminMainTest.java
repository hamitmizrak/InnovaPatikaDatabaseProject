package com.innova.main;

import com.innova.controller.AdminController;
import com.innova.dto.AdminDto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class AdminMainTest {
    public static void main(String[] args) {
        AdminController adminController = new AdminController();

        //create
//        AdminDto adminDto=new AdminDto();
//        adminDto.setAdminName("Beytullah");
//        adminDto.setAdminSurname("Zor");
//        adminController.create(adminDto);

        //delete
//        AdminDto adminDto=new AdminDto();
//        adminDto.setAdminID(1);
//        adminController.delete(adminDto);

        //güncelleme
//        AdminDto adminDto=new AdminDto();
//        adminDto.setAdminID(2);
//        adminDto.setAdminName("Furkan-3 ");
//        adminDto.setAdminSurname("Nisanci-3 ");
//        adminController.update(adminDto);

        //listeleme
        AdminDto adminDto = new AdminDto();
        List<AdminDto> list = new ArrayList<>();
        for (AdminDto dto : adminController.list()) {
            list.add(dto);
        }

        System.out.println("\n1.YOL ITERATIVE FOR************");
        //1.yol
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        //2.yol
        System.out.println("\n2.YOL FOREACH DÖNGÜSÜ************");
        for (AdminDto newList : list) {
            System.out.println(newList);
        }

        //3.yol
        System.out.println("\n3.YOL FOREACH DÖNGÜSÜ************");
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Java 8 Stream API
        //filter,map,reduce,sorted()
        System.out.println("\nN.YOL Stream()************");
        list.forEach(System.out::println);
        System.out.println("\n************");
        list.stream().forEach(System.out::println);
        System.out.println("\n************");
        list.stream().collect(Collectors.toList()).forEach(System.out::println);


        //List=Tekrarlı veya tekrarsız büütn dataları ekler
        //L-A-V
        //LinkedList = Araya yerleştirme ,sil
        //ArrayList  = Ekleme veya arama işlemlerimnde
        //Vector     =

        //Set=Tekrarsız
        //Map=key-value

    }

}

