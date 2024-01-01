//22118080062 - Ali Burak Pekışık

import java.util.Random;
import java.util.Scanner;

public class Interactive {
    private Scanner scanner = new Scanner(System.in); //Kullanıcıdan girdi alınmak amacıyla scanner nesnesi oluşturulur.
    private Random random = new Random(); //Uygulamaya rastgelelik katmak amacıyla random nesnesi oluşturulur.
    private String choice; //Kullanıcı girdilerinde kullanılmak amacıyla "choice" isimli string değişkeni oluşturulur.
    private Tuesday tuesday = new Tuesday(); //Günlük çıktılarında kullanılmak amacıyla salı günü için nesne oluşturulur.
    private Wednesday wednesday = new Wednesday(); //Günlük çıktılarında kullanılmak amacıyla çarşamba günü için nesne oluşturulur.
    private Thursday thursday = new Thursday(); //Günlük çıktılarında kullanılmak amacıyla perşembe günü için nesne oluşturulur.
    private Friday friday = new Friday(); //Günlük çıktılarında kullanılmak amacıyla cuma günü için nesne oluşturulur.
    private Saturday saturday = new Saturday(); //Günlük çıktılarında kullanılmak amacıyla cumartesi günü için nesne oluşturulur.
    private Sunday sunday = new Sunday(); //Günlük çıktılarında kullanılmak amacıyla pazar günü için nesne oluşturulur.
    private Monday monday = new Monday(); //Günlük çıktılarında kullanılmak amacıyla pazartesi günü için nesne oluşturulur.

    //Kategori seçimini sağlayan fonksiyon:
    public void selectCategory() {
        System.out.println("Choose an activity to get to know me?\n" +
                "- Game\n" +
                "- Argument\n" +
                "- Entertainment\n" +
                "- Food\n" +
                "- Shopping\n" +
                "- Diary\n" +
                "- Other\n");
        System.out.print("Your Choice: "); 
        choice = scanner.next(); //Kullanıcıdan string girdisi alınır.

        //Kullanıcıdan alınan girdiye göre kategoriler için fonksiyonlar çağırılır.
        if (choice.equals("1") || choice.equalsIgnoreCase("game")) {
            gameActivity();
        } else if (choice.equals("2") || choice.equalsIgnoreCase("argument")) {
            argumentActivity();
        } else if (choice.equals("3") || choice.equalsIgnoreCase("entertainment")) {
            entertainmentActivity();
        } else if (choice.equals("4") || choice.equalsIgnoreCase("food")) {
            foodActivity();
        } else if (choice.equals("5") || choice.equalsIgnoreCase("shopping")) {
            shoppingActivity();
        } else if (choice.equals("6") || choice.equalsIgnoreCase("diary")) {
            diaryActivity();
        } else if (choice.equals("7") || choice.equalsIgnoreCase("other")) {
            otherActivity();
        } else {
            System.out.println("Invalid input please try again!\n");
            selectCategory(); //Yanlış girdi durumunda tekrardan fonksiyon çağırılır.
        }
    }
    
