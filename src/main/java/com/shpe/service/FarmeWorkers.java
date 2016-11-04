package com.shpe.service;

/**
 * Created by teresamartinez on 11/3/16.
 */
public class FarmeWorkers {
    public FarmeWorkers() {
        FarmWorker FarmWorker1 = new FarmWorker( 21,"David", 299990);
        FarmWorker FarmWorker2 = new FarmWorker(18, "Karen", 299991);
        FarmWorker FarmWorker3 = new FarmWorker(35, "Monica", 299992);
        FarmWorker FarmWorker4 = new FarmWorker(25, "Jorge", 299993);
        FarmWorker FarmWorker5 = new FarmWorker(22, "Eduardo", 299994);
        FarmWorker FarmWorker6 = new FarmWorker(17, "Maria", 299995);
    }

    class FarmWorker {
        int agge;
        String nameWorker;
        public int userID;
        public FarmWorker(int age, String TheName, int id) {
            agge = age;
            nameWorker = TheName;
            userID = id;
        }
    }
}
