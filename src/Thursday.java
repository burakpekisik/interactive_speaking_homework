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
        this.setTime("7.30 AM");
        super.wakingUp(this.getTime());
        super.eating("breakfast", "");
        this.setLectureNames(new String[]{"Academic English", "Differential Equations"});
        super.preparingForSchool(this.getLectureNames());
        this.setDestination("Bahçelievler Ankaray Station");
        super.walkingTo(this.getDestination());
        this.setDestination("lecture's classroom after I get off the train at Maltepe.");
        super.walkingTo(this.getDestination());
        super.beforeLecture(true, true, "Academic English");
        this.setTime("9.30 AM");
        super.listeningLecture(this.getLectureNames(), "Academic English", this.getTime());
        this.setLunch(true);
        this.setPinball(false);
        super.afterLecture(this.isLunch(), this.isPinball(), "Soup, pasty and fruit");
        this.setTime("1.30 PM");
        super.listeningLecture(this.getLectureNames(), "Differential Equations", this.getTime());
        this.setDestination("Maltepe Ankaray Station");
        super.walkingTo(this.getDestination());
        this.setWhatToDo("Drinking coffee, surfing on social media, working on personal barcode scanner project.");
        super.freeTime(this.getWhatToDo());
        this.setGameType("racing");
        this.playingVideoGames(this.getGameType());
        this.setWhen("dinner");
        this.eating(this.getWhen(), "parsley, pasta");
        super.study("Electric, Electronic Circuits");
        this.readingBook("Atomic Habits to motivate myself.");
        this.setSeriesName("Dr. House Season 4.");
        super.watch(this.getSeriesName());
        this.setTime("11 PM");
        this.sleep(this.getTime());
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