    //Oyun hakkında bilgi istendiği zaman çağırılan fonksiyon, kullanıcıdan aldığı girdilere göre interaktif metinler sunar.
    private void gameActivity() {
        System.out.println("I love playing video games, as a guy who falls in love with cars I mostly play racing games. Also for some action I also play action type games. How about you, which type of games do you like most?");
        System.out.println(
                "- Racing\n" +
                "- Action\n" +
                "- RPG\n" +
                "- Puzzle\n" +
                "- Casual\n" +
                "- Sports\n" );
        System.out.print("Your Choice: ");
        choice = scanner.next(); //Kullanıcıdan string girdisi alınır.

        //Kullanıcıdan alınan girdilere göre farklı çıktılar sunulur.
        if (choice.equals("1") || choice.equalsIgnoreCase("racing")) {
            System.out.println("Your just like me maybe we should go out for some to a computer cafe, would you like to join me?");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Thanks! You know where to contact me. How about we talk about another topic? :)");
                selectContinue();

            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Your lost maybe next time! Would you like to try another topic?");
                selectContinue();
            }
        } else if (choice.equals("2") || choice.equalsIgnoreCase("action")) {
            System.out.println("Action increases adrenaline, just like me I think you also like hype! We should talk sometime, would you?");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Thanks! I will wait for your response. Let's talk about something shall we? :)");
                selectContinue();

            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Your lost maybe next time! Would you like to try another topic?");
                selectContinue();
            }
        } else if (choice.equals("3") || choice.equalsIgnoreCase("RPG")) {
            System.out.println("RPG games look good but they are also time consuming, I don't have time for them now but maybe another time. Maybe you can teach me how to play?");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Thanks! I'll find you for It! Let's talk about something shall we? :)");
                selectContinue();

            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Okay, then I'll teach myself. Would you like to try another topic?");
                selectContinue();
            }
        } else if (choice.equals("4") || choice.equalsIgnoreCase("puzzle")) {
            System.out.println("I hate puzzle games. I'd rather play them in real life than on computer. But I always appreciate try something new with friends, how about we both try It?");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Teaching is hard and you accepted It thank you very much! I'll find you for It! Let's talk about something shall we? :)");
                selectContinue();

            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Okay, then I'll teach myself. Would you like to try another topic?");
                selectContinue();
            }
        } else if (choice.equals("5") || choice.equalsIgnoreCase("casual")) {
            System.out.println("I also like casual games. They aren't very time consuming and also relaxing, nowadays I play Stardew Valley and It can played as coop maybe you want to join me?");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Very good, I'll send you an invitation! Let's talk about something shall we? :)");
                selectContinue();

            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Okay then, I'll play alone with just music. Would you like to try another topic?");
                selectContinue();
            }
        } else if (choice.equals("6") || choice.equalsIgnoreCase("sports")) {
            System.out.println("Most of men like playing sports games like FIFA and Pes but I'm not really fond of them and can't say no when a friend asks If we can play them. Would you like to give a try?");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Very good, I'll send you the location and time! Let's talk about something shall we? :)");
                selectContinue();

            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Okay then, I'll find someone else. Would you like to try another topic?");
                selectContinue();
            }
        } else {
            System.out.println("Invalid input please try again!\n");
            gameActivity(); //Yanlış girdi durumunda fonksiyon tekrar çağırılır.
        }
    }
    
    //En son kiminle tartıştın sorusu için sunulan interaktif cevaplar verilen fonksiyon.
    private void argumentActivity() {
        System.out.println("Let's talk about our negative sides, who did you argue with last?");
        System.out.println(
                        "(1) My friend\n" +
                        "(2) My family\n" +
                        "(3) Traffic\n" );
        System.out.print("Your Choice: ");
        choice = scanner.next(); //Kullanıcıdan string girdisi alınır.

        //Alınan girdiye göre interaktif cevaplar sunulur.
        if (choice.equals("1") || choice.equalsIgnoreCase("my friend")) {
            System.out.println("Are you a university student?");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Most of us in the university are from different cities and we have to always look behind our back so there will always be arguments but in the end It should end happy. I hope, I could express my feelings!");

            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Then I think you are a working person, there will always be arguments in professional life, in the if you think the person in front of you isn't a bad person then try to solve the argument because arguments can also effect your professional life.");
            }

            System.out.println("I hope, I could help you out. Let's talk about something shall we? :)");
            selectContinue();
        } else if (choice.equals("2") || choice.equalsIgnoreCase("my family")) {
            System.out.println("Everybody make mistakes even family. But don't forget exceptions can happen but in the everybody can go but family stays. Don't break your family's heart for small things. I hope you understand that's the way I look at life, would you like to continue with something else?");
            selectContinue();
        } else if (choice.equals("3") || choice.equalsIgnoreCase("traffic")) {
            System.out.println("Sometimes we don't have a wonderful day, but we have to keep our anger in control otherwise small we arguments we have can completely change our lives in negative way. I hope I could express feelings. Would you like to talk about another topic?");
            selectContinue();
        } else {
            System.out.println("Invalid input please try again!\n");
            argumentActivity(); //Hatalı bir girdi durumunda fonksiyon tekrar çağırılı
        }
    }

    //Eğlence aktivitileri hakkında interatif konuşmalar sağlayan fonksiyon.
    private void entertainmentActivity() {
        System.out.println("In our lives, everybody can have tiring days or bad days but in the end everybody should entertain themselves in order to continue their lives. For example, when I'm sad or depressed, I try to code a program, hang out with a friend or play a video game. What do you do when you get bored?"
        + "\n(1) Hang Out\n" +
                "(2) Working On My Job\n" +
                "(3) Playing Video Games");
        System.out.print("Your Choice: ");
        choice = scanner.next(); //Verilen seçenekler için kullanıcıdan string girdisi alınır.
        if (choice.equals("1") || choice.equalsIgnoreCase("hang out")) {
            System.out.println("Hanging out is always a good idea when including friends It's even better. Hanging out helps people socialize, helps finding new things to do and also in a different way helps people to look life in a different perspective. Would you like to talk about a different topic?");
            selectContinue();
        } else if (choice.equals("2") || choice.equalsIgnoreCase("working on my job")) {
            System.out.println("I see myself as a workaholic. So I feel sad, one of the things I do is working on my job. Working on my job makes me forget about my problem and helps recover myself quickly. I think you share the same idea with me. Shall we talk about a different topic?");
            selectContinue();
        } else if (choice.equals("3") || choice.equalsIgnoreCase("playing video games")) {
            System.out.println("Playing video games is also a great option just like hanging out with friends is better than alone, I think this applies in playing video games too. I hope you share the same thoughts with me! Would you like to talk about a different topic.");
            selectContinue();
        } else {
            System.out.println("Invalid input please try again!\n");
            entertainmentActivity(); //Yanlış bir girdi durumunda fonksiyon tekrar çağırılır.
        }
    }

    //Yemek konusunda interaktif konuşmalar sağlayan fonksiyon.
    private void foodActivity() {
        System.out.println("As a student who lives in a different city, I live in a dorm with 3 other students. For breakfast and dinner we usually eat at our dorm's dining hall. But our dorm doesn't serve lunch so we have to order from outside or have lunch at school. Weekdays lunch is available at school but weekends we mostly order from outside. We prefer mostly meat related foods like chicken döner, meatballs, hamburger and etc. How about where do you usually eat?"
        + "\n(1) Order From Outside\n" +
                "(2) Eat At Home");

        System.out.print("Your Choice: ");
        choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
        if (choice.equals("1") || choice.equalsIgnoreCase("order from outside")) {
            System.out.println("There are many things to order from outside. From home made food to 5 star Korean food you can order almost anything but as a student It becomes quite expensive after a while. Maybe we can go on a dinner sometime?");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Thanks! You know where to contact me. How about we talk about another topic? :)");

            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Your lost maybe you'll consider It another time. Would you like to try another topic?");
            }
        } else if (choice.equals("2") || choice.equalsIgnoreCase("eat at home")) {
            System.out.println("I miss my mom's home made food she cooks so well, maybe your mom can cook so well that this is the reason why you prefer eating at home there also many other reasons why you chose eating at home but let's stay here. Would you like to invite me for dinner?");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Thanks! You know where to contact me. How about we talk about another topic? :)");

            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Your choice, I can't get mad because of your rejection. Would you like to try another topic?");
            }
        } else {
            System.out.println("Invalid input please try again!\n");
            foodActivity(); //Yanlış bir girdi durumunda fonksiyon tekrardan çağırılır.
        }

        //Birden fazla konuşması istenmesi durumu göz önüne alınarak while içine alındı
        while (true) {
            System.out.println("Let's talk about something different, what about your food favourite type?" +
                    "\n(1) Meat Foods" +
                    "\n(2) Vegetable Foods" +
                    "\n(3) Desserts");

            System.out.print("Your Choice: ");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            if (choice.equals("1") || choice.equalsIgnoreCase("meat foods")) {
                System.out.println("I also like meat too but meat is so expensive maybe we can eat our family's house. Would you like to talk about a different topic?");
                selectContinue();
                break;
            } else if (choice.equals("2") || choice.equalsIgnoreCase("vegetable foods")) {
                System.out.println("Vegetables are also important for our body, mostly I don't prefer them as a primary food. Shall we talk about a different topic?");
                selectContinue();
                break;
            } else if (choice.equals("3") || choice.equalsIgnoreCase("desserts")) {
                System.out.println("Dessert isn't main meal but after the meal brings happiness. Would you like to talk about a different topic.");
                selectContinue();
                break;
            } else {
                System.out.println("Invalid input please try again!\n");
            }
        }
    }

    //Alışverş hakkında interaktif konuşma sağlayan fonksiyon.
    private void shoppingActivity() {
        System.out.println("Nowadays everybody does shopping from internet, local shops, social media and etc. As a student I mostly prefer shopping from online, I think It's cheaper compared to shopping malls in Ankara. What type of shop do you like most?" +
                "\n(1) Local Shops" +
                "\n(2) Internet" +
                "\n(3) Social Media");

        System.out.print("Your Choice: ");
        choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
        if (choice.equals("1") || choice.equalsIgnoreCase("local shops")) {
            System.out.println("I use local shops for mostly buying junk food. I mostly shop at A101 store near my dorm. Which franchise store do you prefer most?" +
                    "\n(1) A101" +
                    "\n(2) ŞOK" +
                    "\n(3) Bim");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            if (choice.equals("1") || choice.equalsIgnoreCase("A101")) {
                System.out.println("As I mentioned I also use A101 because I can find what I'm in need and also cheaper compared to other stores. Would you like to continue with another topic?");
                selectContinue();
            } else if (choice.equals("2") || choice.equalsIgnoreCase("Şok")) {
                System.out.println("I personally don't know much about Şok shops because there aren't near my house or dorm. Let's talk about something different, shall we?");
                selectContinue();
            } else if (choice.equals("3") || choice.equalsIgnoreCase("bim")) {
                System.out.println("Other than A101, I also do my shopping from Bim near my house. I haven't visited any Bim at Ankara but I like our local Bim near our house. Would you like to talk something different?");
                selectContinue();
            } else {
                System.out.println("Invalid input please try again!\n");
                shoppingActivity(); //Yanlış girdi durumunda fonksiyon tekrar çağırılır.
            }
        } else if (choice.equals("2") || choice.equalsIgnoreCase("internet")) {
            System.out.println("As I mentioned my favourite type of shopping is shopping from internet, I mostly use Amazon, Hepsiburada, N11 and Trendyol. Which one of them do you use most?" +
                    "\n(1) Amazon" +
                    "\n(2) Hepsiburada" +
                    "\n(3) N11" +
                    "\n(4) Trendyol");
            System.out.print("Your Choice: ");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            if (choice.equals("1") || choice.equalsIgnoreCase("amazon")) {
                System.out.println("In four of these internet websites, I personally prefer Amazon most same as you. Because they are cheap, has great customer service and Prime Video includes good series. I hope you share similar thoughts as me. Would you like to continue with another topic?");
                selectContinue();
            } else if (choice.equals("2") || choice.equalsIgnoreCase("hepsiburada")) {
                System.out.println("I think Hepsiburada is a good website for shopping their Hepsipay and Hepsijet systems work well and also with their Premium membership they also include BluTV, which is great platform watching Turkish series, I hope you chose Hepsiburada sharing similar with me. Let's talk about something different, shall we?");
                selectContinue();
            } else if (choice.equals("3") || choice.equalsIgnoreCase("N11")) {
                System.out.println("I like using N11 but compared to Hepsiburada and Amazon, I use N11 less. I think their coupon system works well and you chose N11 because of this. Would you like to talk something different?");
                selectContinue();
            } else if (choice.equals("4") || choice.equalsIgnoreCase("trendyol")) {
                System.out.println("Personally, I usually don't prefer Trendyol because I think they less discounts than other three and also I don't like their customer support because they can't solve any problem. Other than that I use Trendyol for buying my clothes and I think also chose Trendyol for that. Let's talk something different, would you?");
                selectContinue();
            } else {
                System.out.println("Invalid input please try again!\n");
                shoppingActivity(); //Yanlış girdi durumunda fonksiyon tekrar çağırılır.
            }
        } else if (choice.equals("3") || choice.equalsIgnoreCase("social media")) {
            System.out.println("I don't trust any of the dealers at social media, they all look like a scammer to me but maybe I'm too biased about It, I hope I'm wrong. Would you like talk about another topic?");
            selectContinue();
        } else {
            System.out.println("Invalid input please try again!\n");
            shoppingActivity(); //Yanlış girdi durumund fonksiyon tekrar çağırılır.
        }
    }

    //Yazılan günlükler hakkında tekrar bilgi alınmasını sağlayan fonksiyon.
    private void diaryActivity() {
        System.out.println("Would you like to see what I do for a week, here is a list of days of whole week you can choose any day you want to see: " +
                "\n12.12.2023 - Tuesday" +
                "\n13.12.2023 - Wednesday" +
                "\n14.12.2023 - Thursday" +
                "\n15.12.2023 - Friday" +
                "\n16.12.2023 - Saturday" +
                "\n17.12.2023 - Sunday" +
                "\n18.12.2023 - Monday");

        //Birden fazla günü inceleme durumu göz önüne alınarak while döngüsü içerisine alındı
        while (true) {
            System.out.print("Your Choice: ");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            System.out.println();
            if (choice.equalsIgnoreCase("12.12.2023") || choice.equalsIgnoreCase("Tuesday")) {
                tuesday.PrintDay(); //Girilen girdiye göre salı günü classının günü yazdırma fonksiyonu çağırılır.
            } else if (choice.equalsIgnoreCase("13.12.2023") || choice.equalsIgnoreCase("Wednesday")) {
                wednesday.PrintDay(); //Girilen girdiye göre çarşamba günü classının günü yazdırma fonksiyonu çağırılır.
            } else if (choice.equalsIgnoreCase("14.12.2023") || choice.equalsIgnoreCase("Thursday")) {
                thursday.PrintDay(); //Girilen girdiye göre perşembe günü classının günü yazdırma fonksiyonu çağırılır.
            } else if (choice.equalsIgnoreCase("15.12.2023") || choice.equalsIgnoreCase("Friday")) {
                friday.PrintDay(); //Girilen girdiye göre cuma günü classının günü yazdırma fonksiyonu çağırılır.
            } else if (choice.equalsIgnoreCase("16.12.2023") || choice.equalsIgnoreCase("Saturday")) {
                saturday.PrintDay(); //Girilen girdiye göre cumartesi günü classının günü yazdırma fonksiyonu çağırılır.
            } else if (choice.equalsIgnoreCase("17.12.2023") || choice.equalsIgnoreCase("Sunday")) {
                sunday.PrintDay(); //Girilen girdiye göre pazar günü classının günü yazdırma fonksiyonu çağırılır.
            } else if (choice.equalsIgnoreCase("18.12.2023") || choice.equalsIgnoreCase("Monday")) {
                monday.PrintDay(); //Girilen girdiye göre pazartesi günü classının yazdırma fonksiyonu çağırılır.
            }
            
            //Kullanıcının devam edip etmeyeceğinin kontrolünü sağlayan fonksiyon.
            System.out.println("\nWould you like to see another day's diary?");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            if (choice.equalsIgnoreCase("no")) {
                System.out.println("Maybe you don't want to see my diary but maybe you want to talk about another topic?");
                selectContinue();
                break; //Döngüden çıkış sağlanır.
            }
        }
    }
    
    //Rastgele farklı konular hakkında konuşulmasını sağlayan fonksiyon.
    private void otherActivity() {
        int randomNumber = random.nextInt(1, 4); //Rastgele sayı seçimi yapılır ve sınırları soru sayısına göre ayarlanır.
        if (randomNumber == 1) { //Uyanma saati hakkında konuşma sağlayan if bloğu
            System.out.println("If there isn't a specific situation I usually wake up between 7 AM - 8 AM. How about you?" +
                    "\n(1) 4 AM - 7 AM" +
                    "\n(2) 7 AM - 12 PM" +
                    "\n(3) 12 PM - 3 PM" +
                    "\n(4) 3 PM - 9 PM");

            System.out.print("Your Choice: ");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            //Soruya verilen cevaplara göre çıktı alınır.
            switch (choice) {
                case "1" -> {
                    System.out.println("Congratulations I think a busy program that you wake up this early, I also want to wake up that time just like you. Would you like to continue with another topic?");
                    selectContinue();
                }
                case "2" -> {
                    System.out.println("I think you are just like me, you prefer not to wake up too late or too early and I agree with you. Let's talk about something different, shall we?");
                    selectContinue();
                }
                case "3" -> {
                    System.out.println("I think you are a bit late to start the day, maybe you should consider changing your wake up time. Would you like to talk something different?");
                    selectContinue();
                }
                case "4" -> {
                    System.out.println("When do you even sleep then, you should totally check your daily schedule, It will be good for you. Would you like to talk something different?");
                    selectContinue();
                }
                default -> {
                    System.out.println("Invalid input please try again!\n");
                    otherActivity(); //Hatalı girdi durumunda fonksiyon tekrar çağırılır.
                }
            }
        }

        if (randomNumber == 2) { //Kahve içme sayısı hakkında interaktif konuşma sağlayan if bloğu.
            System.out.println("How many coffees do you drink a day? I personally drink about 2 or 3 coffees per day maybe you prefer tea more but I don't like tea as much as coffee." +
                    "\n(1) 1-2" +
                    "\n(2) 3-4" +
                    "\n(3) 5-6" +
                    "\n(4) None");

            System.out.print("Your Choice: ");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            
            //Kullanıcıdan alının girdiye göre çıktılar verilir.
            switch (choice) {
                case "1" -> {
                    System.out.println("I think that's enough for call it a day. Would you like to continue with another topic?");
                    selectContinue();
                }
                case "2" -> {
                    System.out.println("I think this might too much coffee but if you think it's good then I can't say anything bad about It. Let's talk about something different, shall we?");
                    selectContinue();
                }
                case "3" -> {
                    System.out.println("I think that's too much and you should consider changing to another drink maybe like water It's also good for your body. Would you like to talk something different?");
                    selectContinue();
                }
                case "4" -> {
                    System.out.println("I know many people don't like drinking coffee maybe you are one of them too, I completely understand you. Would you like to talk something different?");
                    selectContinue();
                }
                default -> {
                    System.out.println("Invalid input please try again!\n");
                    otherActivity(); //Hatalı girdi durumunda fonksiyon tekrar çağırılır.
                }
            }
        }

        if (randomNumber == 3) { //Ders sayısı hakkında interaktif konuşma sağlayan if bloğu.
            System.out.println("Most of the weekdays I have about 1 or 2 lessons per day. And I think that's enough for me because I'm not very busy and I can spare time for my projects. How about you, how many lessons do you have per day on average?" +
                    "\n(1) 1-2" +
                    "\n(2) 3-4" +
                    "\n(3) 5-6" +
                    "\n(4) None");

            System.out.print("Your Choice: ");
            choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
            
            //Kullanıcıdan alınan girdiye göre farklı çıktılar verilir, farklılık olması amacıyla switch bloğu kullanıldı.
            switch (choice) {
                case "1" -> {
                    System.out.println("I think you are also like I hope they are not very long lessons so that you can spare time for yourself. Would you like to continue with another topic?");
                    selectContinue();
                }
                case "2" -> {
                    System.out.println("Maybe you are 3rd grader or 4th grader that's why you have so much lesson. I hope you can manage all of them. Let's talk about something different, shall we?");
                    selectContinue();
                }
                case "3" -> {
                    System.out.println("Woah, are you medicine student or what, that's way too much :( Would you like to talk something different?");
                    selectContinue();
                }
                case "4" -> {
                    System.out.println("I asked this question considering everyone uses this program is a student but maybe you are a working person that's why you choose 'None', I hope you are happy. Would you like to talk something different?");
                    selectContinue();
                }
                default -> {
                    System.out.println("Invalid input please try again!\n");
                    otherActivity(); //Hatalı girdi durumunda fonksiyon tekrar çağırılır.
                }
            }
        }
    }

    //Konuşmaya devam edilip edilmeyeceğinin girdisini almayı sağlayan fonksiyon, proje içerisinde yerden tasarruf sağlamak amacıyla sıklıkla kullanıldı.
    private void selectContinue() {
        choice = scanner.next(); //Kullanıcıdan string girdisi alınır.
        if (choice.equalsIgnoreCase("yes")) { //Kullanıcıdan 'yes' girdisi alınırsa sohbete devam edilir.
            selectCategory();
        } else if (choice.equalsIgnoreCase("no")) { //Kullanıcıdan 'no' girdisi alınırsa sohbet bitirilir.
            System.out.println("Okay then see you later, hope you have a great day!");
        } else {
            System.out.println("Invalid input, maybe you want to try again? Please enter your choice: ");
            selectContinue(); //Hatalı giriş yapılması durumunda kullanıcıdan tekrardan giriş istenir.
        }
    }
}
