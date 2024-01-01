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
        super.setTime("8.00 AM");
        this.preparingInstagramStory();
        super.setSeriesName("Dr. House Season 4");
        super.watch(this.getSeriesName());
        super.setWhatToDo("working on personal barcode project.");
        super.freeTime(this.getWhatToDo());
        this.setGameType("action games");
        this.playingVideoGames(this.getGameType());
        super.eating("lunch", "For today's lunch I'd like to go with something cheaper; Noodles with curry chicken.");
        this.playingVideoGames("playing racing video games, from 4 PM to 6 PM");
        super.eating("dinner", "beands and rice with pickles");
        this.drinkingCoffee("As always, I love drinking coffee after dinner.");
        super.study("Differential Equations for 2 hours");
        this.setBookName("Atomic Habits");
        this.readingBook(this.getBookName());
        super.setSeriesName("Dr. House Season 4");
        super.watch(this.getSeriesName());
        super.setTime("10 PM");
        super.sleep(this.getTime());
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
