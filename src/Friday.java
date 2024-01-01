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
        super.setTime("7.00 AM");
        super.wakingUp(this.getTime());
        super.setLectureNames(new String[]{"Electric Electronic Circuits"});
        super.preparingForSchool(this.getLectureNames());
        super.setWhen("breakfast");
        super.eating(this.getWhen(), "");
        super.setDestination("Bahçelievler Ankaray Station");
        super.walkingTo(this.getDestination());
        super.setDestination("lecture's classroom after I get off the train at Maltepe.");
        super.walkingTo(this.getDestination());
        this.setDrinkCoffee(false);
        super.setHavingChat(true);
        super.beforeLecture(this.isDrinkCoffee(), this.isHavingChat(), "Electric Electronic Circuits");
        super.listeningLecture(this.getLectureNames(), "Electric Electronic Circuits", "9.40 AM");
        super.setLunch(false);
        super.setPinball(true);
        super.afterLecture(this.isLunch(), this.isPinball(), "");
        super.setDestination("Maltepe Ankaray Station");
        super.walkingTo(this.getDestination());
        super.setWhatToDo("Eating junk food and also working on personal barcode scanning project");
        this.drinkingCoffee("Also a coffee goes well after lecture.");
        this.setGameType("action");
        this.playingVideoGames(this.getGameType());
        super.freeTime(this.getWhatToDo());
        super.setWhen("dinner");
        super.eating(this.getWhen(), "Tarhana soup, pasta and trileçe.");
        super.study("Linked List from Data structures");
        this.setBookName("Atomic Habits.");
        this.readingBook(this.getBookName());
        super.setTime("9.30 PM");
        super.sleep(this.getTime());
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
