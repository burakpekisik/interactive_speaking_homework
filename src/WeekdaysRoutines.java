//22118080062 - Ali Burak Pekışık

import java.util.Random; //Rastgele sayılar hesaplanacağından dolayı Random kütüphanesi import edilir.
import java.util.Scanner; //Kullanıcıdan girdi alınacağından dolayı Scanner kütüphanesi import edilir.

//Haftaiçi günler için alanadan tasarruf etmek amacıyla önceden kullanılabilecek bir class yazılır. Nesne oluşturmaya gerek görülmediğinden dolayı abstract tanımlandı.
public abstract class WeekdaysRoutines {
	//Günlük çıktısı alınmasında kullanılacak olan değişkenler tanımlanır.
    private String time;
    private String when;
    private String destination;
    private String[] lectureNames;
    private String whatToDo;
    private String seriesName;
    private boolean isLunch;
    private boolean pinball;
    private boolean drinkCoffee;
    private boolean havingChat;
    Scanner scan = new Scanner(System.in); //Kullanıcıdan girdi alabilmek için scan değişkeni tanımlanır.
    Random rand = new Random(); //Rastgele işlemler için rand değişkeni tanımlanır.
    
    //Diğer classlardan extend edilebilmesi için constructor ayarlanır.
    public WeekdaysRoutines(String time, String when, String destination, String[] lectureNames, String whatToDo, String seriesName, boolean isLunch, boolean pinball, boolean drinkCoffee, boolean havingChat) {
        this.time = time;
        this.when = when;
        this.destination = destination;
        this.lectureNames = lectureNames;
        this.whatToDo = whatToDo;
        this.seriesName = seriesName;
        this.isLunch = isLunch;
        this.pinball = pinball;
        this.drinkCoffee = drinkCoffee;
        this.havingChat = havingChat;
    }

    public WeekdaysRoutines() {

    }

    //Fonksiyon başında tanımlanan değişkenler için get-set metodları tanımlanır.
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String[] getLectureNames() {
        return lectureNames;
    }

    public void setLectureNames(String[] lectureNames) {
        this.lectureNames = lectureNames;
    }

    public String getWhatToDo() {
        return whatToDo;
    }

