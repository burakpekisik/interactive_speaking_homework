//22118080062 - Ali Burak Pekışık

//Cumartesi günü için oluşturulmuş olan class. Haftasonu aktivitelerinin bulunduğu classı extend etmektedir.
public class Saturday extends WeekendRoutines implements PlayingVideoGames, HangingOut, PrepareInstagramStory, ReadingBook, DrinkingCoffee {
    private String gameType; //Interface'de kullanılabilmesi adına gameType değişkeni tanımlanır.
    private String bookName; //Interface'de kullanılabilmesi adına bookName değişkeni tanımlanır.
    private boolean drinkCoffee; //Interface'de kullanılabilmesi adına drinkCoffee değişkeni tanımlanır.

    //Gereken değişkenler extend edilen class'a super ile iletilir.
    public Saturday(String time, String menu, String when, String destination, String[] lectureNames, String whatToDo, String seriesName, boolean drinkCoffee) {
        super(time, menu, when, destination, lectureNames, whatToDo, seriesName, drinkCoffee);
    }

    public Saturday() {

    }

    //Kodun başında oluşturulan değişkenler için get-set metodları yazılır
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

    //Gün özetinin yazdırılmasını sağlayan fonksiyon. Get set methodları kullanılarak superclass'ta ki değişkenlere müdahale edilir.
    @Override
    public void PrintDay() {
        super.setTime("8 AM"); //Uyanış için saat ayarlanır.
        super.wakingUp(super.getTime()); //Superclass'ta bulunan uyanma metodu için parametre gönderilir.
        this.preparingInstagramStory(); //Gün içerisinde Instagram çıktısı hazırlandığından dolayı çıktı alınır.
        this.setBookName("Atomic Habits"); //Okunulan kitap belirlenir.
        this.readingBook(this.getBookName()); //Kitap okuma çıktısı alınır.
        super.setWhen("breakfast"); //Yemek zamanı belirlenir.
        super.eating(super.getWhen(), ""); //Yemek yeme metodunda kullanılmak üzere yemek zamanı belirlenir.
        this.setGameType("action"); //Oyun oynama metoduna gönderilecek "oyun çeşidi" belirlenir.
        this.playingVideoGames(this.getGameType()); //Hazırlanan parametre class içerisinde yazılan metoda iletilir.
        this.hangingOut("Kentpark at 1.30 PM. So I better get ready."); //Class içerisinde hazırlanan dışarı çıkma eylemi için hedef parametre olarak iletilir ve çıktı alınır.
        super.setDestination("Near bus station to wait for the bus goes to Kentpark."); //Ankaray'dan sınıfa doğru yüründüğü destination olarak belirlenir.
        super.walkingTo(super.getDestination()); //Yürünülen yer parametre olarak yazdırılır.
        super.setDestination("Walking to Kentpark after getting off the bus."); //Ankaray'dan sınıfa doğru yüründüğü destination olarak belirlenir.
        super.walkingTo(super.getDestination()); //Yürünülen yer parametre olarak yazdırılır.
        System.out.println("Visiting dress shops, looking for new trends, new stuff, eating pasta from “Makarnam” for lunch and chatting with friends drinking Bubble Tea and lastly trying the new Chocolate with Baklava and returning dormitory."); //Bu çıktıyı karşılayacak tam bir method bulunmadığından println ile yazdırıldı.
        super.setWhen("dinner"); //Yemek zamanı belirlenir.
        super.eating(super.getWhen(), "Kısır and Kumru"); //Belirlenen zamana ve menüye çıktı alınır.
        this.drinkingCoffee("A coffee that goes after a long day!"); //Kahve içme interface'ine istenen parametre iletilir ve çıktı alınır.
        this.readingBook("Atomic Habits."); //Okunulan kitap belirlenir.
        this.setGameType("racing"); //Oyun oynama metoduna gönderilecek "oyun çeşidi" belirlenir.
        this.playingVideoGames(this.getGameType()); //Hazırlanan parametre class içerisinde yazılan metoda iletilir.
        super.setTime("11 PM"); //Yatma saati için zaman belirlenir.
        super.sleep(super.getTime()); //Belirlenen zamana göre uyku için çıktı alınır.
    }
    
    //Interface'lerde bulunan fonksiyonlar bu class içerisinde doldurulur.
    @Override
    public void hangingOut(String destination) {
        System.out.println("It's always good to hang out so I invited my friends to " + destination);
    }

    @Override
    public void playingVideoGames(String gameType) {
        System.out.println("I love playing " + gameType + " games. So It's time to play some!");
    }

    @Override
    public void preparingInstagramStory() {
        System.out.println("As a student I also help my family about managing their company's social media. So this morning I prepared a Instagram Story.");
    }

    @Override
    public void readingBook(String bookName) {
        System.out.println("Nowadays reading book is my one of the most favourite activity to do. I'm currently reading " + bookName);
    }

    @Override
    public void drinkingCoffee(String time) {
        System.out.println(time);
    }
}
