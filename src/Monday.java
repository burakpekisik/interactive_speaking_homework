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
        super.setTime("7.15 AM"); //Uyanış için saat ayarlanır.
        super.wakingUp(super.getTime()); //Superclass'ta bulunan uyanma metodu için parametre gönderilir.
        this.preparingInstagramStory(); //Gün içerisinde Instagram gönderisi hazırlandığından dolayı çıktı alınır.
        super.setWhatToDo("surfed on social media"); //Boş zamanda yapılan aktiviteler yazdırılır.
        this.setBookName("Atomic Habits"); //Okunulan kitap belirlenir.
        this.readingBook(this.getBookName()); //Okunulan kitaba göre çıktı alınır.
        super.study("Differential Equations lecture"); //Çalışılan ders ile ilgili çıktı alınır.
        super.setLectureNames(new String[]{"Probability and Statistics", "Data Structures"}); //Superclass'ta bulunan fonksiyonlarda kullanılmak üzere günün dersleri parametre olarak gönderilir.
        super.preparingForSchool(super.getLectureNames()); //Ders adlarına göre superclass'ta bulunan derse hazırlık fonksiyonuna parametre gönderilir.
        super.setDestination("Bahçelievler Ankaray Station"); //Yürünülen yeri anlatmak amacıyla parametre gönderilir.
        super.walkingTo(super.getDestination()); //Yürünülen yer parametre alınarak yazdırılır.
        super.setDestination("lecture's classroom after I get off the train at Maltepe."); //Ankaray'dan sınıfa doğru yüründüğü destination olarak belirlenir.
        super.walkingTo(super.getDestination()); //Yürünülen yer parametre olarak yazdırılır.
        super.setDrinkCoffee(false); //Ders öncesi yapılacak aktivitelerde kullanılmak amacıyla kahve içme boolean değişkeni ayarlanır.
        super.setHavingChat(true); //Ders öncesi yapılacak aktivitelerde kullanılmak amacıyla sohbet etme boolean değişkeni ayarlanır.
        super.beforeLecture(this.isDrinkCoffee(), super.isHavingChat(), "Probability and Statistics"); //Ayarlanan değişkenlere göre ders öncesi yapılan aktiviteler yazdırılır.
        super.listeningLecture(super.getLectureNames(), "Probability and Statistics", "1.30 PM"); //Ders dinleme aktivitesi gerçekleştirilir, gerekli çıktı gönderilen parametrelere göre belirlenir.
        super.setLunch(true); //Öğle yemeğinin yenip yenmediğini belirleyen değişken ayarlanır.
        super.setPinball(false); //Langırt oynanıp oynanmadığını belirleyen değişken ayarlanır.
        super.afterLecture(super.isLunch(), super.isPinball(), "Çiğ Köfte and coffee"); //Ayarlanan değişkenlere göre ders sonrası yapılan aktiviteler yazdırılır.
        super.listeningLecture(this.getLectureNames(), "Data Structures", "5.30 PM"); //Ders dinleme aktivitesi gerçekleştirilir, gerekli çıktı gönderilen parametrelere göre belirlenir.
        super.setLunch(false); //Öğle yemeğinin yenip yenmediğini belirleyen değişken ayarlanır.
        super.setPinball(true); //Langırt oynanıp oynanmadığını belirleyen değişken ayarlanı.
        super.afterLecture(super.isLunch(), super.isPinball(), ""); //Ayarlanan değişkenlere göre ders sonrası yapılan aktiviteler yazdırılır.
        super.setDestination("Maltepe Ankaray Station"); //Yürünülen hedef belirlenir.
        super.walkingTo(super.getDestination()); //Yürünülen hedefe göre çıktı alınır.
        super.setWhatToDo("Surfing on social media because I was tired."); //Boş zamanda yapılan aktiviteler yazdırılır.
        super.freeTime(super.getWhatToDo()); //Boş zamanda yapılan aktivitenin çıktısı yazdırılır.
        super.setSeriesName("Dr. House"); //İzlenilen dizi adı belirlenir.
        super.watch(super.getSeriesName()); //İzlenilen diziye göre çıktı alınır.
        super.setTime("11 PM"); //Yatma saati için zaman belirlenir.
        super.sleep(super.getTime()); //Belirlenen zamana göre uyku için çıktı alınır.
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
