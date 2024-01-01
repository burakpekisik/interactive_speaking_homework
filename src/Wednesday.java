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
        super.setTime("7.30 AM");
        super.wakingUp(this.getTime());
        super.setWhen("breakfast");
        super.eating(this.getWhen(), "");
        super.setTime("Today's first morning coffee at 8 AM");
        this.drinkingCoffee(this.getTime());
        super.setWhatToDo("working on personal text recognition Android Application project from 8.15 AM - 10 AM.");
        super.freeTime(this.getWhatToDo());
        super.study("last weeks's OOP laboratory");
        super.setWhatToDo("working on personal text recognition Android Application project from 11 AM - 12 PM.");
        super.freeTime(this.getWhatToDo());
        super.study("one of the subjects of OOP: Exception Handling");
        super.setLectureNames(new String[]{"Object Oriented Programming Laboratory"});
        super.preparingForSchool(this.getLectureNames());
        super.setDestination("Bahçelievler Ankaray Station");
        super.walkingTo(this.getDestination());
        super.setDestination("lecture's classroom after I get off the train at Maltepe.");
        super.walkingTo(this.getDestination());
        super.beforeLecture(false, true, "Object Oriented Programming Laboratory");
        super.listeningLecture(this.getLectureNames(), "Object Oriented Programming Laboratory", "2.30 PM");
        super.setDestination("Maltepe Ankaray Station");
        super.walkingTo(this.getDestination());
        this.setShopName("A101");
        this.shopping(this.getShopName());
        super.setWhatToDo("working on personal text recognition Android Application project from 4.30 PM - 6 PM.");
        super.freeTime(this.getWhatToDo());
        super.setWhen("dinner");
        super.setTime("6.15 AM");
        super.eating(this.getWhen(), this.getTime());
        super.setTime("After dinner a coffee goes well at 6.45 PM");
        this.drinkingCoffee(this.getTime());
        super.study("Differential Equations");
        this.setGameType("racing games");
        this.playingVideoGames(this.getGameType());
        super.setSeriesName("Dr. House Season 4");
        super.watch(this.getSeriesName());
        super.setTime("22.30 PM");
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
    public void shopping(String shopName) {
        System.out.println("After a long school day some junk food might be good so I went " + shopName + " near my student dormitory.");
    }
}
