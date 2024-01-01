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
        super.setTime("7.30 AM");
        super.wakingUp(this.getTime());
        super.setLectureNames(new String[]{"Object Oriented Programming", "Data Structures"});
        super.preparingForSchool(this.getLectureNames());
        this.setWhen("breakfast");
        super.eating(this.getWhen(), "");
        super.setDestination("Bahçelievler Ankaray Station");
        super.walkingTo(this.getDestination());
        super.setDestination("lecture's classroom after I get off the train at Maltepe.");
        super.walkingTo(this.getDestination());
        this.setDrinkCoffee(true);
        this.setHavingChat(true);
        super.beforeLecture(this.isDrinkCoffee(), this.isHavingChat(), "Differential Equations");
        super.listeningLecture(this.getLectureNames(), "Object Oriented Programming", "9.40 AM");
        super.setLunch(false);
        super.setPinball(true);
        super.afterLecture(this.isLunch(), this.isPinball(), "");
        super.listeningLecture(this.getLectureNames(), "Differential Equations", "1.30 PM");
        super.setDestination("Maltepe Ankaray Station");
        super.walkingTo(this.getDestination());
        super.setWhatToDo("tried to relax by surfing on social media, working on personal programming projects from 4 PM to 6 PM.");
        super.freeTime(this.getWhatToDo());
        super.setWhen("dinner");
        super.eating(this.getWhen(), "vegetable soup, schnitzel and pumpkin dessert.");
        super.setWhatToDo("working on personal programming projects for one and a half hour.");
        super.study("Object Oriented Programming laboratory");
        super.setSeriesName("Dr. House Season 4");
        super.watch(this.getSeriesName());
        super.setTime("11 PM");
        super.sleep(this.getTime());
    }
}
