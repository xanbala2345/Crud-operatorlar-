
    public interface Operations {

        void add(Car dataCar);
        void deleteByID(int ID);
        void update(int ID,String name,String model,int id,int price,String engine,int year,int mileage);
        Car getCarById(int id);
        public Car get();

    }

