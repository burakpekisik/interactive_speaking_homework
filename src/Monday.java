//22118080062 - Ali Burak Pekışık

//Pazartesi günü için oluşturulmuş olan class. Haftaiçi aktivitelerinin bulunduğu classı extend etmektedir.
public class Monday extends WeekdaysRoutines implements PrepareInstagramStory, ReadingBook {
    private String bookName; //Interface'de kullanılabilmesi adına bookName değişkeni tanımlanır.

    //Gereken değişkenler extend edilen class'a super ile iletilir.
    public Monday(String time, String when, String destination, String[] lectureNames, String whatToDo, String seriesName, boolean isLunch, boolean pinball, boolean drinkCoffee, boolean havingChat) {
        super(time, when, destination, lectureNames, whatToDo, seriesName, isLunch, pinball, drinkCoffee, havingChat);
    }

    public Monday() {

    }

    //Kodun başında oluşturulan değişkenler için get-set metodları yazılır.
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    @Override
    public void PrintDay() {
        super.setTime("7.15 AM");
        super.wakingUp(this.getTime());
        this.preparingInstagramStory();
        super.setWhatToDo("surfed on social media");
        this.setBookName("Atomic Habits");
        this.readingBook(this.getBookName());
        super.study("Differential Equations lecture");
        super.setLectureNames(new String[]{"Probability and Statistics", "Data Structures"});
        super.preparingForSchool(this.getLectureNames());
        super.setDestination("Bahçelievler Ankaray Station");
        super.walkingTo(this.getDestination());
        super.setDestination("lecture's classroom after I get off the train at Maltepe.");
        super.walkingTo(this.getDestination());
        super.setDrinkCoffee(false);
        super.setHavingChat(true);
        super.beforeLecture(this.isDrinkCoffee(), this.isHavingChat(), "Probability and Statistics");
        super.listeningLecture(this.getLectureNames(), "Probability and Statistics", "1.30 PM");
        super.setLunch(true);
        super.setPinball(false);
        super.afterLecture(this.isLunch(), this.isPinball(), "Çiğ Köfte and coffee");
        super.listeningLecture(this.getLectureNames(), "Data Structures", "5.30 PM");
        super.setLunch(false);
        super.setPinball(true);
        super.afterLecture(this.isLunch(), this.isPinball(), "");
        super.setDestination("Maltepe Ankaray Station");
        super.walkingTo(this.getDestination());
        super.setWhatToDo("Surfing on social media because I was tired.");
        super.freeTime(this.getWhatToDo());
        super.setSeriesName("Dr. House");
        super.watch(this.getSeriesName());
        super.setTime("11 PM");
        super.sleep(this.getTime());
    }
    
    //Interface'lerde bulunan fonksiyonlar bu class içerisinde doldurulur.
    @Override
    public void preparingInstagramStory() {
        System.out.println("As a student I also help my family about managing their company's social media. So this morning I prepared a Instagram Story.");
    }

    @Override
    public void readingBook(String bookName) {
        System.out.println("Nowadays reading book is my one of the most favourite activity to do. I'm currently reading " + bookName);
    }
}
