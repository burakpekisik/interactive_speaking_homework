//22118080062 - Ali Burak Pekışık

//Pazar günü için oluşturulmuş olan class. Haftasonu aktivitelerinin bulunduğu classı extend etmektedir.
public class Sunday extends WeekendRoutines implements PlayingVideoGames, ReadingBook, PrepareInstagramStory, DrinkingCoffee {
    private String gameType; //Interface'de kullanılabilmesi adına gameType değişkeni tanımlanır.
    private String bookName; //Interface'de kullanılabilmesi adına bookName değişkeni tanımlanır.

    //Gereken değişkenler extend edilen class'a super ile iletilir.
    public Sunday(String time, String menu, String when, String destination, String[] lectureNames, String whatToDo, String seriesName, boolean drinkCoffee) {
        super(time, menu, when, destination, lectureNames, whatToDo, seriesName, drinkCoffee);
    }

    public Sunday() {

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
    
    //Gün özetinin yazdırılmasını sağlayan fonksiyon. Get set methodları kullanılarak superclass'ta ki değişkenlere müdahale edilir.
    @Override
    public void PrintDay() {
        super.setTime("8.00 AM"); //Uyanış için saat ayarlanır.
        super.wakingUp(super.getTime()); //Superclass'ta bulunan uyanma metodu için parametre gönderilir.
        this.preparingInstagramStory(); //Gün içerisinde Instagram gönderisi hazırlandığından dolayı çıktı alınır.
        super.setSeriesName("Dr. House Season 4"); //İzlenilen dizi adı belirlenir.
        super.watch(super.getSeriesName()); //İzlenilen diziye göre çıktı alınır.
        super.setWhatToDo("working on personal barcode project."); //Boş zamanda yapılan aktiviteler yazdırılır.
        super.freeTime(super.getWhatToDo()); //Boş zamanda yapılan aktivitenin çıktısı yazdırılır.
        this.setGameType("action games"); //Oyun oynama metoduna gönderilecek "oyun çeşidi" belirlenir.
        this.playingVideoGames(this.getGameType()); //Hazırlanan parametre class içerisinde yazılan metoda iletilir.
        super.eating("lunch", "For today's lunch I'd like to go with something cheaper; Noodles with curry chicken."); //Yenilen öğle yemeği hakkında superclass üzerinde bulunan fonksiyon üzerinden çıktı alınır.
        this.playingVideoGames("playing racing video games, from 4 PM to 6 PM"); //Oyun oynama metoduna gönderilecek "oyun çeşidi" belirlenir.
        super.eating("dinner", "beands and rice with pickles"); //Belirlenen zamana ve menüye çıktı alınır.
        this.drinkingCoffee("As always, I love drinking coffee after dinner."); //Kahve içme interface'ine istenen parametre iletilir ve çıktı alınır.
        super.study("Differential Equations for 2 hours"); //Çalışılan ders ile ilgili çıktı alınır.
        this.setBookName("Atomic Habits"); //Okunulan kitap belirlenir.
        this.readingBook(this.getBookName()); //Okunulan kitaba göre çıktı alınır.
        super.setSeriesName("Dr. House Season 4"); //İzlenilen dizi adı belirlenir.
        super.watch(super.getSeriesName()); //İzlenilen diziye göre çıktı alınır.
        super.setTime("10 PM"); //Yatma saati için zaman belirlenir.
        super.sleep(super.getTime()); //Belirlenen zamana göre uyku için çıktı alınır.
    }
    
    //Interface'lerde bulunan fonksiyonlar bu class içerisinde doldurulur.
    @Override
    public void playingVideoGames(String gameType) {
        System.out.println("I love playing " + gameType + ". So It's time to play some!");
    }

    @Override
    public void readingBook(String bookName) {
        System.out.println("Nowadays reading book is my one of the most favourite activity to do. I'm currently reading " + bookName);
    }

    @Override
    public void preparingInstagramStory() {
        System.out.println("As a student I also help my family about managing their company's social media. So this morning I prepared a Instagram Story.");
    }

    @Override
    public void drinkingCoffee(String time) {
        System.out.println(time);
    }
}
