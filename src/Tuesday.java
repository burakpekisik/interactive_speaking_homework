//22118080062 - Ali Burak Pekışık

//Salı günü için oluşturulmuş olan class. Haftaiçi aktivitelerinin bulunduğu classı extend etmektedir.
public class Tuesday extends WeekdaysRoutines {
    //Gereken değişkenler extend edilen class'a super ile iletilir.
	public Tuesday(String time, String when, String destination, String[] lectureNames, String whatToDo, String seriesName, boolean isLunch, boolean pinball, boolean drinkCoffee, boolean havingChat) {
        super(time, when, destination, lectureNames, whatToDo, seriesName, isLunch, pinball, drinkCoffee, havingChat);
    }

    public Tuesday() {

    }
    
    //Gün özetinin yazdırılmasını sağlayan fonksiyon. Get set methodları kullanılarak superclass'ta ki değişkenlere müdahale edilir.
    public void PrintDay() {
        super.setTime("7.30 AM"); //Uyanış için saat ayarlanır.
        super.wakingUp(super.getTime()); //Superclass'ta bulunan uyanma metodu için parametre gönderilir.
        super.setLectureNames(new String[]{"Object Oriented Programming", "Data Structures"}); //Superclass'ta bulunan fonksiyonlarda kullanılmak üzere günün dersleri parametre olarak gönderilir.
        super.preparingForSchool(super.getLectureNames()); //Ders adlarına göre superclass'ta bulunan derse hazırlık fonksiyonuna parametre gönderilir.
        super.setWhen("breakfast"); //Yemek yeme metodunda kullanılmak üzere yemek zamanı belirlenir.
        super.eating(super.getWhen(), ""); //Kahvaltı yendiği anlatılmak için parametreler gönderilir, 1 adet "" parametre gönderilmesinin sebebi kahvaltıda genel olarak aynı menü çıkmaktadır.
        super.setDestination("Bahçelievler Ankaray Station"); //Yürünülen yeri anlatmak amacıyla parametre gönderilir.
        super.walkingTo(super.getDestination()); //Yürünülen yer parametre alınarak yazdırılır.
        super.setDestination("lecture's classroom after I get off the train at Maltepe."); //Ankaray'dan sınıfa doğru yüründüğü destination olarak belirlenir.
        super.walkingTo(super.getDestination()); //Yürünülen yer parametre alınarak yazdırılır.
        this.setDrinkCoffee(true); //Ders öncesi yapılacak aktivitelerde kullanılmak amacıyla kahve içme boolean değişkeni ayarlanır.
        this.setHavingChat(true); //Ders öncesi yapılacak aktivitelerde kullanılmak amacıyla sohbet etme boolean değişkeni ayarlanır.
        super.beforeLecture(this.isDrinkCoffee(), super.isHavingChat(), "Differential Equations"); //Ayarlanan değişkenlere göre ders öncesi yapılan aktiviteler yazdırılır.
        super.listeningLecture(super.getLectureNames(), "Object Oriented Programming", "9.40 AM"); //Ders dinleme aktivitesi gerçekleştirilir, gerekli çıktı gönderilen parametrelere göre belirlenir.
        super.setLunch(false); //Öğle yemeğinin yenip yenmediğini belirleyen değişken ayarlanır.
        super.setPinball(true); //Langırt oynanıp oynanmadığını belirleyen değişken ayarlanır.
        super.afterLecture(super.isLunch(), super.isPinball(), ""); //Ayarlanan değişkenlere göre ders sonrası yapılan aktiviteler yazdırılır.
        super.listeningLecture(super.getLectureNames(), "Differential Equations", "1.30 PM"); //Ders dinleme aktivitesi gerçekleştirilir, gerekli çıktı gönderilen parametrelere göre belirlenir.
        super.setDestination("Maltepe Ankaray Station"); //Yürünülen hedef belirlenir.
        super.walkingTo(this.getDestination()); //Yürünülen hedefe göre çıktı alınır.
        super.setWhatToDo("tried to relax by surfing on social media, working on personal programming projects from 4 PM to 6 PM."); //Boş zamanda yapılan aktiviteler yazdırılır.
        super.freeTime(this.getWhatToDo()); //Boş zamanda yapılan aktivitenin çıktısı yazdırılır.
        super.setWhen("dinner"); //Yemek zamanı belirlenir.
        super.eating(this.getWhen(), "vegetable soup, schnitzel and pumpkin dessert."); //Belirlenen zamana ve menüye çıktı alınır.
        super.setWhatToDo("working on personal programming projects for one and a half hour."); //Boş zamanda yapılan aktiviteler yazdırılır.
        super.freeTime(super.getWhatToDo()); //Boş zamanda yapılan aktivitenin çıktısı yazdırılır.
        super.study("Object Oriented Programming laboratory"); //Çalışılan ders ile ilgili çıktı alınır.
        super.setSeriesName("Dr. House Season 4"); //İzlenilen dizi adı belirlenir.
        super.watch(this.getSeriesName()); //İzlenilen diziye göre çıktı alınır.
        super.setTime("11 PM"); //Yatma saati için zaman belirlenir.
        super.sleep(this.getTime()); //Belirlenen zamana göre uyku için çıktı alınır.
    }
}
