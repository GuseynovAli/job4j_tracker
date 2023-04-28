package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String publish = "Неизвестное слово. " + eng;
        return publish;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        System.out.println(dummyDic.engToRus("cup"));
    }
}

