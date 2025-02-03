import java.nio.channels.DatagramChannel;
import java.util.ArrayList;
import java.util.Scanner;

public   class Cars  extends  Car implements  Operations {
    public Cars ( String name, String model, int id, int price, int year, String engine, int mileage ) {
        super ( name, model, id, price, year, engine, mileage );
    }

    ArrayList < Car > cars = new ArrayList <> ( );

    @Override
    public Car getCarById ( int userId ) {
        for ( Car car : cars ) {
            if ( userId == car.getId ( ) ) {

                return car;
            }else {
                System.out.println ("yanlis id daxil edilib");
            }
        }
        return null;
    }

    @Override
    public void add ( Car dataCar ) {
        cars.add ( dataCar );
        System.out.println ("melumat elave edildi");
    }


    @Override
    public void deleteByID ( int id ) {
        for ( int i = cars.size ( ) - 1; i >= 0; i-- ) {
            if ( cars.get ( i ).getId ( ) == id ) {
                cars.remove ( i );
                System.out.println ("melumat ugurla silindi");
            }else {
                System.out.println ("yanlis id daxil edilib");
            }
        }
    }

    @Override
    public Car get () {
        for ( Car car : cars ) {
            return car;
        }
        return null;
    }

    @Override
    public void update ( int ID, String name, String model, int id, int price, String engine, int year, int mileage ) {
        for ( Car car : cars ) {
            if ( car.getId ( ) == ID ) {
                car.setName ( name );
                car.setModel ( model );
                car.setId ( id );
                car.setPrice ( price );
                car.setEngine ( engine );
                car.setYear ( year );
                car.setMileage ( mileage );
                return;
            }else {
                System.out.println ("yanlis id daxil edilib");
            }
        }
    }
}
