import java.util.Scanner;

public class Main {

    public static void main ( String[] args ) {
        System.out.println ( "0-cixis et" );
        System.out.println ( "1:Maşın əlavə et " );
        System.out.println ( "2:bütün maşınların məlumatlarına baxın" );
        System.out.println ( "3:id-ye görə maşının məlumatına bax" );
        System.out.println ( "4:id-yə görə məlumatları sil" );
        System.out.println ( "5:məlumatları güncəlləyin" );
        Scanner sc = new Scanner ( System.in );
        Scanner sc1 = new Scanner ( System.in );

        Cars car = new Cars ( "Mercedes", "190E", 23, 5000, 1985, "2.0L/Benzin/250HP", 100000 );

        car.add ( car );
        int choose;
        while ( true ) {
            System.out.println ( "Seçiminizi edin:" );
            choose = sc.nextInt ( );
            if ( choose == 0 ) {
                System.out.println ( "Çıxış edirsiniz..." );
                break;
            }

            switch ( choose ) {

                case 1:

                    System.out.println ( "Maşının markasını daxil et: " );
                    String name = sc1.nextLine ( );

                    System.out.println ( "Maşının modelini daxil et: " );
                    String model = sc.nextLine ( );
                    sc.nextLine ( );
                    System.out.println ( "id daxil et: " );
                    int id = sc.nextInt ( );
                    sc.nextLine ( );

                    System.out.println ( "qiymət daxil et: " );
                    int price = sc.nextInt ( );
                    sc.nextLine ( );

                    System.out.println ( "il daxil et: " );
                    int year = sc.nextInt ( );
                    sc.nextLine ( );

                    System.out.println ( "Matorun ölçüsünü daxil et (tutum/yanacaq növü/at gücü): " );
                    String engine = sc.nextLine ( );

                    System.out.println ( "Kilometraj daxil et: " );
                    int mileage = sc.nextInt ( );
                    sc.nextLine ( );

                    Car newCar = new Car ( name, model, id, price, year, engine, mileage );
                    car.add ( newCar );
                    break;

                case 2:
                    System.out.println ( car.get ( ) );
                    break;
                case 3:
                    System.out.println ( "Id-ye görə məlumat sil" );
                    int IDForInfo = sc.nextInt ( );
                    car.deleteByID ( IDForInfo );
                    break;

                case 4:
                    System.out.println ( "Id-ye görə məlumat sil" );
                    int IDForDelete = sc.nextInt ( );
                    car.deleteByID ( IDForDelete );

                    break;
                case 5:
                    System.out.println ( "Yeniləmək istədiyiniz maşının ID-ni daxil edin:" );
                    int newid = sc.nextInt ( );
                    sc.nextLine ( );

                    System.out.println ( "Yeni markasını daxil edin:" );
                    String newName = sc.nextLine ( );

                    System.out.println ( "Yeni modelini daxil edin:" );
                    String newModel = sc.nextLine ( );

                    System.out.println ( "Yeni ID-ni daxil edin:" );
                    int newId = sc.nextInt ( );
                    sc.nextLine ( );

                    System.out.println ( "Yeni qiymətini daxil edin:" );
                    int newPrice = sc.nextInt ( );
                    sc.nextLine ( );

                    System.out.println ( "Yeni mühərrik növünü daxil edin:" );
                    String newEngine = sc.nextLine ( );

                    System.out.println ( "Yeni istehsal ilini daxil edin:" );
                    int newYear = sc.nextInt ( );

                    System.out.println ( "Yeni kilometrajını daxil edin:" );
                    int newMileage = sc.nextInt ( );

                    car.update ( newid, newName, newModel, newId, newPrice, newEngine, newYear, newMileage );

                    Car updatedCar = car.getCarById ( newId );
                    if ( updatedCar != null ) {
                        System.out.println ( "Yenilənmiş maşının məlumatları:" );
                        System.out.println ( "Marka: " + updatedCar.getName ( ) );
                        System.out.println ( "Model: " + updatedCar.getModel ( ) );
                        System.out.println ( "ID: " + updatedCar.getId ( ) );
                        System.out.println ( "Qiymət: " + updatedCar.getPrice ( ) );
                        System.out.println ( "İl: " + updatedCar.getYear ( ) );
                        System.out.println ( "Mühərrik: " + updatedCar.getEngine ( ) );
                        System.out.println ( "Kilometraj: " + updatedCar.getMileage ( ) );
                    } else {
                        System.out.println ( "Maşın tapılmadı!" );
                    }

            }

        }
    }
}