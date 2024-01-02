//22118080062 - Ali Burak Pekışık

//Cuma günü için oluşturulmuş olan class. Haftaiçi aktivitelerinin bulunduğu classı extend etmektedir.
public class Friday extends WeekdaysRoutines implements DrinkingCoffee, PlayingVideoGames, ReadingBook {
    private String gameType; //Interface'de kullanılabilmesi adına gameType değişkeni tanımlanır.
    private String bookName; //Interface'de kullanılabilmesi adına bookName değişkeni tanımlanır.
    private boolean drinkCoffee; //Interface'de kullanılabilmesi adına drinkCoffee değişkeni tanımlanır.

    //Gereken değişkenler extend edilen class'a super ile iletilir.
    public Friday(String time, String when, String destination, String[] lectureNames, String whatToDo, String seriesName, boolean isLunch, boolean pinball, boolean drinkCoffee, boolean havingChat) {
        super(time, when, destination, lectureNames, whatToDo, seriesName, isLunch, pinball, drinkCoffee, havingChat);
    }

    public Friday() {

    }

    //Kodun başında oluşturulan değişkenler için get-set metodları yazılır.
    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public boolean isDrinkCoffee() {
        return drinkCoffee;
    }

    @Override
    public void setDrinkCoffee(boolean drinkCoffee) {
        this.drinkCoffee = drinkCoffee;
    }

    public void PrintDay() {
        super.setTime("7.00 AM"); //Uyanış için saat ayarlanır.
        super.wakingUp(super.getTime()); //Superclass'ta bulunan uyanma metodu için parametre gönderilir.
        super.setLectureNames(new String[]{"Electric Electronic Circuits"}); //Superclass'ta bulunan fonksiyonlarda kullanılmak üzere günün dersleri parametre olarak gönderilir.
        super.preparingForSchool(super.getLectureNames()); //Ders adlarına göre superclass'ta bulunan derse hazırlık fonksiyonuna parametre gönderilir.
        super.setWhen("breakfast"); //Yemek yeme metodunda kullanılmak üzere yemek zamanı belirlenir.
        super.eating(super.getWhen(), ""); //Kahvaltı yendiği anlatılmak için parametreler gönderilir, 1 adet "" parametre gönderilmesinin sebebi kahvaltıda genel olarak aynı menü çıkmaktadır.
        super.setDestination("Bahçelievler Ankaray Station"); //Yürünülen yeri anlatmak amacıyla parametre gönderilir.
        super.walkingTo(super.getDestination()); //Yürünülen yer parametre alınarak yazdırılır.
        super.setDestination("lecture's classroom after I get off the train at Maltepe."); //Ankaray'dan sınıfa doğru yüründüğü destination olarak belirlenir.
        super.walkingTo(super.getDestination()); //Yürünülen yer parametre olarak yazdırılır.
        this.setDrinkCoffee(false); //Ders öncesi yapılacak aktivitelerde kullanılmak amacıyla kahve içme boolean değişkeni ayarlanır.
        super.setHavingChat(true); //Ders öncesi yapılacak aktivitelerde kullanılmak amacıyla sohbet etme boolean değişkeni ayarlanır.
        super.beforeLecture(this.isDrinkCoffee(), super.isHavingChat(), "Electric Electronic Circuits"); //Ayarlanan değişkenlere göre ders öncesi yapılan aktiviteler yazdırılır.
        super.listeningLecture(super.getLectureNames(), "Electric Electronic Circuits", "9.40 AM"); //Ders dinleme aktivitesi gerçekleştirilir, gerekli çıktı gönderilen parametrelere göre belirlenir.
        super.setLunch(false); //Öğle yemeğinin yenip yenmediğini belirleyen değişken ayarlanır.
        super.setPinball(true); //Langırt oynanıp oynanmadığını belirleyen değişken ayarlanır.
        super.afterLecture(super.isLunch(), super.isPinball(), ""); //Ayarlanan değişkenlere göre ders sonrası yapılan aktiviteler yazdırılır.
        super.setDestination("Maltepe Ankaray Station"); //Yürünülen hedef belirlenir.
        super.walkingTo(super.getDestination()); //Yürünülen hedefe göre çıktı alınır.
        super.setWhatToDo("Eating junk food and also working on personal barcode scanning project"); //Boş zamanda yapılan aktiviteler yazdırılır.
        this.drinkingCoffee("Also a coffee goes well after lecture."); //Kahve içme interface'ine istenen parametre iletilir ve çıktı alınır.
        this.setGameType("action"); //Oyun oynama metoduna gönderilecek "oyun çeşidi" belirlenir.
        this.playingVideoGames(this.getGameType()); //Hazırlanan parametre class içerisinde yazılan metoda iletilir.
        super.freeTime(super.getWhatToDo()); //Boş zamanda yapılan aktivitenin çıktısı yazdırılır.
        super.setWhen("dinner"); //Yemek zamanı belirlenir.
        super.eating(super.getWhen(), "Tarhana soup, pasta and trileçe."); //Belirlenen zamana ve menüye çıktı alınır.
        super.study("Linked List from Data structures"); //Çalışılan ders ile ilgili çıktı alınır.
        this.setBookName("Atomic Habits."); //Okunulan kitap belirlenir.
        this.readingBook(this.getBookName()); //Okunulan kitaba göre çıktı alınır.
        super.setTime("9.30 PM"); //Yatma saati için zaman belirlenir.
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
    public void readingBook(String bookName) {
        System.out.println("Nowadays reading book is my one of the most favourite activity to do. I'm currently reading " + bookName);
    }
}
