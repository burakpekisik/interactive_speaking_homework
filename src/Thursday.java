//22118080062 - Ali Burak Pekışık

//Perşembe günü için oluşturulmuş olan class. Haftaiçi aktivitelerinin bulunduğu classı extend etmektedir.
public class Thursday extends WeekdaysRoutines implements PlayingVideoGames, ReadingBook {
    private String gameType; //Interface'de kullanılabilmesi adına gameType değişkeni tanımlanır.
    private boolean drinkCoffee; //Interface'de kullanılabilmesi adına drinkCoffee değişkeni tanımlanır.

    //Gereken değişkenler extend edilen class'a super ile iletilir.
    public Thursday(String time, String when, String destination, String[] lectureNames, String whatToDo, String seriesName, boolean isLunch, boolean pinball, boolean drinkCoffee, boolean havingChat) {
        super(time, when, destination, lectureNames, whatToDo, seriesName, isLunch, pinball, drinkCoffee, havingChat);
    }

    public Thursday() {

    }

    //Kodun başında oluşturulan değişkenler için get-set metodları yazılır.
    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    @Override
    public boolean isDrinkCoffee() {
        return drinkCoffee;
    }

    @Override
    public void setDrinkCoffee(boolean drinkCoffee) {
        this.drinkCoffee = drinkCoffee;
    }
    
    //Gün özetinin yazdırılmasını sağlayan fonksiyon. Get set methodları kullanılarak superclass'ta ki değişkenlere müdahale edilir.
    public void PrintDay() {
        super.setTime("7.30 AM"); //Uyanış için saat ayarlanır.
        super.wakingUp(super.getTime()); //Superclass'ta bulunan uyanma metodu için parametre gönderilir.
        super.eating("breakfast", ""); //Yemek yeme metodunda kullanılmak üzere yemek zamanı belirlenir.
        super.setLectureNames(new String[]{"Academic English", "Differential Equations"}); //Superclass'ta bulunan fonksiyonlarda kullanılmak üzere günün dersleri parametre olarak gönderilir.
        super.preparingForSchool(super.getLectureNames()); //Ders adlarına göre superclass'ta bulunan derse hazırlık fonksiyonuna parametre gönderilir.
        super.setDestination("Bahçelievler Ankaray Station"); //Yürünülen yeri anlatmak amacıyla parametre gönderilir.
        super.walkingTo(super.getDestination()); //Yürünülen yer parametre alınarak yazdırılır.
        super.setDestination("lecture's classroom after I get off the train at Maltepe."); //Yürünülen yeri anlatmak amacıyla parametre gönderilir.
        super.walkingTo(super.getDestination()); //Yürünülen yer parametre alınarak yazdırılır.
        super.beforeLecture(true, true, "Academic English"); //Ayarlanan değişkenlere göre ders öncesi yapılan aktiviteler yazdırılır.
        super.setTime("9.30 AM"); //Yapılacak aktivite için zaman ayarlaması yapılır.
        super.listeningLecture(super.getLectureNames(), "Academic English", super.getTime());
        super.setLunch(true); //Öğle yemeğinin yenip yenmediğini belirleyen değişken ayarlanır.
        super.setPinball(false); //Langırt oynanıp oynanmadığını belirleyen değişken ayarlanır.
        super.afterLecture(super.isLunch(), super.isPinball(), "Soup, pasty and fruit"); //Ayarlanan değişkenlere göre ders sonrası yapılan aktiviteler yazdırılır.
        super.setTime("1.30 PM"); //Yapılacak aktivite için zaman ayarlaması yapılır.
        super.listeningLecture(super.getLectureNames(), "Differential Equations", super.getTime()); //Ders dinleme aktivitesi gerçekleştirilir, gerekli çıktı gönderilen parametrelere göre belirlenir.
        super.setDestination("Maltepe Ankaray Station"); //Yürünülen hedef belirlenir.
        super.walkingTo(super.getDestination()); //Yürünülen hedefe göre çıktı alınır.
        super.setWhatToDo("Drinking coffee, surfing on social media, working on personal barcode scanner project."); //Boş zamanda yapılan aktiviteler yazdırılır.
        super.freeTime(super.getWhatToDo()); //Boş zamanda yapılan aktivitenin çıktısı yazdırılır.
        this.setGameType("racing"); //Oyun oynama metoduna gönderilecek "oyun çeşidi" belirlenir.
        this.playingVideoGames(this.getGameType()); //Hazırlanan parametre class içerisinde yazılan metoda iletilir.
        super.setWhen("dinner"); //Yemek zamanı belirlenir.
        super.eating(super.getWhen(), "parsley, pasta"); //Belirlenen zamana ve menüye çıktı alınır.
        super.study("Electric, Electronic Circuits"); //Çalışılan ders ile ilgili çıktı alınır.
        this.readingBook("Atomic Habits to motivate myself."); //Okunulan kitap belirlenir.
        super.setSeriesName("Dr. House Season 4."); //İzlenilen dizi adı belirlenir.
        super.watch(super.getSeriesName()); //İzlenilen diziye göre çıktı alınır.
        super.setTime("11 PM"); //Yatma saati için zaman belirlenir.
        super.sleep(super.getTime()); //Belirlenen zamana göre uyku için çıktı alınır.
    }

    //Interface'lerde bulunan fonksiyonlar bu class içerisinde doldurulur.
    @Override
    public void playingVideoGames(String gameType) {
        System.out.println("I love playing " + gameType + " games. So It's time to play some!");
    }

    @Override
    public void readingBook(String bookName) {
        System.out.println("Nowadays reading book is my one of the most favourite activity to do. I'm currently reading " + bookName);
    }
}
