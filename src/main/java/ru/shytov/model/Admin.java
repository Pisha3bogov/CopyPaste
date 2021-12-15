package ru.shytov.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
@Table(name = "admin") //В этой строчке пишеться название которое будет в бд, его нужно поменять на название класса
public class Admin { //Не забудьте поменять название класса чтобы не было ошибок
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Дальше вводим свои поля, которые есть в таблице
    @Column
    private String login;
    //Тут тоже
    @Column
    private String password;
}
