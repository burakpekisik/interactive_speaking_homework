//22118080062 - Ali Burak Pekışık

//Çarşamba günü için oluşturulmuş olan class. Haftaiçi aktivitelerinin bulunduğu classı extend etmektedir.
public class Wednesday extends WeekdaysRoutines implements DrinkingCoffee, PlayingVideoGames, Shopping {
    private boolean drinkCoffee; //Interface'de kullanılabilmesi adına drinkCoffee değişkeni tanımlanır.
    private String shopName; //Interface'de kullanılabilmesi adına shopName değişkeni tanımlanır.
    private String gameType; //Interface'de kullanılabilmesi adına gameType değişkeni tanımlanır.

    //Gereken değişkenler extend edilen class'a super ile iletilir.
    public Wednesday(String time, String when, String destination, String[] lectureNames, String whatToDo, String seriesName, boolean isLunch, boolean pinball, boolean drinkCoffee, boolean havingChat) {
        super(time, when, destination, lectureNames, whatToDo, seriesName, isLunch, pinball, drinkCoffee, havingChat);
    }

    public Wednesday() {

    }
    
    //Kodun başında oluşturulan değişkenler için get-set metodları yazılır.
    @Override
    public boolean isDrinkCoffee() {
        return drinkCoffee;
    }

    @Override
    public void setDrinkCoffee(boolean drinkCoffee) {
        this.drinkCoffee = drinkCoffee;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
    
    //Gün özetinin yazdırılmasını sağlayan fonksiyon. Get set methodları kullanılarak superclass'ta ki değişkenlere müdahale edilir.
    public void PrintDay() {
        super.setTime("7.30 AM"); //Uyanış için saat ayarlanır.
        super.wakingUp(super.getTime()); //Superclass'ta bulunan uyanma metodu için parametre gönderilir.
        super.setWhen("breakfast"); //Yemek yeme metodunda kullanılmak üzere yemek zamanı belirlenir.
        super.eating(super.getWhen(), ""); //Kahvaltı yendiği anlatılmak için parametreler gönderilir, 1 adet "" parametre gönderilmesinin sebebi kahvaltıda genel olarak aynı menü çıkmaktadır.
        super.setTime("Today's first morning coffee at 8 AM"); //Kahve için saat ayarlanır.
        this.drinkingCoffee(super.getTime()); //Kahve içme interface'ine istenen parametre iletilir ve çıktı alınır.
        super.setWhatToDo("working on personal text recognition Android Application project from 8.15 AM - 10 AM."); //Boş zamanda yapılan aktiviteler yazdırılır.
        super.freeTime(super.getWhatToDo()); //Boş zamanda yapılan aktivitenin çıktısı yazdırılır.
        super.study("last weeks's OOP laboratory"); //Çalışılan ders ile ilgili çıktı alınır.
        super.setWhatToDo("working on personal text recognition Android Application project from 11 AM - 12 PM."); //Boş zamanda yapılan aktiviteler yazdırılır.
        super.freeTime(super.getWhatToDo()); //Boş zamanda yapılan aktivitenin çıktısı yazdırılır.
        super.study("one of the subjects of OOP: Exception Handling"); //Çalışılan ders ile ilgili çıktı alınır.
        super.setLectureNames(new String[]{"Object Oriented Programming Laboratory"}); //Superclass'ta bulunan fonksiyonlarda kullanılmak üzere günün dersleri parametre olarak gönderilir.
        super.preparingForSchool(super.getLectureNames()); //Ders adlarına göre superclass'ta bulunan derse hazırlık fonksiyonuna parametre gönderilir.
        super.setDestination("Bahçelievler Ankaray Station"); //Yürünülen yeri anlatmak amacıyla parametre gönderilir.
        super.walkingTo(super.getDestination()); //Yürünülen yer parametre alınarak yazdırılır.
        super.setDestination("lecture's classroom after I get off the train at Maltepe."); //Yürünülen yeri anlatmak amacıyla parametre gönderilir.
        super.walkingTo(super.getDestination()); //Yürünülen yer parametre alınarak yazdırılır.
        super.beforeLecture(false, true, "Object Oriented Programming Laboratory"); //Ayarlanan değişkenlere göre ders öncesi yapılan aktiviteler yazdırılır.
        super.listeningLecture(super.getLectureNames(), "Object Oriented Programming Laboratory", "2.30 PM"); //Ders dinleme aktivitesi gerçekleştirilir, gerekli çıktı gönderilen parametrelere göre belirlenir.
        super.setDestination("Maltepe Ankaray Station"); //Yürünülen hedef belirlenir.
        super.walkingTo(super.getDestination()); //Yürünülen hedefe göre çıktı alınır.
        this.setShopName("A101"); //Alışveriş yapma Interface'sinde kullanılacak market adı belirlenir.
        this.shopping(this.getShopName()); //Belirlenen market adı parametre olarak gönderilir ve yazdırılır.
        super.setWhatToDo("working on personal text recognition Android Application project from 4.30 PM - 6 PM."); //Boş zamanda yapılan aktiviteler yazdırılır.
        super.freeTime(super.getWhatToDo()); //Boş yapılan aktivitenin çıktısı yazdırılır.
        super.setWhen("dinner"); //Yemek yeme metodunda kullanılmak üzere yemek zamanı belirlenir.
        super.eating(super.getWhen(), "pasta and dolma"); //Belirlenen zamana ve menüye çıktı alınır.
        super.setTime("After dinner a coffee goes well at 6.45 PM");
        this.drinkingCoffee(super.getTime()); //Kahve içme interface'ine istenen parametre iletilir ve çıktı alınır.
        super.study("Differential Equations"); //Çalışılan ders ile ilgili çıktı alınır.
        this.setGameType("racing games"); //Oyun oynama metoduna gönderilecek "oyun çeşidi" belirlenir.
        this.playingVideoGames(this.getGameType()); //Hazırlanan parametre class içerisinde yazılan metoda iletilir.
        super.setSeriesName("Dr. House Season 4"); //İzlenilen dizi adı belirlenir.
        super.watch(super.getSeriesName()); //İzlenilen diziye göre çıktı alınır.
        super.setTime("10.30 PM"); //Yatma saati için zaman belirlenir.
        super.sleep(super.getTime()); //Belirlenen zamana göre uyku için çıktı alınır.
    }
    
    //Interface'lerde bulunan fonksiyonlar bu class içerisinde doldurulur.
    @Override
    public void drinkingCoffee(String time) {
        System.out.println(time);
    }

    @Override
    public void playingVideoGames(String gameType) {
        System.out.println("I love playing " + gameType + " games. So It's time to play some!");
    }


    @Override
    public void shopping(String shopName) {
        System.out.println("After a long school day some junk food might be good so I went " + shopName + " near my student dormitory.");
    }
}
