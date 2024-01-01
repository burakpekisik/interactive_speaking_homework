//22118080062 - Ali Burak Pekışık

import java.util.Random; //Rastgele sayılar hesaplanacağından dolayı Random kütüphanesi import edilir.
import java.util.Scanner; //Kullanıcıdan girdi alınacağından dolayı Scanner kütüphanesi import edilir.

//Haftasonu günler için alanadan tasarruf etmek amacıyla önceden kullanılabilecek bir class yazılır. Nesne oluşturmaya gerek görülmediğinden dolayı abstract tanımlandı.
public abstract class WeekendRoutines {
	//Günlük çıktısı alınmasında kullanılacak olan değişkenler tanımlanır.
    private String time;
    private String menu;
    private String when;
    private String destination;
    private String[] lectureNames;
    private String whatToDo;
    private String seriesName;
    private boolean drinkCoffee;
    Scanner scan = new Scanner(System.in); //Kullanıcıdan girdi alabilmek için scan değişkeni tanımlanır.
    Random rand = new Random(); //Rastgele işlemler için rand değişkeni tanımlanır.

    //Diğer classlardan extend edilebilmesi için constructor ayarlanır.
    public WeekendRoutines(String time, String menu, String when, String destination, String[] lectureNames, String whatToDo, String seriesName, boolean drinkCoffee) {
        this.time = time;
        this.menu = menu;
        this.when = when;
        this.destination = destination;
        this.lectureNames = lectureNames;
        this.whatToDo = whatToDo;
        this.seriesName = seriesName;
        this.drinkCoffee = drinkCoffee;
    }

    public WeekendRoutines() {

    }

    //Fonksiyon başında tanımlanan değişkenler için get-set metodları tanımlanır.
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
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

    public boolean isDrinkCoffee() {
        return drinkCoffee;
    }

    public void setDrinkCoffee(boolean drinkCoffee) {
        this.drinkCoffee = drinkCoffee;
    }
    
    //Uyanma işlemi için method tanımlanır.
    public void wakingUp(String time) {
        System.out.println("Even though It's now weekend I love waking up early. Today I woke up at " + time + " washed my face, brushed my teeth and drank a cup of water.");
    }

    //Yeme işlemi için fonksiyon tanımlanır. Yenilen öğüne göre senaryo izler.
    public void eating(String when, String menu) {
        if (when.equals("breakfast")) {
            System.out.println("Today is weekend so the breakfast in student dormitory is more special than weekdays. I had breakfast with Menemen and with some fries.");
        }
        else if (when.equals("dinner")) {
            System.out.println("This evening I had dinner with " + menu);
        }
        else {
            System.out.println(menu);
        }
    }

    //Yürüme işlemi için fonksiyon tanımlanır, yürünülen yere göre bir senaryo izler.
    public void walkingTo(String destination) {
        if (destination.replace(" ", "").replace("ç","c").toLowerCase().contains("bahcelievlereankaraystation")) {
            System.out.println("I'm walking to Bahçelievler Ankaray Station to get to the student dormitory.");
        }
        else if (destination.replace(" ", "").toLowerCase().contains("maltepeankaraystation")) {

            System.out.println("I'm walking to Maltepe Ankaray Station to get to the school for my lectures.");
        }
        else {
            System.out.println("I'm walking to " + destination);
        }
    }

    //Boş zamanda yapılan aktivitenn yazılmasını sağlar, random metodu kullanılarak çeşitlilik sağlar.
    public void freeTime(String whatToDo) {
        int randomNumber = rand.nextInt(1, 2);
        if (randomNumber == 1) {
            System.out.println("I created myself a little bit free time so I " + whatToDo);
        }
        else if (randomNumber == 2) {
            System.out.println("I had a little bit free time so I " + whatToDo);
        }
    }

    //İzlenilen dizinin yazdrıılmasını sağlar, random metodu ile çeşitlililk sağlanır.
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
    
    //Uyuma işlemi için yazılan metodtur, çıktısının rastgele olması adına random kütüphesinden faydalananılır.
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
    
    //Çalışılan dersin yazdırıldığı fonksiyondur. Random fonksiyonundan faydalanılır.
    public void study(String lectureName) {
        int randomNumber = rand.nextInt(1, 2);
        if (randomNumber == 1) {
            System.out.println("In order not to forget what I learned from " + lectureName + " lecture, I have to study.");
        }
        else if (randomNumber == 2) {
            System.out.println("To fully learned what I learned at " + lectureName + " lecture, I have to study.");
        }
    }

    //Günün çıktısının alınmasını sağlayan fonksiyondur, her class'ta farklı olduğundan abstract tanımlandı.
    public abstract void PrintDay();
}
