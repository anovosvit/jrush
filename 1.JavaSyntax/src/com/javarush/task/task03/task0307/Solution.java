package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "ddsdsd";
        Zerg zerg2 = new Zerg();
        zerg2.name = "ddfdfsdsd";
        Zerg zerg3 = new Zerg();
        zerg3.name = "ddsdssd";
        Zerg zerg4 = new Zerg();
        zerg4.name = "ddsdsad";
        Zerg zerg5 = new Zerg();
        zerg5.name = "ddsrdsd";

        Protoss protoss1 = new Protoss();
        protoss1.name = "gkljglkfj";
        Protoss protoss2 = new Protoss();
        protoss2.name = "gkljgdfdlkfj";
        Protoss protoss3 = new Protoss();
        protoss3.name = "gkljdsdsglkfj";

        Terran terran1 = new Terran();
        terran1.name = "fhjkzlk";
        Terran terran2 = new Terran();
        terran2.name = "dfhjkzlk";
        Terran terran3 = new Terran();
        terran3.name = "fhjkzdsdlk";
        Terran terran4 = new Terran();
        terran4.name = "fhjkzldddfk";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