    public void setWhatToDo(String whatToDo) {
        this.whatToDo = whatToDo;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public boolean isLunch() {
        return isLunch;
    }

    public void setLunch(boolean lunch) {
        isLunch = lunch;
    }

    public boolean isPinball() {
        return pinball;
    }

    public void setPinball(boolean pinball) {
        this.pinball = pinball;
    }

    public boolean isDrinkCoffee() {
        return drinkCoffee;
    }

    public void setDrinkCoffee(boolean drinkCoffee) {
        this.drinkCoffee = drinkCoffee;
    }

    public boolean isHavingChat() {
        return havingChat;
    }

    public void setHavingChat(boolean havingChat) {
        this.havingChat = havingChat;
    }

    //Uyanma işlemi için method tanımlanır.
    public void wakingUp(String time) {
        System.out.println("Today I woke up at " + time + " washed my face, brushed my teeth and drank a cup of water.");
    }

    //Okul çantasının hazırlanması ve çıktı vermesi için yazılmış olan fonksiyondur.
    public void preparingForSchool(String[] lectureNames) {
        String lectureNameString = ""; // Değişkeni boş bir string olarak başlatın
        for (String lectureName : lectureNames) {
            lectureNameString += lectureName;
            lectureNameString += " ";
        }

        System.out.println("I prepared my bag for " + lectureNameString + "lectures.");
    }

    //Yeme işlemi için fonksiyon tanımlanır. Yenilen öğüne göre senaryo izler.
    public void eating(String when, String menu) {
        if (when.equals("breakfast")) {
            System.out.println("Today I had breakfast with simple things like bread and cheese with also some olives.");
        }
        else if (when.equals("dinner")) {
            System.out.println("This evening I had dinner with " + menu);
        }
    }

    //Yürüme işlemi için fonksiyon tanımlanır, yürünülen yere göre bir senaryo izler.
    public void walkingTo(String destination) {
        if (destination.replace(" ", "").replace("ç","c").toLowerCase().contains("bahcelievlereankaraystation")) {
            System.out.println("I'm walking to Bahçelievler Ankaray Station to get to the school for my lectures.");
        }
        else if (destination.replace(" ", "").toLowerCase().contains("maltepeankaraystation")) {

            System.out.println("I'm walking to Maltepe Ankaray Station to get to the student dormitory after my lectures.");
        }
        else {
            System.out.println("I'm walking to " + destination);
        }
    }

    //Ders öncesi yapılan aktiviteler hakkında bilgi vermesi için yazılmış olan fonksiyondur, random kütüphesinden faydalanılır.
    public void beforeLecture(boolean drinkCoffee, boolean havingChat, String lectureName) {
        if (drinkCoffee && havingChat) {
            System.out.println("While waiting for " + lectureName + " lecture to start I drank coffee with my friends and also we had chat.");
        }
        else if (drinkCoffee) {
            int randomNumber = rand.nextInt(1, 3);
            if (randomNumber == 1) {
                System.out.println("While waiting for " + lectureName + " lecture to start I drank coffee. The third floors coffee machine makes good coffees.");
            }
            if (randomNumber == 2) {
                System.out.println("While waiting for " + lectureName + " lecture to start I drank coffee. I got It from first floor and It did not taste so good also It was not even a full cup.");
            }
            if (randomNumber == 3) {
                System.out.println("While waitig for " + lectureName + " lecture to start I drank coffee. I got today's coffee from second floor, It wasn't the best in school but It was enough.");
            }
        }
        else if (havingChat) {
            System.out.println("While waiting for " + lectureName + " lecture. I had chat with my friends.");
        }
    }

    //Dinlenilen ders için yazılmış olan fonksiyondur, if-else bloklarıyla kıyaslama temeline dayanır.
    public void listeningLecture(String[] lectureNames, String lectureName, String time) {
        if (lectureNames[0].equals(lectureName)) {
            System.out.println("Today's first lecture was " + lectureName + " and It started at " + time);
        }
        else if (lectureNames[1].equals(lectureName)) {
            System.out.println("Today's second lecture was " + lectureName + " and It started at " + time);
        }
    }

    //Ders sonrası yapılan aktiviteler hakkında bilgi veren fonksiyondur. Belirli durumlara göre hareket eder.
    public void afterLecture(boolean isLunch, boolean pinball, String menu) {
        if (isLunch && pinball) {
            System.out.println("After the lecture we had lunch the menu was " + menu + " after lunch played pinball at university.");
        }
        else if (pinball) {
            System.out.println("After the lecture, I played pinball with 3 of my friends to entartain ourselves.");
        }
        else if (isLunch) {
            System.out.println("After the lecture we got hungry we had lunch. " + menu);
        }
    }

    //Boş zamanda yapılan aktiviteler hakkında bilgi veren fonksiyondur.
    public void freeTime(String whatToDo) {
        int randomNumber = rand.nextInt(1, 2);
        if (randomNumber == 1) {
            System.out.println("I created myself a little bit free time so I " + whatToDo);
        }
        else if (randomNumber == 2) {
            System.out.println("I had a little bit free time so I " + whatToDo);
        }
    }

    //Ders çalışma adına kullanılan fonksiyondur,random fonksiyonundan faydalanılır.
    public void study(String lectureName) {
        int randomNumber = rand.nextInt(1, 2);
        if (randomNumber == 1) {
            System.out.println("In order not to forget what I learned from " + lectureName + " lecture, I have to study.");
        }
        else if (randomNumber == 2) {
            System.out.println("To fully learned what I learned at " + lectureName + " lecture, I have to study.");
        }
    }

    //İzlenilen dizi hakkında bilgi veren fonksiyondur, random fonksiyonundan faydalanılır.
    public void watch(String seriesName) {
        int randomNumber = rand.nextInt(1, 3);
        if (randomNumber == 1) {
            System.out.println("I think I worked enough for today. I'd like to watch some " + seriesName);
        }
        else if (randomNumber == 2) {
            System.out.println("Enough working today now I'd like to watch " + seriesName);
        }
        else if (randomNumber == 3) {
            System.out.println("It's time for favourite part of my day watching " + seriesName);
        }
    }

    //Uyku hakkında bilgi veren fonksiyondur, random fonksiyonundan faydalanılan fonksiyondur.
    public void sleep(String time) {
        int randomNumber = rand.nextInt(1, 3);
        if (randomNumber == 1) {
            System.out.println("By " + time + " I'm tired, so I'd like to get some rest.");
        }
        else if (randomNumber == 2) {
            System.out.println("It's " + time + " and if don't sleep within 5 minutes I will sleep at my desk.");
        }
        else if (randomNumber == 3) {
            System.out.println("It was a good run, now It's time to finish It by sleeping. Time is " + time);
        }
    }

    //Yürüme işlemi için fonksiyon tanımlanır, yürünülen yere göre bir senaryo izler.
    public abstract void PrintDay();
}
